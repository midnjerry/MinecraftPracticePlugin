package net.crusadergames.minecraft.plugins.practice.wrappers;

import org.bukkit.Bukkit;

import java.util.logging.Logger;

/* Bukkit uses a lot of static methods.  This makes unit testing much more difficult.  To get around this we use
this wrapper class.  If we need to simulate Bukkit functionality, we can easily mock this class.
 */
public class BukkitWrapper {
   public Logger getLogger(){
        return Bukkit.getLogger();
    }
}
