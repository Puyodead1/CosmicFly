/*
 * Copyright (c) 2020. Puyodead1
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License. (https://creativecommons.org/licenses/by-nc-nd/4.0/)
 */

package me.puyodead1.cosmicfly;

import me.puyodead1.cosmicfly.Events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CosmicFly extends JavaPlugin {

    public static CosmicFly plugin;

    private final String PREFIX = "&7[&dCosmicFly&7] ";

    @Override
    public void onEnable() {
        plugin = this;

        CosmicFlyUtils.sendConsole(PREFIX + "&b=============================================================");

        // Ensure essentials is installed
        if(!Bukkit.getPluginManager().getPlugin("Essentials").isEnabled()) {
            CosmicFlyUtils.sendConsole(CosmicFlyUtils.Color("&cEssentials not enabled or not installed! Plugin will be disabled!"));
            Bukkit.getPluginManager().disablePlugin(this);
        }

        initConfig();
        initEvents();

        CosmicFlyUtils.sendConsole(PREFIX + "&d========================");
        CosmicFlyUtils.sendConsole(PREFIX + "&bAuthor: &ePuyodead1");
        CosmicFlyUtils.sendConsole(PREFIX + "&bCosmicFly Version: &e" + getServer().getPluginManager().getPlugin(this.getDescription().getName()).getDescription().getVersion());
        CosmicFlyUtils.sendConsole(PREFIX + "&bEssentials Version: &e" + getServer().getPluginManager().getPlugin("Essentials").getDescription().getVersion());
        CosmicFlyUtils.sendConsole(PREFIX + "&bMinecraft Version: &e" + getServer().getVersion());
        CosmicFlyUtils.sendConsole(PREFIX + "&b=============================================================");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void initConfig() {
        long STARTED = System.currentTimeMillis();

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        CosmicFlyUtils.sendConsole(PREFIX + "&bLoaded Configuration &e(took " + (System.currentTimeMillis() - STARTED) + "ms)");
    }

    public void initEvents() {
        long STARTED = System.currentTimeMillis();

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

        CosmicFlyUtils.sendConsole(PREFIX + "&bLoaded Events &e(took " + (System.currentTimeMillis() - STARTED) + "ms)");
    }
}
