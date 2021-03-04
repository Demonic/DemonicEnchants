package net.Demonly;

import net.Demonly.enchant.enchantments.ExampleEnchantment;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

public class DemonicEnchants extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        System.out.println("[DemonicEnchants] Enchantment table built");
        registerLocalEnchantments();
    }

    public void onDisable()
    {
        System.out.println("[DemonicEnchants] Enchantment table dismantled");
    }

    public static void registerLocalEnchantments() {

        try {

            // Force accepting
            Field fieldAcceptingNew = Enchantment.class.getDeclaredField("acceptingNew");
            fieldAcceptingNew.setAccessible(true);
            fieldAcceptingNew.set(null, true);
            fieldAcceptingNew.setAccessible(false);

            // Registration
            Enchantment.registerEnchantment(new ExampleEnchantment(NamespacedKey.minecraft("example_enchantment")));

            // Force not accepting
            fieldAcceptingNew.setAccessible(true);
            fieldAcceptingNew.set(null, false);
            fieldAcceptingNew.setAccessible(false);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
