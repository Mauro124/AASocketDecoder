import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

public class AAsocketDecoder {
    static Logger logger;

    public static void main(String[] args){
        Arguments arguments = Arguments.getInstance();

        int listenPort = 20200;
        String hostRtdm = "rtdmtesting.rtd.temu.com.uy";
        int portRtdm = 7980;
        boolean logJSON = false;
        int version = 1;

        CommandLineParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("listenPort", true, "Puerto socket");
        options.addOption("hostRtdm", true, "Host de RTDM");
        options.addOption("portRtdm", true, "Puerto de RTDM");
        options.addOption("logJSON", true, "Loguea el JSON decodificado");
        options.addOption("version", true, "Version");
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
            String aux;
            if (cmd.hasOption("listenPort")) {
                aux = cmd.getOptionValue("listenPort");
                listenPort = Integer.parseInt(aux);
            } else {
                logger.error("Missing v option");
            }

            if (cmd.hasOption("logJSON")) {
                aux = cmd.getOptionValue("logJSON");
                logJSON = Boolean.parseBoolean(aux);
            } else {
                logger.error("Missing v option");
            }

            if (cmd.hasOption("hostRtdm")) {
                aux = cmd.getOptionValue("hostRtdm");
                hostRtdm = aux;
            } else {
                logger.error("Missing v option");
            }

            if (cmd.hasOption("portRtdm")) {
                aux = cmd.getOptionValue("portRtdm");
                portRtdm = Integer.parseInt(aux);
            } else {
                logger.error("Missing v option");
            }

            if (cmd.hasOption("version")) {
                aux = cmd.getOptionValue("version");
                version = Integer.parseInt(aux);
            } else {
                logger.error("Missing v option");
            }

        } catch (ParseException var) {
            logger.error("Error para parsear el comando de entrada" + var);
        }

        arguments.setLogJson(logJSON);
        arguments.setHostRTDM(hostRtdm);
        arguments.setPortRTDM(portRtdm);
        arguments.setListenPort(listenPort);
        arguments.setVersion(version);

        System.setProperty("version", String.valueOf(version));
        System.setProperty("path", "/sas/AAsocketDecoder/logs");
        if(logJSON){
            System.setProperty("debug", ".debug.");
        } else {
            System.setProperty("debug", ".");
        }

        logger = Logger.getLogger(AAsocketDecoder.class);

        MainVerticle mainVerticle = new MainVerticle();
        mainVerticle.start();

    }
}
