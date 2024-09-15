package net.crusadergames.minecraft.plugins.practice.commands;

import net.crusadergames.minecraft.plugins.practice.custom.effects.EffectsFactory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TendiesCommand implements CommandExecutor {
    private EffectsFactory effectManager;

    public TendiesCommand(EffectsFactory effectManager) {
        this.effectManager = effectManager;
    }

    /**
     * @param commandSender source of command
     * @param command       command metadata as provided by plugin.yml
     * @param label         command typed by commandSender
     * @param args          arguments (following label) typed by commandSender
     * @return true or false (if false returns Usage text)
     */
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (!(commandSender instanceof Player)) {
            // Admin who are not playing can still execute commands from console.
            // This prevents that.
            // Also, command blocks can also execute commands - this prevents that.
            commandSender.sendMessage("Only players can use this command!");
            return false;
        }

        /*
        Debatable of what is done here.  You either execute the code, or better yet, call a method that
        houses the actual code.  This makes it easier to test, and you're not co-mingling job responsibilities.

        So for example, if want to attach the "tendie storm" to a wand, you can easily do that and call the method directly
        without having to deal with this Command code.
         */
        Player player = (Player) commandSender;
        effectManager.launchTendieStorm(player);

        return true;
    }
}
