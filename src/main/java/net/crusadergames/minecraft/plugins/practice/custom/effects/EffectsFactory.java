package net.crusadergames.minecraft.plugins.practice.custom.effects;

import net.crusadergames.minecraft.plugins.practice.wrappers.BukkitWrapper;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

/**
 * EffectManager holds all of our cool effects.  It is a singleton so this guarantees every other service uses the
 * same object.  EffectManager can also be easily mocked for testing purposes.
 */
public class EffectsFactory {
    private static EffectsFactory instance;
    private final BukkitWrapper bukkitWrapper;

    public static EffectsFactory getInstance(BukkitWrapper bukkitWrapper) {
        if (instance == null) {
            return new EffectsFactory(bukkitWrapper);
        }
        return instance;
    }

    private EffectsFactory(BukkitWrapper bukkitWrapper) {
        this.bukkitWrapper = bukkitWrapper;
    }

    public void launchTendieStorm(Player player) {
        Random random = new Random();
        World world = player.getWorld();
        int min = -10;
        int max = 10;

        Location skyLocation = player.getLocation().add(0,30,0);
        world.playSound(skyLocation, Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 10, 10);
        world.spawnParticle(Particle.CLOUD, skyLocation, 50000, 20, 5, 20, 0.01);
        for (int i = 1; i <= 100; i++) {
            Location spawnLocation = player.getLocation();
            spawnLocation.add(random.nextInt((max - min)) + min, random.nextInt((30)) + 10, random.nextInt((max - min)) + min);
            world.dropItem(spawnLocation, new ItemStack(Material.COOKED_CHICKEN, 1));
        }
    }

}
