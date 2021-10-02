package com.tristandasavage.cooldeatheffects;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Respawn {
    public static void respawnPlayer(Player player) {
        GameMode gm = player.getGameMode();
        player.setGameMode(GameMode.SPECTATOR);
        for(int i = 5; i > 0; i--) {
            player.sendTitle(ChatColor.RED + "You Died", ChatColor.YELLOW + "Respawning in " + ChatColor.RED + i, 0, 21, 0);
            player.sendMessage(ChatColor.YELLOW + "Respawning in " + ChatColor.RED + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        player.teleport(Objects.requireNonNull(player.getBedSpawnLocation()));
        player.setGameMode(gm);
    }
}
