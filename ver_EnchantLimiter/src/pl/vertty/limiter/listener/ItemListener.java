package pl.vertty.limiter.listener;

import org.bukkit.event.enchantment.*;

import pl.vertty.limiter.configs.EnchantConfig;
import pl.vertty.limiter.utils.ChatUtil;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class ItemListener implements Listener
{
    @EventHandler
    public void onEnchantItem(final EnchantItemEvent e) {
        for (final EnchantBlock enchantBlock : EnchantConfig.blockedenchants.values()) {
            if (e.getEnchantsToAdd().get(enchantBlock.getEnchantment()) != null && e.getEnchantsToAdd().get(enchantBlock.getEnchantment()) >= enchantBlock.getEnchantmentLevel()) {
                e.getEnchantsToAdd().put(enchantBlock.getEnchantment(), enchantBlock.getEnchantmentLevel());
                final Player player = e.getEnchanter();
                ChatUtil.sendMessage((CommandSender)player, EnchantConfig.ENCHANT_LIMIT_MESSAGE.replace("%ENCHANT%", enchantBlock.getEnchantment().getName()).replace("%LEVEL%", String.valueOf(enchantBlock.getEnchantmentLevel())));
            }
        }
    }
}
