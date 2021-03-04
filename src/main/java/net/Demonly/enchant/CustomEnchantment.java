package net.Demonly.enchant;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public abstract class CustomEnchantment extends Enchantment
{

    public CustomEnchantment(NamespacedKey id)
    {
     super(id);
    }

    public abstract boolean canEnchantItem(ItemStack item);
    public abstract EnchantmentTarget getItemTarget();
    public abstract int getMaxLevel();
    public abstract String getName();
    public abstract int getEnchantmentTableMinimumLevel();
    public abstract int getEnchantmentTableMaximumLevel();
    public abstract double getEnchantmentChance();

}
