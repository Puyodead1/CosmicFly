package me.puyodead1.cosmicfly.Events;

import me.puyodead1.cosmicfly.CosmicFly;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class FlyToggle implements Listener {

    private final CosmicFly cosmicFly = CosmicFly.plugin;

    @EventHandler
    public void onFlyToggle(PlayerToggleFlightEvent e) {
        final Player player = e.getPlayer();
        if (!player.hasPermission("cosmicfly.fly") && player.getGameMode() != GameMode.CREATIVE && player.getGameMode() != GameMode.SPECTATOR) {
            player.setAllowFlight(false);
            player.setFlying(true);
            e.setCancelled(true);

            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(cosmicFly, new Runnable() {
                public void run() {
                    player.setAllowFlight(true);
                }
            },  600L);
        }
    }
}
