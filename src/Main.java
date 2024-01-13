public class Main {
    public static void main(String[] args) {
        /*Runnable task = () -> {
            ResourceController controller = ResourceController.getInstance();
            controller.performAction();
        };

        // Creación de múltiples hilos para simular acceso concurrente
        for(int i=0; i < 5; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }*/

        AppConfig config = AppConfig.getInstance();
        config.setServerURL("http://miapi.com");
        System.out.println("URL del servidor: " + config.getServerURL());

        config.setPort(5454);
        System.out.println("Port del servidor: " + config.getPort());
    }
}