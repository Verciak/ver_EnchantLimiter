package pl.vertty.limiter;

import org.bukkit.ChatColor;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

import pl.vertty.limiter.utils.ChatUtil;

public class Logger
{
    private static ConsoleCommandSender console;
    
    static {
        Logger.console = Bukkit.getConsoleSender();
    }
    
    public static void send(final String message) {
        Logger.console.sendMessage(ChatUtil.fixColors(message));
    }
    
    public static void info(final String... logs) {
        final String[] arrayOfString = logs;
        for (int j = logs.length, i = 0; i < j; ++i) {
            final String s = arrayOfString[i];
            log(Level.INFO, s);
        }
    }
    
    public static void warning(final String... logs) {
        final String[] arrayOfString = logs;
        for (int j = logs.length, i = 0; i < j; ++i) {
            final String s = arrayOfString[i];
            log(Level.WARNING, s);
        }
    }
    
    public static void log(final Level level, final String log) {
        Main.getPlugin().getLogger().log(level, log);
    }
    
    public static void exception(final Throwable cause) {
        cause.printStackTrace();
    }
    
    public static void error(final Exception e) {
        error("[TheCore]");
        error("  Bukkit: " + Bukkit.getBukkitVersion());
        error("  Java: " + System.getProperty("java.version"));
        error("  Thread: " + Thread.currentThread());
        error("  Blad: " + e.toString());
        for (int i = 0; i < e.getStackTrace().length; ++i) {
            final String[] splited = e.getStackTrace()[i].toString().split("\\(");
            if (splited[0].contains("pl.theminecraft")) {
                String line = splited[1];
                line = line.replace(".java", "");
                line = line.replace(":", " Linijka: ");
                line = line.replace("\\)", "");
                error("Klasa - " + line);
            }
        }
    }
    
    private static void error(final String message) {
        Logger.console.sendMessage(ChatColor.RED + message);
    }
}
