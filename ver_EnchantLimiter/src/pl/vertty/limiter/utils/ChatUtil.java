package pl.vertty.limiter.utils;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_8_R3.entity.*;
import net.minecraft.server.v1_8_R3.*;
import pl.vertty.limiter.enums.Enchants;
import pl.vertty.limiter.listener.EnchantBlock;

import org.bukkit.command.*;
import java.util.*;
import org.bukkit.enchantments.Enchantment;

public class ChatUtil
{
    public static String fixColors(final String message) {
        if (message == null) {
            return "";
        }
        return ChatColor.translateAlternateColorCodes('&', message);
    }
    
    public static List<String> fixColors(final List<String> message) {
        final List<String> strings = message;
        for (int i = 0; i < strings.size(); ++i) {
            strings.set(i, fixColors(strings.get(i)));
        }
        return strings;
    }
    
    @SuppressWarnings("rawtypes")
	public static void sendActionbar(final Player p, final String message) {
        final IChatBaseComponent icbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + ChatColor.translateAlternateColorCodes('&', message) + "\"}");
        final PacketPlayOutChat bar = new PacketPlayOutChat(icbc, (byte)2);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket((Packet)bar);
    }
    
    public static void sendMessage(final Player p, final String message) {
        p.sendMessage(fixColors(message));
    }
    
    public static boolean sendMessage(final Collection<? extends CommandSender> collection, final String message) {
        for (final CommandSender cs : collection) {
            sendMessage(cs, message);
        }
        return true;
    }
    
    public static void sendMessage(final Player p, final List<String> message) {
        for (int i = 0; i < message.size(); ++i) {
            sendMessage(p, message.get(i));
        }
    }
    
    
    public static void clear(final CommandSender sender, final int lines) {
        for (int i = 0; i < lines; ++i) {
            sender.sendMessage(" ");
        }
    }
    
    public static void sendMessage(final CommandSender sender, final String mess) {
        sender.sendMessage(fixColors(mess));
    }
    
       
    public static EnchantBlock getEnchantBlockFromString(final String string) {
        final String[] split = string.split("-");
        if (!string.equals("") && split.length == 2) {
            final Enchantment enchantment = Enchants.get(split[0]);
            final int enchantmentlevel = Integer.parseInt(split[1]);
            return new EnchantBlock(enchantment, enchantmentlevel);
        }
        return null;
    }
}
