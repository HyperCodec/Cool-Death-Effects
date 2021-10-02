package com.tristandasavage.cooldeatheffects;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class DeathMessages {
    public static void sendDeathMessage(EntityDamageEvent event, Player player) {
        // You can change the death messages here
        if(event.getCause() == EntityDamageEvent.DamageCause.CRAMMING) {

            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was squished too much");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
            if(event instanceof EntityDamageByEntityEvent) {
                EntityDamageByEntityEvent entityevent = (EntityDamageByEntityEvent)event;
                if(entityevent.getDamager().getType() == EntityType.PLAYER) {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was rekt by " + entityevent.getDamager());
                }
                else {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was rekt by " + entityevent.getDamager().toString().substring(5));
                }
            }
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.LIGHTNING) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was struck by lightning");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.BLOCK_EXPLOSION) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " blew up");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.DROWNING) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " drowned");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.CONTACT) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " stepped in the wrong place");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.DRAGON_BREATH) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " died of the dragon's stinky breath");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " burnt to a crisp");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
            if(event instanceof EntityDamageByEntityEvent) {
                EntityDamageByEntityEvent entityevent = (EntityDamageByEntityEvent)event;
                if(entityevent.getDamager().getType() == EntityType.PLAYER) {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was nuked by " + entityevent.getDamager());
                }
                else if(entityevent.getDamager().getType() == EntityType.PRIMED_TNT || entityevent.getDamager().getType() == EntityType.MINECART_TNT) {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " blew up");
                }
                else {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was nuked by " + entityevent.getDamager().toString().substring(5));
                }
            }
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.FALL) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " fell from a skyscraper");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.FLY_INTO_WALL) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " experienced blunt force trauma");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.FIRE) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " sat in fire for too long");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.FREEZE) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was too icy for this world");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.CUSTOM) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " died of natural causes");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.HOT_FLOOR) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " found out the floor is lava");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " burned to a crisp");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.FALLING_BLOCK) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " got anviled");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.MAGIC) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was hocus-pocused");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.POISON) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " drank the wrong liquid");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.PROJECTILE) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was sniped");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.VOID) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " fell off the side of the earth");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.STARVATION) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was too poor to afford food");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.SUICIDE) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " committed suicide");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.WITHER) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " withered away");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.SUFFOCATION) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " was buried too far underground");
        }
        else if(event.getCause() == EntityDamageEvent.DamageCause.LAVA) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " thought the lava was a hot tub");
        }
    }
}
