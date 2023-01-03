package patterns.singleton;

public class Main {

    public static void main(String[] args) {
        ConfigManager configManager1 = ConfigManager.getInstance();
        ConfigManager configManager2 = ConfigManager.getInstance();

        configManager1.add("key","value");

        System.out.println(configManager2.get("key"));
    }

}
