package pl.vertty.limiter.listener;

import org.bukkit.enchantments.*;

public class EnchantBlock
{
    private Enchantment enchantment;
    private int enchantmentLevel;
    
    public EnchantBlock(final Enchantment enchantment, final int enchantmentLevel) {
        if (enchantment == null) {
            $$$reportNull$$$0(0);
        }
        if (enchantment == null) {
            throw new NullPointerException("enchantment is marked  but is null");
        }
        this.enchantment = enchantment;
        this.enchantmentLevel = enchantmentLevel;
    }
    
    public Enchantment getEnchantment() {
        final Enchantment enchantment = this.enchantment;
        if (enchantment == null) {
            $$$reportNull$$$0(1);
        }
        return enchantment;
    }
    
    public int getEnchantmentLevel() {
        return this.enchantmentLevel;
    }
    
    public void setEnchantment(final Enchantment enchantment) {
        if (enchantment == null) {
            $$$reportNull$$$0(2);
        }
        if (enchantment == null) {
            throw new NullPointerException("enchantment is marked  but is null");
        }
        this.enchantment = enchantment;
    }
    
    public void setEnchantmentLevel(final int enchantmentLevel) {
        this.enchantmentLevel = enchantmentLevel;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EnchantBlock)) {
            return false;
        }
        final EnchantBlock other = (EnchantBlock)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$enchantment = this.getEnchantment();
        final Object other$enchantment = other.getEnchantment();
        if (this$enchantment == null) {
            if (other$enchantment == null) {
                return this.getEnchantmentLevel() == other.getEnchantmentLevel();
            }
        }
        else if (this$enchantment.equals(other$enchantment)) {
            return this.getEnchantmentLevel() == other.getEnchantmentLevel();
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof EnchantBlock;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        final Object $enchantment = this.getEnchantment();
        result = result * 59 + (($enchantment == null) ? 43 : $enchantment.hashCode());
        result = result * 59 + this.getEnchantmentLevel();
        return result;
    }
    
    @Override
    public String toString() {
        return "EnchantBlock(enchantment=" + this.getEnchantment() + ", enchantmentLevel=" + this.getEnchantmentLevel() + ")";
    }
    
    private static void $$$reportNull$$$0(final int n) {
        String s = null;
        switch (n) {
            default: {
                s = "Argument for  parameter '%s' of %s.%s must not be null";
                break;
            }
            case 1: {
                s = " method %s.%s must not return null";
                break;
            }
        }
        int n2 = 0;
        switch (n) {
            default: {
                n2 = 3;
                break;
            }
            case 1: {
                n2 = 2;
                break;
            }
        }
        final Object[] array = new Object[n2];
        switch (n) {
            default: {
                array[0] = "enchantment";
                break;
            }
            case 1: {
                array[0] = "pl/litecode/defa/enchantlimit/EnchantBlock";
                break;
            }
        }
        switch (n) {
            default: {
                array[1] = "pl/litecode/defa/enchantlimit/EnchantBlock";
                break;
            }
            case 1: {
                array[1] = "getEnchantment";
                break;
            }
        }
        switch (n) {
            default: {
                array[2] = "<init>";
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                array[2] = "setEnchantment";
                break;
            }
        }
        final String format = String.format(s, array);
        RuntimeException ex = null;
        switch (n) {
            default: {
                ex = new IllegalArgumentException(format);
                break;
            }
            case 1: {
                ex = new IllegalStateException(format);
                break;
            }
        }
        throw ex;
    }
}
