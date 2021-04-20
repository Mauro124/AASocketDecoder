public class Arguments {
    private Boolean logJson;
    private int portRTDM;
    private String hostRTDM;
    private int  listenPort;
    private int  version;

    private static Arguments arguments;


    public static Arguments getInstance(){
        if(arguments == null){
            arguments = new Arguments();
        }
        return arguments;
    }

    public Boolean getLogJson() {
        return logJson;
    }

    public void setLogJson(Boolean logJson) {
        this.logJson = logJson;
    }

    public int getPortRTDM() {
        return portRTDM;
    }

    public void setPortRTDM(int portRTDM) {
        this.portRTDM = portRTDM;
    }

    public String getHostRTDM() {
        return hostRTDM;
    }

    public void setHostRTDM(String hostRTDM) {
        this.hostRTDM = hostRTDM;
    }

    public int getListenPort() {
        return listenPort;
    }

    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
