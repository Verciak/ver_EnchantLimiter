package pl.vertty.limiter.configs;

import java.util.*;

import pl.vertty.limiter.Main;

import java.io.*;

public class ConfigManager
{
    private static HashMap<String, Config> configs;
    
    static {
        ConfigManager.configs = new HashMap<String, Config>();
    }
    
    public static void registerConfig(final String name, final Config config) {
        ConfigManager.configs.put(name, config);
    }
    
    public static boolean isConfig(final String name) {
        return ConfigManager.configs.containsKey(name);
    }
    
    public static Config getConfig(final String name) {
        return ConfigManager.configs.get(name);
    }
    
    public static void reloadConfig() {
        Main.getPlugin().reloadConfig();
        init();
    }
    
    public static void init() {
        final File file = new File(Main.getInstance().getDataFolder(), "others");
        if (!file.exists()) {
            file.mkdir();
        }
    }
}
