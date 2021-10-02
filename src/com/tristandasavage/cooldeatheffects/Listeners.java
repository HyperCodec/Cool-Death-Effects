package com.tristandasavage.cooldeatheffects;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.GameRule;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import com.tristandasavage.cooldeatheffects.deatheffects.*;
import com.tristandasavage.cooldeatheffects.DeathMessages;

import java.util.Random;

public class Listeners implements Listener {
    public Listeners() {
    }

    @EventHandler
    public void EntityDamageEvent(EntityDamageEvent event) {
        if(event.getEntityType() == EntityType.PLAYER) {
            Player player = (Player) event.getEntity();
            if(player.getHealth() - event.getFinalDamage() <= 0) {
                event.setCancelled(true);
                if (player.getWorld().getGameRuleValue(GameRule.KEEP_INVENTORY) == false) {
                    try {
                        for (ItemStack itemStack : player.getInventory().getContents()) {
                            player.getWorld().dropItemNaturally(player.getLocation(), itemStack);
                            player.getInventory().removeItem(itemStack);
                        }
                        for (ItemStack itemStack : player.getInventory().getArmorContents()) {
                            player.getWorld().dropItemNaturally(player.getLocation(), itemStack);
                            player.getInventory().removeItem(itemStack);
                        }
                    } catch (IllegalArgumentException e) {

                    }
                    player.getInventory().clear();
                }

                player.getActivePotionEffects().clear();
                player.setHealth(20);
                player.setFoodLevel(20);
                DeathMessages.sendDeathMessage(event, player);
                Respawn.respawnPlayer(player);
                // If you add your own death effect, make the number in rand.nextInt 1 higher and add else if(randomnumber == yournumber) {YourDeathClass.yourDeathEffect(player);}
                Random rand = new Random();
                int randomnumber = rand.nextInt(3);
                if (randomnumber == 0) {Poof.poofDeathEffect(player);}
                else if (randomnumber == 1) {Lightning.lightningDeathEffect(player);}
                else if (randomnumber == 2) {Explosion.explosionDeathEffect(player);}


            }
        }
    }
}
