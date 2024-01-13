public class AppConfig {

    private static AppConfig instance;

    private String serverURL;
    private int port;
    private AppConfig(){}

    public static synchronized AppConfig getInstance() {
        if(instance == null) {
            instance = new AppConfig();
        }

        return instance;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
