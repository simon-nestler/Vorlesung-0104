import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;
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
        int a = 65;
        int zahl = 255;
        Calendar cal = Calendar.getInstance();

        PrintWriter out;
        try {
            out = new PrintWriter("test2.txt");

            out.printf("Hallo %15s %15s, %15s!\n", "Max", "Mustermann", "Willkommen");
            out.printf("Hallo %15s %15s, %15s!\n", "Erna", "Musterfrau", "Grüß Gott");
            out.printf("Das Buch kostet %5.2f Euro\n", preis);
            out.printf("Das Buch kostet %f Euro\n", preis);
            out.println("Das Buch kostet " + preis + " Euro");

            out.printf("Das Zeichen ist %C\n", a);
            out.printf("Die Zahl ist %X\n", zahl);

            out.printf("Heute ist der %td.%<tm.%<tY!%nEs ist %<tH.%<tM Uhr.\n", cal);
            out.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Heute ist der 01.04.2025! Es ist 12.48 Uhr.
    }
}
