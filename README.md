# MinecraftPracticePlugin
This is a sample Minecraft plugin for Spigot 1.21.1.  In it we cover multiple features as well as testing.

## Setup
1. Download and install IntelliJ
2. Install `Minecraft Development` plugin and restart
3. Create a new project (Minecraft)
    * Select `Plugin`
    * Select `Spigot`
    * Select `Maven`
    * Select `Java` version `21`
4. Update your .gitignore file so you don't commit unnecessary files.

## Features

### Story 1 - 10000 TRADEBOT
Download Spigot 1.21, run the server, and connect to it with Minecraft account

### Story 2 - 15000 TRADEBOT
Open Intellij, create a new maven project with spigot dependencies.  On enable, display a hello world to server log, show me screenshot

### Story 3 - 20000 TRADEBOT
Update plugin and add a command called tendies.  When a player types /tendies in chat make it rain cooked chicken...  100 should spawn above player and fall.  Add clouds and lightning and thunder for extra effect!

### Story 4 - 25000 TRADEBOT
Make a custom item called Magic Missle.  It's a blaze rod that when swung throws a fireball and explodes on impact destroying blocks.  Make a command /equip wand that spawns this item above you.

### Story 5 - 25000 TRADEBOT
Make a chest chain armor called Archer's Bane with glowing enchantment.  It cuts all projectile damage by half but doubles all melee damage.

### Story 6 - 25000 TRADEBOT
Make a diamond sword called Frostbourne.  When you hit a living entity (that means players too!) it freezes it but also makes it invulnerable to damage.  Freeze means freeze!  Entity can't move head or walk, nothing.  Adding an effect so victim sees they are frozen is essential. Make entity glow blue. Freeze lasts 5 seconds.  /equip frostbourne spawns it

### Story 7 - 50000 TRADEBOT
Write unit tests for all previous tasks.  You will be surprised, those tests will protect us as we add more and more features.