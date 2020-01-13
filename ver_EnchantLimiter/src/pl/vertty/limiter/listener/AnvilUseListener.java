package pl.vertty.limiter.listener;

import org.bukkit.event.inventory.*;
import org.bukkit.entity.*;
import org.bukkit.command.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

import pl.vertty.limiter.Main;
import pl.vertty.limiter.configs.EnchantConfig;
import pl.vertty.limiter.utils.ChatUtil;

import org.bukkit.event.*;

public class AnvilUseListener implements Listener
{
    @EventHandler
    public void onAnvilUse(final InventoryClickEvent e) {
        if (e.getView().getType().equals((Object)InventoryType.ANVIL)) {
            final int rawSlot = e.getRawSlot();
            if (rawSlot == 2) {
                final ItemStack itemStack = e.getCurrentItem();
                if (itemStack != null) {
                    final ItemMeta itemMeta = itemStack.getItemMeta();
                    if (itemMeta != null) {
                        Main.getPlugin();
                        for (final EnchantBlock enchantBlock : EnchantConfig.blockedenchants.values()) {
                            if (itemMeta.getEnchants().get(enchantBlock.getEnchantment()) != null && itemMeta.getEnchants().get(enchantBlock.getEnchantment()) >= enchantBlock.getEnchantmentLevel()) {
                                itemMeta.removeEnchant(enchantBlock.getEnchantment());
                                itemMeta.addEnchant(enchantBlock.getEnchantment(), enchantBlock.getEnchantmentLevel(), true);
                                itemStack.setItemMeta(itemMeta);
                                final Player player = (Player)e.getWhoClicked();
                                ChatUtil.sendMessage((CommandSender)player, EnchantConfig.ENCHANT_LIMIT_MESSAGE.replace("%ENCHANT%", enchantBlock.getEnchantment().getName()).replace("%LEVEL%", String.valueOf(enchantBlock.getEnchantmentLevel())));
                            }
                        }
                    }
                }
            }
        }
    }
}
