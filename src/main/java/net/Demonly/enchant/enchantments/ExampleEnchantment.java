package net.Demonly.enchant.enchantments;

import net.Demonly.enchant.CustomEnchantment;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class ExampleEnchantment extends CustomEnchantment {

    public ExampleEnchantment(NamespacedKey id) {
        super(id);
    }

    @Override
    public boolean canEnchantItem(ItemStack item) {
        return item.getType() == Material.DIAMOND_SWORD;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return null;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment other) {
        return false;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getEnchantmentTableMinimumLevel() {
        return 1;
    }

    @Override
    public int getEnchantmentTableMaximumLevel() {
        return 30;
    }

    @Override
    public double getEnchantmentChance() {
        return 1.0;
    }

}
