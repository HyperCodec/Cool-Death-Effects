package com.tristandasavage.cooldeatheffects.deatheffects;

import org.bukkit.entity.Player;

public class Lightning {
    public static void lightningDeathEffect(Player player) {
        player.getWorld().strikeLightningEffect(player.getLocation());
    }
}
