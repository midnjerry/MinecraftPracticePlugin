package net.crusadergames.minecraft.plugins.practice.commands;

import net.crusadergames.minecraft.plugins.practice.custom.effects.EffectsFactory;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class TendiesCommandTest {

    EffectsFactory mockFactory;

    TendiesCommand tendiesCommand;

    @BeforeEach
    public void setup(){
        mockFactory = Mockito.mock(EffectsFactory.class);
        tendiesCommand = new TendiesCommand(mockFactory);
    }

    @Test
    public void onCommand_callsTendiesStorm(){
        Player player = Mockito.mock(Player.class);
        tendiesCommand.onCommand(player, null, null, null);
        verify(mockFactory).launchTendieStorm(player);
    }

    @Test
    public void onCommand_nonPlayerReturnsFalse(){
        CommandSender sender = Mockito.mock(CommandSender.class);
        assertFalse(tendiesCommand.onCommand(sender, null, null, null));
        verify(mockFactory, times(0)).launchTendieStorm(any());
    }

    @Test
    public void onCommand_nonPlayerReturnsErrorMessage(){
        CommandSender sender = Mockito.mock(CommandSender.class);
        assertFalse(tendiesCommand.onCommand(sender, null, null, null));
        verify(sender).sendMessage("Only players can use this command!");
    }

}