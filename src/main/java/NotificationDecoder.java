import com.oss.asn1.*;
import notificacionexternas.Notificacionexternas;
import notificacionexternas.ppif_interfazexterna.*;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;

public class NotificationDecoder {

    static {
        try {
            Notificacionexternas.initialize();
        } catch (Exception e) {
            AAsocketDecoder.logger.info("Error de inicializacion: " + e);
        }
    }

    private static Coder coder = Notificacionexternas.getBERCoder();

    NotificationDecoder() {}

    public HashMap<String, String> process(ByteArrayInputStream byteArrayInputStream, boolean logJSON) {
        HashMap<String,String> notificacion = new HashMap<>();

        coder.disableDecoderConstraints();

        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(byteArrayInputStream);

            while (bis.available() > 0) {

                OpenType berRecord = coder.decode(bis, new OpenType());

                ByteArrayInputStream bais = new ByteArrayInputStream(berRecord.getEncodedValue());
                LeadingType record = coder.decode(bais, new LeadingType());

                if (logJSON) {
                    AAsocketDecoder.logger.info(record);
                }

                // Interface Externa //
                InterfazExterna interfazExterna = record.getInterfazExterna();

                notificacion.put("cdrProcessingDate", interfazExterna.getFechaEjecucion().stringValue());

                notificacion.put("numTelefono", interfazExterna.getNumTelefono().stringValue());

                try {
                    notificacion.put("codPromocion", interfazExterna.getCodPromocion().stringValue());
                } catch (NullPointerException e) {
                    notificacion.put("codPromocion", "");
                }

                try {
                    Integer hexa = Integer.valueOf(hexToAscii(String.valueOf(interfazExterna.getImpSaldo())));
                    notificacion.put("impSaldo", String.valueOf(interfazExterna.getImpSaldo()));
                } catch (NullPointerException e) {
                    notificacion.put("impSaldo", "0");
                }

                try {
                    notificacion.put("impCoste", String.valueOf(interfazExterna.getImpCoste()));
                } catch (NullPointerException e) {
                    notificacion.put("impCoste", "0");
                }

                notificacion.put("codUsuario", interfazExterna.getCodUsuario().stringValue());
                notificacion.put("codEstaPrep", interfazExterna.getCodEstaPrep().stringValue());
                notificacion.put("codSbEstaPrep", interfazExterna.getCodSbEstaPrep().stringValue());

                try{
                    notificacion.put("codTipPrepa", interfazExterna.getCodTipPrepa().stringValue());
                } catch (NullPointerException e) {
                    notificacion.put("codTipPrepa","");
                }

                notificacion.put("codTecnologia",interfazExterna.getCodTecnologia().stringValue());
                notificacion.put("codActuacion",interfazExterna.getCodActuacion().stringValue());

                try{
                    notificacion.put("codSbActuacion",String.valueOf(interfazExterna.getCodSbActuacion()));
                } catch (NullPointerException e) {
                    notificacion.put("codSbActuacion","0");
                }

                try {
                    notificacion.put("impDeuda", String.valueOf(interfazExterna.getImpDeuda()));
                } catch (NullPointerException e){
                    notificacion.put("impDeuda","");
                }

                notificacion.put("impCosteNeto",String.valueOf(interfazExterna.getImpCosteNeto()));
                notificacion.put("fechaEjecucion",interfazExterna.getFechaEjecucion().stringValue());
                notificacion.put("flagActAnulacion",String.valueOf(interfazExterna.getFlagActAnulacion()));
                notificacion.put("codRechazo",interfazExterna.getCodRechazo().stringValue());
                notificacion.put("secuencia",interfazExterna.getSecuencia().stringValue());

                // ParamsEspecificos //
                ParamsEspecificos paramsEspecificos = interfazExterna.getParamsEspecificos();

                if(paramsEspecificos != null){

                    switch (paramsEspecificos.getChosenFlag()) {

                        // ----- Parámetros de la Notificación ----- //
                        // ----- Recarga ----- //
                        case ParamsEspecificos.recarga_chosen: {
                            Recarga event = interfazExterna.getParamsEspecificos().getRecarga();

                            try{
                                notificacion.put("codOrigReca",event.getCodOrigReca().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("codOrigReca","");
                            }

                            notificacion.put("flagPromocional",String.valueOf(event.getFlagPromocional()));
                            notificacion.put("flagPeriodifica",String.valueOf(event.getFlagPeriodifica()));

                            try {
                                if (logJSON) {
                                    AAsocketDecoder.logger.info("Wallets: " + event.getListOfBalances().getSize());
                                    AAsocketDecoder.logger.info("event.getListOfBalances(): " + event.getListOfBalances());
                                    AAsocketDecoder.logger.info("event.getListOfBalances().getSize(): " + event.getListOfBalances().getSize());
                                }

                                for (int i = 0; i <= event.getListOfBalances().getSize(); i++) {
                                    notificacion.put("walletID",String.valueOf(event.getListOfBalances().get(i).getWalletID()));
                                    notificacion.put("walletBalance",hexToAscii(String.valueOf(event.getListOfBalances().get(i).getWalletBalance())));
                                    notificacion.put("walletBalanceChange",hexToAscii(String.valueOf(event.getListOfBalances().get(i).getWalletBalanceChange())));
                                    notificacion.put("walletNewValidity",event.getListOfBalances().get(i).getWalletNewValidity().stringValue());
                                }
                            } catch(Exception ignored){
                                if (logJSON) {
                                    AAsocketDecoder.logger.info("Exception: " + ignored.getMessage());
                                }
                            }
                            notificacion.put("flagFirstTopUp",String.valueOf(event.getFlagFirstTopUp()));
                            notificacion.put("flagLastCycle",String.valueOf(event.getFlagLastCycle()));
                        }

                        // ----- Bono ----- //
                        case ParamsEspecificos.bono_chosen: {
                            Bono event = interfazExterna.getParamsEspecificos().getBono();
                            try {
                                notificacion.put("codBono",event.getCodBono().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("codBono","");
                            }
                            try {
                                notificacion.put("fechaInicio",event.getFechaInicio().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("fechaInicio","");
                            }
                            try {
                                notificacion.put("fechaFin",event.getFechaFin().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("fechaFin","");
                            }
                            try {
                                notificacion.put("cantidad",octetToAscii(String.valueOf(event.getCantidad())));
                            } catch (NullPointerException e){
                                notificacion.put("cantidad","0");
                            }
                        }

                        // ----- Ren Bono ----- //
                        case ParamsEspecificos.renBonoTR_chosen: {
                            RenBonoTR event = interfazExterna.getParamsEspecificos().getRenBonoTR();

                            try {
                                notificacion.put("codBono",event.getCodBono().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("codBono","");
                            }
                            try {
                                notificacion.put("fechaInicio",event.getFechaInicio().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("fechaInicio","");
                            }
                            try {
                                notificacion.put("fechaFin",event.getFechaFin().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("fechaFin","");
                            }
                            try {
                                notificacion.put("cantidad",octetToAscii(String.valueOf(event.getCantidad())));
                            } catch (NullPointerException e){
                                notificacion.put("cantidad","0");
                            }

                            try {
                                notificacion.put("tipoRenovacion", String.valueOf(event.getTipoRenovacion()));
                            } catch (NullPointerException e){
                                notificacion.put("tipoRenovacion","");
                            }
                        }

                        // ----- Bono Baja ----- //
                        case ParamsEspecificos.bajaBono_chosen: {
                            BajaBono event = interfazExterna.getParamsEspecificos().getBajaBono();

                            try {
                                notificacion.put("codBono",event.getCodBono().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("codBono","0");
                            }
                        }

                        // ----- Bolton Event ----- //
                        case ParamsEspecificos.boltonEvent_chosen: {
                            BoltonEvent event = interfazExterna.getParamsEspecificos().getBoltonEvent();

                            try {
                                notificacion.put("codBono",event.getCodBono().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("codBono","0");
                            }
                            try {
                                //notificacion.put("cantidad",octetToAscii(String.valueOf(event.getCantidad())));
                                notificacion.put("cantidad",event.getCantidad().toString());
                            } catch (NullPointerException e){
                                notificacion.put("cantidad","0");
                            }
                            try {
                                notificacion.put("fechaInicio",event.getFechaInicio().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("fechaInicio","");
                            }
                            try {
                                notificacion.put("fechaFin",event.getFechaFin().stringValue());
                            } catch (NullPointerException e){
                                notificacion.put("fechaFin","");
                            }
                        }

                        case ParamsEspecificos.walletThresholdEvent_chosen: {
                            WalletThresholdEvent event = interfazExterna.getParamsEspecificos().getWalletThresholdEvent();

                            try {
                                notificacion.put("walletId", String.valueOf(event.getWalletID()));
                            } catch (NullPointerException e){
                                notificacion.put("walletId","");
                            }
                        }

                        default: {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            AAsocketDecoder.logger.info(e.getMessage());
        } finally {
            try {
                bis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return notificacion;
    }

    private static String hexToAscii(String hexStr) {
        hexStr = hexStr.replace("value INTEGER64 ::= '", "").replaceFirst("'H","").trim();
        int hexa = Integer.parseInt(hexStr, 16);
        return String.valueOf(hexa);
    }

    private static String saldo(Integer hexa){
        int saldo = hexa / 1000;
        return String.valueOf(saldo);
    }

    private static String octetToAscii(String octStr) {
        octStr = octStr.replace("value OCTET STRING ::= '", "").replaceFirst("'H","").trim();
        int hexa = Integer.parseInt(octStr, 16);
        return String.valueOf(hexa);
    }
}

