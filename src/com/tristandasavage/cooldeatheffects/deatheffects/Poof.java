package com.tristandasavage.cooldeatheffects.deatheffects;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.Random;

public class Poof {
    public static void poofDeathEffect(Player player) {
        Location location = player.getLocation();
        for(int i = 0; i < 50; i++) {
            player.getWorld().spawnParticle(Particle.CLOUD, location.getX(), location.getY() + new Random().nextInt(10) / 10d, location.getZ(), 1, 0, 0, 0, 0.4);
        }
        player.getWorld().playSound(location, Sound.ENTITY_ITEM_PICKUP, 1, 1);
    }
}