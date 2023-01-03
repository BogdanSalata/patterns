package patterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static ConfigManager configManager;

    private final Map<String, String> configs;

    private ConfigManager() {
        configs = new HashMap<>();
    }

    public static ConfigManager getInstance() {
        if (configManager == null) {
            configManager = new ConfigManager();
        }

        return configManager;
    }

    public void add(String key, String value) {
        configs.put(key, value);
    }

    public String get(String key) {
        return configs.get(key);
    }

}
