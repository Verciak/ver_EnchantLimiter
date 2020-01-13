package pl.vertty.limiter.configs;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import org.bukkit.configuration.file.FileConfiguration;

import pl.vertty.limiter.listener.EnchantBlock;
import pl.vertty.limiter.utils.ChatUtil;

public class EnchantConfig
{
    private static FileConfiguration msg;
    public static String ENCHANT_LIMIT_MESSAGE;
    public static List<String> ENCHANTS_BLOCKED;
    public static Map<Integer, EnchantBlock> blockedenchants;
    
    public static void loadConfig() {
        (EnchantConfig.msg = ConfigManager.getConfig("EnchantLimiterConfig").getConfig()).addDefault("Enchant.limit.message", (Object)"&cLimit xd %ENCHANT% - %LEVEL% ");
        EnchantConfig.ENCHANT_LIMIT_MESSAGE = EnchantConfig.msg.getString("Enchant.limit.message");
        EnchantConfig.msg.addDefault("Enchant.limit.blockeds", (Object)Arrays.asList("sharp-5", "prot-4"));
        EnchantConfig.ENCHANTS_BLOCKED = (List<String>)EnchantConfig.msg.getStringList("Enchant.limit.blockeds");
        EnchantConfig.blockedenchants = new HashMap<Integer, EnchantBlock>();
        int i = 0;
        for (final String blockenchants : EnchantConfig.ENCHANTS_BLOCKED) {
            final EnchantBlock enchantBlock = ChatUtil.getEnchantBlockFromString(blockenchants);
            EnchantConfig.blockedenchants.put(i, enchantBlock);
            ++i;
        }
        ConfigManager.getConfig("EnchantLimiterConfig").saveConfig();
    }
}
