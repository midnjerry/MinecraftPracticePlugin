package net.crusadergames.minecraft.plugins.practice;

import net.crusadergames.minecraft.plugins.practice.wrappers.BukkitWrapper;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class MinecraftPracticePlugin extends JavaPlugin {
    Logger logger;
    BukkitWrapper bukkit = new BukkitWrapper();

    @Override
    public void onEnable() {
         logger = bukkit.getLogger();
         logger.info("MinecraftPracticePlugin initializing...");
    }
}
