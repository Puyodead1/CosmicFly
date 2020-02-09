package me.puyodead1.cosmicfly.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        e.getPlayer().setAllowFlight(true);
    }
}
