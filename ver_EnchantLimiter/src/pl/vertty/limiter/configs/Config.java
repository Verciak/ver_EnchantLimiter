package pl.vertty.limiter.configs;

import java.lang.reflect.*;
import java.io.*;
import org.bukkit.configuration.file.*;

import pl.vertty.limiter.Main;

public class Config
{
    private String name;
    private File file;
    private FileConfiguration config;
    public static String STORE_TABLE$PREFIX;
    public static String STORE_SQLITE_BASENAME;
    
    static {
        Config.STORE_TABLE$PREFIX = "ochrona_";
        Config.STORE_SQLITE_BASENAME = "minecraft.db";
    }
    
    public Config() {
    }
    
    public Config(final String name) {
        this.name = name;
        this.loadConfig();
        this.saveConfig();
    }
    
    public static void loadConfigs() {
        try {
            Main.getPlugin().saveDefaultConfig();
            final FileConfiguration c = Main.getPlugin().getConfig();
            Field[] arrayOfField;
            for (int j = (arrayOfField = Config.class.getFields()).length, i = 0; i < j; ++i) {
                final Field f = arrayOfField[i];
                if (c.isSet("config." + f.getName().toLowerCase().replace("$", "-").replace("_", "."))) {
                    f.set(null, c.get("config." + f.getName().toLowerCase().replace("$", "-").replace("_", ".")));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void saveConfigs() {
        try {
            final FileConfiguration c = Main.getPlugin().getConfig();
            Field[] arrayOfField;
            for (int j = (arrayOfField = Config.class.getFields()).length, i = 0; i < j; ++i) {
                final Field f = arrayOfField[i];
                c.set("config." + f.getName().toLowerCase().replace("$", "-").replace("_", "."), f.get(null));
            }
            Main.getPlugin().saveConfig();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void reloadConfigs() {
        Main.getPlugin().reloadConfig();
        loadConfigs();
        saveConfigs();
    }
    
    public String getName() {
        return this.name;
    }
    
    public FileConfiguration getConfig() {
        return this.config;
    }
    
    public void loadConfig() {
        this.file = new File(Main.getInstance().getDataFolder() + "/others/", String.valueOf(this.name) + ".yml");
        if (!this.file.exists()) {
            try {
                this.file.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.config = (FileConfiguration)YamlConfiguration.loadConfiguration(this.file);
        this.saveConfig();
    }
    
    public void saveConfig() {
        try {
            this.config.options().copyDefaults(true);
            this.config.options().configuration().save(this.file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void reloadConfig() {
        this.file = new File(Main.getInstance().getDataFolder() + "/others/", String.valueOf(this.name) + ".yml");
        this.config = (FileConfiguration)YamlConfiguration.loadConfiguration(this.file);
    }
}
