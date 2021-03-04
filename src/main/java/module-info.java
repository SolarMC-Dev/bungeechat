module org.spigotmc.bungee.api.chat {

    requires com.google.gson;

    exports net.md_5.bungee.api;
    exports net.md_5.bungee.api.chat;
    exports net.md_5.bungee.chat to org.bukkit.craftbukkit;
}