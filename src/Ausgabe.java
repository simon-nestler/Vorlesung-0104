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
        System.out.println("User: " + user);
        System.out.println("Java Version: " + javaVersion);
    }
}
