import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.HashMap;

public class SendRTDM {

    private Arguments arguments = Arguments.getInstance();
    private String hostRtdm = arguments.getHostRTDM();
    private int portRtdm = arguments.getPortRTDM();
    private Boolean logJSON = arguments.getLogJson();

    public void request(HashMap<String, String> notification){
        boolean notificationValida = validateNotification(notification.size());

        if(notificationValida){
            dataForRequest(notification,hostRtdm,portRtdm);
        } else {
            AAsocketDecoder.logger.info("Notificación invalida:");
            AAsocketDecoder.logger.info(notification);
        }
    }

    private Boolean validateNotification(int notificationSize){
        return notificationSize > 13;
    }

    private void generateLog(String json, String url){
        String log;

        String date = MainVerticle.getCurrentTimeStampForNotification();
        String extractTextCod = json.substring(json.indexOf("ctuacion") + 11, json.indexOf("ctuacion") + 13);
        String extractTextMovil = json.substring(json.indexOf("ovil") + 7, json.indexOf("ovil") + 15);
        String extractTextEvent = url.substring(url.indexOf("decisionId=") + 11);

        log = date + "," + extractTextCod + "," + extractTextMovil + "," + extractTextEvent;

        AAsocketDecoder.logger.info(log);
    }

    private void post(String json, String url) {

        if (logJSON) {
            AAsocketDecoder.logger.info("URL: " + url + " JSON: " + json);
        }

        generateLog(json, url);
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json");
            httpPost.setEntity(new StringEntity(json));

            // Respuesta del request
            ResponseHandler<String> responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Respuesta innesperada: " + status);
                }
            };

            String responseBody = httpclient.execute(httpPost, responseHandler);
            if (logJSON) {
                AAsocketDecoder.logger.info("Response: " + responseBody);
            }

        } catch (IOException e) {
            e.printStackTrace();
            AAsocketDecoder.logger.info(e.getMessage());
        }
    }

    private void dataForRequest(HashMap<String,String> noti, String hostRtdm, int portRtdm){
        String json;
        String url;
        String url2;
        String type = noti.get("codActuacion");

        if (logJSON) {
            AAsocketDecoder.logger.info("impSaldo: " + noti.get("impSaldo"));
            AAsocketDecoder.logger.info("impCoste: " + noti.get("impCoste"));
            AAsocketDecoder.logger.info("fechaInicio: " + noti.get("fechaInicio"));
            AAsocketDecoder.logger.info("fechaFin: " + noti.get("fechaFin"));
        }

        int codSbActuacion = 0;
        if(!(noti.get("codSbActuacion") == null)){
            codSbActuacion = Integer.parseInt(noti.get("codSbActuacion"));
        }

        int impSaldo = 0;
        if(!(noti.get("impSaldo") == null)){
            impSaldo = Integer.parseInt(noti.get("impSaldo"));
        }

        int impCoste = 0;
        if(!(noti.get("impCoste") == null)){
            impCoste = Integer.parseInt(noti.get("impCoste"));
        }

        int walletID = 0;
        if(!(noti.get("walletID") == null)){
            walletID = Integer.parseInt(noti.get("walletID"));
        }

        switch (type) {
            case "RC": // RECARGA
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"tipo_notificacion\":\"" + "recarga" + "\"," +
                    "\"valor_umbral\":0," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"," +
                    "\"cod_bono\":\"" + noti.get("codBono") + "\"," +
                    "\"imp_coste\":" + noti.get("impCoste") + "," +
                    "\"imp_saldo\":" + noti.get("impSaldo") + "," +
                    "\"cod_tip_prepa\":\"" + noti.get("codTipPrepa") + "\"," +
                    "\"cod_sb_actuacion\":" + codSbActuacion + "," +
                    "\"origen\":\"" + noti.get("codOrigReca") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_RC_04";
                url2 = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_Invocacion_Time_01";
                post(json, url);
                post(json, url2);
                break;

            case "CB": // UMBRAL DE VENCIMIENTO
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"," +
                    "\"cod_bono\":\"" + noti.get("codBono") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_CB_01";
                post(json, url);
                break;

            case "UB": // UMBRAL DE DATOS
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"," +
                    "\"cod_bono\":\"" + noti.get("codBono") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_UB_01";
                post(json, url);
                break;

            case "UL": // UMBRAL DE SALDO
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"tipo_notificacion\":\"" + "bajo saldo" + "\"," +
                    "\"monedero_id\":" + walletID + "," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_UL_02";
                post(json, url);
                break;

            case "RK": // INTERNET POR DÍA (AK)
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"Movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"Tipo_Notificacion\":\"" + "internet_por_dia" + "\"," +
                    "\"Imp_Saldo\":" + noti.get("impSaldo") + "," +
                    "\"Imp_Coste\":" + noti.get("impCoste") + "," +
                    "\"Cod_Tip_Prepa\":\"" + noti.get("codTipPrepa") + "\"," +
                    "\"Cod_Actuacion\":\"" + noti.get("codActuacion") + "\"," +
                    "\"Cod_Sb_Actuacion\":" + codSbActuacion + "," +
                    "\"Cod_Bono\":\"" + noti.get("codBono") + "\"" + "}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_AK_01";
                post(json, url);

                break;

            case "AB": // SUSCRIPCIÓN AL SERVICIO DE INTERCEPCIÓN
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"," +
                    "\"Imp_Saldo\":" + impSaldo + "," +
                    "\"fecha_inicio\":\"" + noti.get("codActuacion") + "\"," +
                    "\"fecha_fin\":\"" + noti.get("codActuacion") + "\"," +
                    "\"cod_bono\":\"" + noti.get("codBono") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_AB_01";
                break;

            case "BB": // SUSCRIPCIÓN DE BOLT-ON
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"Imp_Saldo\":" + impSaldo + "," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"," +
                    "\"cod_bono\":\"" + noti.get("codBono") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_CB_01";
                break;

            case "US": // BALANCE THRESHOLD
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"tipo_notificacion\":\"" + "umbral saldo" + "\"," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_UL_01";
                post(json, url);
                break;

            case "UG": // VENCIMIENTO DIA ANTES
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"tipo_notificacion\":\"" + "vencimiento_dia_antes" + "\"," +
                    "\"imp_saldo\":" + impSaldo + "," +
                    "\"imp_coste\":" + impCoste + "," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"," +
                    "\"cod_tip_prepa\":\"" + noti.get("codTipPrepa") + "\"," +
                    "\"cod_sb_actuacion\":" + codSbActuacion + "," +
                    "\"cod_bono\":\"" + noti.get("codBono") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_UG_02";
                post(json, url);
                break;

            case "ZA": // ALTA DE UN CLIENTE
                json = "{\"clientTimeZone\":\"America/Montevideo\"," +
                    "\"version\":1," +
                    "\"inputs\":" +
                    "{\"movil\":\"" + noti.get("numTelefono") + "\"," +
                    "\"tipo_notificacion\":\"" + "alta_de_cliente" + "\"," +
                    "\"cod_tecnologia\":\"" + noti.get("codTecnologia") + "\"," +
                    "\"cod_tip_prepa\":\"" + noti.get("codTipPrepa") + "\"," +
                    "\"cod_sb_actuacion\":" + codSbActuacion + "," +
                    "\"cod_actuacion\":\"" + noti.get("codActuacion") + "\"}" +
                    "}";

                url = "http://" + hostRtdm + ":" + portRtdm + "/RTDM/rest/runtime/jobs?decisionId=ev_EXT_ZA_01";
                post(json, url);
                break;
        }
    }
}
