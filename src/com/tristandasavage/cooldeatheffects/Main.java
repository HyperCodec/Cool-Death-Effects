package com.tristandasavage.cooldeatheffects;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.GameRule;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends JavaPlugin {
    private static Main instance;
    private Logger logger;

    public Main() {
    }

    public static Main getInstance() {
        return instance;
    }

    public void onEnable() {
        instance = this;
        this.getServer().getPluginManager().registerEvents(new Listeners(), this);
        this.logger = this.getLogger();
        this.logger.log(Level.INFO, "Cool Death Effects beta-1.0 has been loaded!");
    }

    public void onDisable() {
        instance = null;
        this.logger.log(Level.INFO, "Cool Death Effects plugin unloaded");
    }
}
