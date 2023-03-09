package fr.antasia.naos.troll;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Random;

public class trollListener implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Location block = event.getBlock().getLocation();
        if (Main.troll_replaceblock.contains(event.getPlayer())) {
            Material randomBlock = Main.blocks.get(new Random().nextInt(Main.blocks.size()));
            block.getBlock().setType(randomBlock);
            if (Main.sign.contains(event.getBlock().getType())) {
                event.setCancelled(true);
            }
        }
        if (Main.troll_noplace.contains(event.getPlayer())) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        if (Main.troll_nobreak.contains(event.getPlayer())) {
            event.setCancelled(true);
        }
        if (Main.troll_lavablock.contains(event.getPlayer())) {
            event.getBlock().setType(Material.LAVA);
        }
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (Main.troll_randomchat.contains(player)) {
            String chars = event.getMessage();
            String newMessage = "";
            for (int i = 0; i < event.getMessage().length(); i++) {
                newMessage += chars.charAt(new Random().nextInt(chars.length()));
            }
            event.setMessage(newMessage);

        }
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (Main.troll_instantdead.contains(event.getEntity())) {
            Player player = (Player) event.getEntity();
            event.setCancelled(true);
            player.setHealth(0);
        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        if (Main.troll_instantdead.contains(player)) {
            String deathMessage = Main.getInstance().getConfig().getString("misc_message.instadeath_death_message");
            deathMessage = deathMessage.replace("%player%", player.getName());
            event.setDeathMessage(deathMessage);
            Main.troll_instantdead.remove(player);
        }
    }
}
