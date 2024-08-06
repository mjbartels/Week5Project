package week5Projectpackage;

public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        System.out.println();
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        System.out.println();
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}