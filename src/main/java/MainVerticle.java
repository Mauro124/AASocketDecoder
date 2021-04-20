//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetServerOptions;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class MainVerticle extends AbstractVerticle {
    private int listenPort;
    private String hostRtdm;
    private int portRtdm;
    private Boolean logJSON;

    public MainVerticle() {
        Arguments arguments = Arguments.getInstance();
        this.listenPort = arguments.getListenPort();
        this.hostRtdm = arguments.getHostRTDM();
        this.portRtdm = arguments.getPortRTDM();
        this.logJSON = arguments.getLogJson();
    }

    public void start() {
        NotificationDecoder notificationDecoder = new NotificationDecoder();
        SendRTDM sendRTDM = new SendRTDM();
        this.logInitial();

        int a;
        for(a = 0; a <= 100; a++){
            this.socket(notificationDecoder, sendRTDM);
        }
    }

    private void logInitial() {
        AAsocketDecoder.logger.info("Server socket UP " + getCurrentTimeStamp());
        AAsocketDecoder.logger.info(this.listenPort);
        AAsocketDecoder.logger.info("Log Json: " + this.logJSON);
        AAsocketDecoder.logger.info("Host Rtdm: " + this.hostRtdm);
        AAsocketDecoder.logger.info("Port Rtdm: " + this.portRtdm);
        AAsocketDecoder.logger.info(" ");
        AAsocketDecoder.logger.info("FECHA, HORA, MINUTO, SEGUNDO, COD_ACTUACION, NUM_TELEFONO, EVENTO");
    }

    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        return sdfDate.format(now);
    }

    public static String getCurrentTimeStampForNotification() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        String hour = String.valueOf(now.getHours());
        String minutes = String.valueOf(now.getMinutes());
        String seconds = String.valueOf(now.getSeconds());

        return strDate + "," + hour + "," + minutes + "," + seconds;
    }

    private void socket(NotificationDecoder notificationDecoder, SendRTDM sendRTDM) {
        VertxOptions vxOptions = new VertxOptions();
        vxOptions.setBlockedThreadCheckInterval(1L);
        vxOptions.setWorkerPoolSize(100);

        Vertx vertx = Vertx.vertx(vxOptions);
        NetServerOptions netServerOptions = (new NetServerOptions()).setPort(this.listenPort).setHost("0.0.0.0")
            .setReceiveBufferSize(999999999).setUsePooledBuffers(true);
        NetServer server = vertx.createNetServer(netServerOptions);
        server.connectHandler((sock) -> sock.handler((buffer) -> {
            int lengthBuffer = buffer.getBytes().length;
            byte[] bufferBytes = buffer.getBytes();

            ByteArrayInputStream bis = new ByteArrayInputStream(bufferBytes);
            byte[] headArrayByte = this.getHeadArrayByte(bis);

            if (this.logJSON) {
                try {
                    writeNotification(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                AAsocketDecoder.logger.info("headArrayByte: " + headArrayByte[0]);
                AAsocketDecoder.logger.info("Buffer: " + buffer);
                AAsocketDecoder.logger.info("Longitud del buffer: " + lengthBuffer);
                AAsocketDecoder.logger.info("BlockedThreadCheckInterval: " + vxOptions.getBlockedThreadCheckInterval());
                AAsocketDecoder.logger.info("InternalBlockingPoolSize: " + vxOptions.getInternalBlockingPoolSize());
                AAsocketDecoder.logger.info("QuorumSize: " + vxOptions.getQuorumSize());
                AAsocketDecoder.logger.info("WorkerPoolSize: " + vxOptions.getWorkerPoolSize());
                AAsocketDecoder.logger.info("WriteQueueFull: " + sock.writeQueueFull());
            }


            ByteArrayOutputStream bos = new ByteArrayOutputStream(lengthBuffer);

            Buffer bufferResponse = this.responseToAltamira(headArrayByte);
            sock.write(bufferResponse);

            //int lengthNotification = this.getLengthNotification(headArrayByte);
            int lengthNotification = lengthBuffer - 4;
            try {
                this.writeByteArraysOutput(lengthNotification, bis, bos);
            } catch (IOException e) {
                AAsocketDecoder.logger.info(e.getMessage());
                e.printStackTrace();
            }
            byte[] byteArray = bos.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            HashMap notification = notificationDecoder.process(byteArrayInputStream, this.logJSON);
            sendRTDM.request(notification);

            try {
                if (sock.writeQueueFull()) {
                    AAsocketDecoder.logger.info("Socket queue full");
                    sock.pause();
                    AAsocketDecoder.logger.info("Socket drain");
                    sock.drainHandler((done) -> sock.resume());
                }
            } catch (Exception var16) {
                AAsocketDecoder.logger.info("Socket error: " + var16.getMessage());
            }

            sock.exceptionHandler((event) -> AAsocketDecoder.logger.info("Socket error: " + event.getMessage()));
        })).listen();
    }

    private byte[] getHeadArrayByte(ByteArrayInputStream bis) {
        int byte4 = bis.read() >> 24 & 255;
        int byte3 = bis.read() >> 16 & 255;
        int byte2 = bis.read() >> 8 & 255;
        int byte1 = bis.read() & 255;
        if (this.logJSON) {
            AAsocketDecoder.logger.info("byte4:" + byte4);
            AAsocketDecoder.logger.info("byte3:" + byte3);
            AAsocketDecoder.logger.info("byte2:" + byte2);
            AAsocketDecoder.logger.info("byte1:" + byte1);
        }

        return new byte[]{(byte)byte1, (byte)byte2, (byte)byte3, (byte)byte4, 0, 0};
    }

    private void writeNotification(Buffer buffer) throws IOException {
        int id = (int)(Math.random() * 100 + 1);
        String workingDir = System.getProperty("user.dir");
        BufferedWriter writer = new BufferedWriter(new FileWriter(workingDir + "/notificacion-"+id+".bin"));
        writer.write(buffer.toString());
        writer.close();
    }

    private int getLengthNotification(byte[] headByteArray) {
        int lengthNotification = headByteArray[0];
        if (lengthNotification > 0) {
            if (headByteArray[1] > 0) {
                lengthNotification = headByteArray[0] + 512;
            } else if (headByteArray[2] > 0) {
                lengthNotification = headByteArray[0] + 768;
            }
        } else {
            lengthNotification = headByteArray[0] + 256;
        }

        if (this.logJSON) {
            AAsocketDecoder.logger.info("Length: " + lengthNotification);
        }
        return lengthNotification;
    }

    private Buffer responseToAltamira(byte[] byteArray) {
        Buffer bufferResponse = Buffer.buffer();

        for(int a = 0; a < byteArray.length; ++a) {
            bufferResponse.appendByte(byteArray[a]);
        }
        return bufferResponse;
    }

    private void writeByteArraysOutput(int lengthNotification, ByteArrayInputStream bis, ByteArrayOutputStream bos) throws IOException {
        for(int a = 0; a < lengthNotification; ++a) {
            int bisRead = bis.read();
            if (bisRead > -1) {
                //AAsocketDecoder.logger.info("BISREAD: " + bisRead);
                bos.write(bisRead);
            }

            bos.flush();
        }
    }
}
