public class PrinterManager {
    // Instancia única de PrinterManagement
    private static PrinterManager instance;

    // Constructor privado para prevenir instancia directa
    private PrinterManager() {}

    // Método para obtener la instancia única
    public static synchronized PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    // Método para gestionar la impresión
    public void printDocument(String document) {
        System.out.println("Imprimiendo: " + document);
        // Aquí iría la lógica de impresión...
    }
}
