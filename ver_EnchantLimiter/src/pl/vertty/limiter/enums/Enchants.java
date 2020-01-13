package pl.vertty.limiter.enums;

import java.util.*;
import org.bukkit.enchantments.*;

public class Enchants
{
    private static HashMap<String, Enchantment> enchants;
    
    static {
        (Enchants.enchants = new HashMap<String, Enchantment>()).put("alldamage", Enchantment.DAMAGE_ALL);
        Enchants.enchants.put("alldmg", Enchantment.DAMAGE_ALL);
        Enchants.enchants.put("sharpness", Enchantment.DAMAGE_ALL);
        Enchants.enchants.put("sharp", Enchantment.DAMAGE_ALL);
        Enchants.enchants.put("dal", Enchantment.DAMAGE_ALL);
        Enchants.enchants.put("ardmg", Enchantment.DAMAGE_ARTHROPODS);
        Enchants.enchants.put("baneofarthropods", Enchantment.DAMAGE_ARTHROPODS);
        Enchants.enchants.put("baneofarthropod", Enchantment.DAMAGE_ARTHROPODS);
        Enchants.enchants.put("arthropod", Enchantment.DAMAGE_ARTHROPODS);
        Enchants.enchants.put("dar", Enchantment.DAMAGE_ARTHROPODS);
        Enchants.enchants.put("undeaddamage", Enchantment.DAMAGE_UNDEAD);
        Enchants.enchants.put("smite", Enchantment.DAMAGE_UNDEAD);
        Enchants.enchants.put("du", Enchantment.DAMAGE_UNDEAD);
        Enchants.enchants.put("digspeed", Enchantment.DIG_SPEED);
        Enchants.enchants.put("efficiency", Enchantment.DIG_SPEED);
        Enchants.enchants.put("minespeed", Enchantment.DIG_SPEED);
        Enchants.enchants.put("cutspeed", Enchantment.DIG_SPEED);
        Enchants.enchants.put("ds", Enchantment.DIG_SPEED);
        Enchants.enchants.put("eff", Enchantment.DIG_SPEED);
        Enchants.enchants.put("durability", Enchantment.DURABILITY);
        Enchants.enchants.put("dura", Enchantment.DURABILITY);
        Enchants.enchants.put("unbreaking", Enchantment.DURABILITY);
        Enchants.enchants.put("d", Enchantment.DURABILITY);
        Enchants.enchants.put("thorns", Enchantment.THORNS);
        Enchants.enchants.put("highcrit", Enchantment.THORNS);
        Enchants.enchants.put("thorn", Enchantment.THORNS);
        Enchants.enchants.put("highercrit", Enchantment.THORNS);
        Enchants.enchants.put("t", Enchantment.THORNS);
        Enchants.enchants.put("fireaspect", Enchantment.FIRE_ASPECT);
        Enchants.enchants.put("fire", Enchantment.FIRE_ASPECT);
        Enchants.enchants.put("meleefire", Enchantment.FIRE_ASPECT);
        Enchants.enchants.put("meleeflame", Enchantment.FIRE_ASPECT);
        Enchants.enchants.put("fa", Enchantment.FIRE_ASPECT);
        Enchants.enchants.put("knockback", Enchantment.KNOCKBACK);
        Enchants.enchants.put("kback", Enchantment.KNOCKBACK);
        Enchants.enchants.put("kb", Enchantment.KNOCKBACK);
        Enchants.enchants.put("k", Enchantment.KNOCKBACK);
        Enchants.enchants.put("blockslootbonus", Enchantment.LOOT_BONUS_BLOCKS);
        Enchants.enchants.put("fortune", Enchantment.LOOT_BONUS_BLOCKS);
        Enchants.enchants.put("fort", Enchantment.LOOT_BONUS_BLOCKS);
        Enchants.enchants.put("lbb", Enchantment.LOOT_BONUS_BLOCKS);
        Enchants.enchants.put("mobslootbonus", Enchantment.LOOT_BONUS_MOBS);
        Enchants.enchants.put("mobloot", Enchantment.LOOT_BONUS_MOBS);
        Enchants.enchants.put("looting", Enchantment.LOOT_BONUS_MOBS);
        Enchants.enchants.put("lbm", Enchantment.LOOT_BONUS_MOBS);
        Enchants.enchants.put("oxygen", Enchantment.OXYGEN);
        Enchants.enchants.put("respiration", Enchantment.OXYGEN);
        Enchants.enchants.put("breathing", Enchantment.OXYGEN);
        Enchants.enchants.put("breath", Enchantment.OXYGEN);
        Enchants.enchants.put("o", Enchantment.OXYGEN);
        Enchants.enchants.put("protection", Enchantment.PROTECTION_ENVIRONMENTAL);
        Enchants.enchants.put("prot", Enchantment.PROTECTION_ENVIRONMENTAL);
        Enchants.enchants.put("protect", Enchantment.PROTECTION_ENVIRONMENTAL);
        Enchants.enchants.put("p", Enchantment.PROTECTION_ENVIRONMENTAL);
        Enchants.enchants.put("explosionsprotection", Enchantment.PROTECTION_EXPLOSIONS);
        Enchants.enchants.put("explosionprotection", Enchantment.PROTECTION_EXPLOSIONS);
        Enchants.enchants.put("expprot", Enchantment.PROTECTION_EXPLOSIONS);
        Enchants.enchants.put("blastprotection", Enchantment.PROTECTION_EXPLOSIONS);
        Enchants.enchants.put("blastprotect", Enchantment.PROTECTION_EXPLOSIONS);
        Enchants.enchants.put("pe", Enchantment.PROTECTION_EXPLOSIONS);
        Enchants.enchants.put("fallprotection", Enchantment.PROTECTION_FALL);
        Enchants.enchants.put("fallprot", Enchantment.PROTECTION_FALL);
        Enchants.enchants.put("featherfall", Enchantment.PROTECTION_FALL);
        Enchants.enchants.put("featherfalling", Enchantment.PROTECTION_FALL);
        Enchants.enchants.put("pfa", Enchantment.PROTECTION_FALL);
        Enchants.enchants.put("fireprotection", Enchantment.PROTECTION_FIRE);
        Enchants.enchants.put("flameprotection", Enchantment.PROTECTION_FIRE);
        Enchants.enchants.put("fireprotect", Enchantment.PROTECTION_FIRE);
        Enchants.enchants.put("flameprotect", Enchantment.PROTECTION_FIRE);
        Enchants.enchants.put("fireprot", Enchantment.PROTECTION_FIRE);
        Enchants.enchants.put("flameprot", Enchantment.PROTECTION_FIRE);
        Enchants.enchants.put("pf", Enchantment.PROTECTION_FIRE);
        Enchants.enchants.put("projectileprotection", Enchantment.PROTECTION_PROJECTILE);
        Enchants.enchants.put("projprot", Enchantment.PROTECTION_PROJECTILE);
        Enchants.enchants.put("pp", Enchantment.PROTECTION_PROJECTILE);
        Enchants.enchants.put("silktouch", Enchantment.SILK_TOUCH);
        Enchants.enchants.put("softtouch", Enchantment.SILK_TOUCH);
        Enchants.enchants.put("st", Enchantment.SILK_TOUCH);
        Enchants.enchants.put("waterworker", Enchantment.WATER_WORKER);
        Enchants.enchants.put("aquaaffinity", Enchantment.WATER_WORKER);
        Enchants.enchants.put("watermine", Enchantment.WATER_WORKER);
        Enchants.enchants.put("ww", Enchantment.WATER_WORKER);
        Enchants.enchants.put("firearrow", Enchantment.ARROW_FIRE);
        Enchants.enchants.put("flame", Enchantment.ARROW_FIRE);
        Enchants.enchants.put("flamearrow", Enchantment.ARROW_FIRE);
        Enchants.enchants.put("af", Enchantment.ARROW_FIRE);
        Enchants.enchants.put("arrowdamage", Enchantment.ARROW_DAMAGE);
        Enchants.enchants.put("power", Enchantment.ARROW_DAMAGE);
        Enchants.enchants.put("arrowpower", Enchantment.ARROW_DAMAGE);
        Enchants.enchants.put("ad", Enchantment.ARROW_DAMAGE);
        Enchants.enchants.put("arrowknockback", Enchantment.ARROW_KNOCKBACK);
        Enchants.enchants.put("arrowkb", Enchantment.ARROW_KNOCKBACK);
        Enchants.enchants.put("punch", Enchantment.ARROW_KNOCKBACK);
        Enchants.enchants.put("arrowpunch", Enchantment.ARROW_KNOCKBACK);
        Enchants.enchants.put("ak", Enchantment.ARROW_KNOCKBACK);
        Enchants.enchants.put("infinitearrows", Enchantment.ARROW_INFINITE);
        Enchants.enchants.put("infarrows", Enchantment.ARROW_INFINITE);
        Enchants.enchants.put("infinity", Enchantment.ARROW_INFINITE);
        Enchants.enchants.put("infinite", Enchantment.ARROW_INFINITE);
        Enchants.enchants.put("unlimited", Enchantment.ARROW_INFINITE);
        Enchants.enchants.put("unlimitedarrows", Enchantment.ARROW_INFINITE);
        Enchants.enchants.put("ai", Enchantment.ARROW_INFINITE);
    }
    
    public static Enchantment get(final String name) {
        return Enchants.enchants.get(name.toLowerCase());
    }
}
