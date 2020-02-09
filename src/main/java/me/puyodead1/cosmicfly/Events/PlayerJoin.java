/*
 * Copyright (c) 2020. Puyodead1
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License. (https://creativecommons.org/licenses/by-nc-nd/4.0/)
 */

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
