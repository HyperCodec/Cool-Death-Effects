package com.tristandasavage.cooldeatheffects.deatheffects;

import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class Explosion {
    public static void explosionDeathEffect(Player player) {
        player.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, player.getLocation(), 0, 0, 0, 0);
        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
    }
}