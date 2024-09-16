package net.crusadergames.minecraft.plugins.practice;

import net.crusadergames.minecraft.plugins.practice.commands.TendiesCommand;
import net.crusadergames.minecraft.plugins.practice.custom.effects.EffectsFactory;
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
         getCommand("tendies").setExecutor(new TendiesCommand(EffectsFactory.getInstance(bukkit)));
    }
}
