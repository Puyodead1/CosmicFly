package me.puyodead1.cosmicfly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CosmicFlyUtils {

    public static String Color(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void sendConsole(String msg) {
        Bukkit.getConsoleSender().sendMessage(Color(msg));
    }

    public static void sendPlayer(Player player, String msg) {
        player.sendMessage(Color(msg));
    }
}
