import java.util.Properties;

public class Ausgabe {
    public static void systemProperties() {
        Properties p = new Properties(System.getProperties());
        String os = p.getProperty("os.name");
        String osVersion = p.getProperty("os.version");

        String home = p.getProperty("user.home");
        String user = p.getProperty("user.name");

        String javaVersion = p.getProperty("java.version");

        System.out.println("OS: " + os);
        System.out.println("OS Version: " + osVersion);
        System.out.println("Home: " + home);
        System.out.println("User: \"" + user + "\"");
        System.out.println("Java Version: " + javaVersion);

        System.out.println("Erste Zeile\n\tZweite Zeile");

    }

    public static void formattierteAusgabe() {
        float preis = 19.90f;

        System.out.printf("Hallo %15s %15s, %15s!\n", "Max", "Mustermann", "Willkommen");
        System.out.printf("Hallo %15s %15s, %15s!\n", "Erna", "Musterfrau", "Grüß Gott");
        System.out.printf("Das Buch kostet %.2f Euro\n", preis);
        System.out.println("Das Buch kostet " + preis + " Euro");
    }
}
