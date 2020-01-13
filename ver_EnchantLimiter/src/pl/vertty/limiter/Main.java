package pl.vertty.limiter;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import pl.vertty.limiter.configs.Config;
import pl.vertty.limiter.configs.ConfigManager;
import pl.vertty.limiter.configs.EnchantConfig;
import pl.vertty.limiter.listener.AnvilUseListener;
import pl.vertty.limiter.listener.ItemListener;

public class Main extends JavaPlugin
{
    private static Main instance;
    
    public static Main getInstance() {
        return Main.instance;
    }
    
    public void onLoad() {
        (Main.instance = this).loadConfig();
    }
    
    public static Main getPlugin() {
        return Main.instance;
    }
    
    public void onEnable() {
        final long start = System.currentTimeMillis();
        onLoad();
        loadListeners();
        Logger.send("&aZaladowano plugin! ver_EnchantLimiter w &e" + (System.currentTimeMillis() - start) + " ms.");
    }
    
    public void onDisable() {
    	Logger.send("&cPlugin zostal wylaczony.");
    }
    
    private void loadConfig() {
        ConfigManager.init();
        ConfigManager.registerConfig("EnchantConfig", new Config("EnchantConfig"));
        EnchantConfig.loadConfig();
    }
    
    private void loadListeners() {
        Logger.send("&aLadowanie listenerow...");
        final long start = System.currentTimeMillis();
        Bukkit.getPluginManager().registerEvents((Listener)new ItemListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new AnvilUseListener(), (Plugin)this);
        Logger.send("&aZaladowano listenery w " + (System.currentTimeMillis() - start) + " ms.");
    }
}
