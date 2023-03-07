package fr.antasia.naos.troll;


import org.apache.commons.lang.RandomStringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class trollCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String prefix = Main.getInstance().getConfig().getString("prefix");
        prefix = ChatColor.translateAlternateColorCodes('&', prefix);
        if (command.getName().equalsIgnoreCase("troll") || command.getName().equalsIgnoreCase("antatroll")) {
            if (args.length == 0) {
                /*
                Troll's description
                 */
                String ReplaceBlock = Main.getInstance().getConfig().getString("help_troll.ReplaceBlock");
                ReplaceBlock = ChatColor.translateAlternateColorCodes('&', ReplaceBlock);
                String NoPlace = Main.getInstance().getConfig().getString("help_troll.NoPlace");
                NoPlace = ChatColor.translateAlternateColorCodes('&', NoPlace);
                String NoBreak = Main.getInstance().getConfig().getString("help_troll.NoBreak");
                NoBreak = ChatColor.translateAlternateColorCodes('&', NoBreak);
                String RandomChat = Main.getInstance().getConfig().getString("help_troll.RandomChat");
                RandomChat = ChatColor.translateAlternateColorCodes('&', RandomChat);
                String ForceChat = Main.getInstance().getConfig().getString("help_troll.ForceChat");
                ForceChat = ChatColor.translateAlternateColorCodes('&', ForceChat);
                String InstantDeath = Main.getInstance().getConfig().getString("help_troll.InstantDeath");
                InstantDeath = ChatColor.translateAlternateColorCodes('&', InstantDeath);
                String Spam = Main.getInstance().getConfig().getString("help_troll.Spam");
                Spam = ChatColor.translateAlternateColorCodes('&', Spam);
                String Rocket = Main.getInstance().getConfig().getString("help_troll.Rocket");
                Rocket = ChatColor.translateAlternateColorCodes('&', Rocket);
                String Turn = Main.getInstance().getConfig().getString("help_troll.Turn");
                Turn = ChatColor.translateAlternateColorCodes('&', Turn);
                String Explode = Main.getInstance().getConfig().getString("help_troll.Explode");
                Explode = ChatColor.translateAlternateColorCodes('&', Explode);
                String Burn = Main.getInstance().getConfig().getString("help_troll.Burn");
                Burn = ChatColor.translateAlternateColorCodes('&', Burn);
                String Zeus = Main.getInstance().getConfig().getString("help_troll.Zeus");
                Zeus = ChatColor.translateAlternateColorCodes('&', Zeus);
                String LavaBlock = Main.getInstance().getConfig().getString("help_troll.LavaBlock");
                LavaBlock = ChatColor.translateAlternateColorCodes('&', LavaBlock);
                String Mob = Main.getInstance().getConfig().getString("help_troll.Mob");
                Mob = ChatColor.translateAlternateColorCodes('&', Mob);

                /*
                Option
                 */
                String message_option = Main.getInstance().getConfig().getString("option_help.message");
                message_option = ChatColor.translateAlternateColorCodes('&', message_option);
                String time_option = Main.getInstance().getConfig().getString("option_help.time");
                time_option = ChatColor.translateAlternateColorCodes('&', time_option);
                String power_option = Main.getInstance().getConfig().getString("option_help.power");
                power_option = ChatColor.translateAlternateColorCodes('&', power_option);
                String degree_option = Main.getInstance().getConfig().getString("option_help.degree");
                degree_option = ChatColor.translateAlternateColorCodes('&', degree_option);
                String creature_option = Main.getInstance().getConfig().getString("option_help.creature");
                creature_option = ChatColor.translateAlternateColorCodes('&', creature_option);



                sender.sendMessage(prefix + " §cTrolls :");
                sender.sendMessage(" §c-> §r/antatroll §6[§bPlayer§6] §6[§bTroll§6] §6<§bOption§6>");
                if (sender.hasPermission("antatroll.reload")) {
                    sender.sendMessage("§7/antatroll reload §6- §7Reload the config");
                }
                sender.sendMessage("§7 [] = Not Optional\n <> = Optional");
                if (sender.hasPermission("antatroll.replaceblock") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[ReplaceBlock] §r: " + ReplaceBlock);
                }
                if (sender.hasPermission("antatroll.noplace") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[NoPlace] §r: " + NoPlace);
                }
                if (sender.hasPermission("antatroll.nobreak") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[NoBreak] §r: " + NoBreak);
                }
                if (sender.hasPermission("antatroll.randomchat") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[RandomChat] §r: " + RandomChat);
                }
                if (sender.hasPermission("antatroll.forcechat") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[ForceChat] §e<" + message_option + "> §r: " + ForceChat);
                }
                if (sender.hasPermission("antatroll.instantdeath") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[InstantDeath] §r: " + InstantDeath);
                }
                if (sender.hasPermission("antatroll.spam") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[Spam] §e<" + time_option + "> §r: " + Spam);
                }
                if (sender.hasPermission("antatroll.rocket") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[Rocket] §e<" + power_option + "> §r: " + Rocket);
                }
                if (sender.hasPermission("antatroll.turn") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[Turn] §e<" + degree_option + "> §r: " + Turn);
                }
                if (sender.hasPermission("antatroll.explode") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[Explode] §r: " + Explode);
                }
                if (sender.hasPermission("antatroll.burn") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[Burn] §e<" + time_option + "> §r: " + Burn);
                }
                if (sender.hasPermission("antatroll.zeus") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[Zeus] §r: " + Zeus);
                }
                if (sender.hasPermission("antatroll.lavablock") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[LavaBlock] §r: " + LavaBlock);
                }
                if (sender.hasPermission("antatroll.mob") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                    sender.sendMessage("- §b[Mob] §e<" + creature_option + "> §r: " + Mob);
                }
            } else if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (sender.hasPermission("antatroll.reload")) {
                        Main.getInstance().reloadConfig();
                        String config_reloaded = Main.getInstance().getConfig().getString("config_reloaded");
                        config_reloaded = ChatColor.translateAlternateColorCodes('&', config_reloaded);
                        sender.sendMessage(prefix + config_reloaded);
                    } else {
                        String no_permission = Main.getInstance().getConfig().getString("misc_message.no_permission");
                        no_permission = ChatColor.translateAlternateColorCodes('&', no_permission);
                        sender.sendMessage(prefix + no_permission);
                    }
                } else {
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player != null) {
                        if (args.length >= 2) {
                            String message_enable = Main.getInstance().getConfig().getString("misc_message.troll_enabled");
                            message_enable = ChatColor.translateAlternateColorCodes('&', message_enable);
                            message_enable = message_enable.replace("%player%", player.getName());
                            message_enable = message_enable.replace("%troll%", args[1]);

                            String message_disable = Main.getInstance().getConfig().getString("misc_message.troll_disabled");
                            message_disable = ChatColor.translateAlternateColorCodes('&', message_disable);
                            message_disable = message_disable.replace("%player%", player.getName());
                            message_disable = message_disable.replace("%troll%", args[1]);

                             if (args[1].equalsIgnoreCase("replaceblock")) {
                                 if (sender.hasPermission("antatroll.replaceblock") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (Main.troll_replaceblock.contains(player)) {
                                         Main.troll_replaceblock.remove(player);

                                         sender.sendMessage(prefix + message_disable);
                                     } else {
                                         Main.troll_replaceblock.add(player);
                                         sender.sendMessage(prefix + message_enable);
                                     }
                                 }

                            } else if (args[1].equalsIgnoreCase("noplace")) {
                                 if (sender.hasPermission("antatroll.noplace") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (Main.troll_noplace.contains(player)) {
                                         Main.troll_noplace.remove(player);
                                         sender.sendMessage(prefix + message_disable);
                                     } else {
                                         Main.troll_noplace.add(player);
                                         sender.sendMessage(prefix + message_enable);
                                     }
                                 }

                            } else if (args[1].equalsIgnoreCase("nobreak")) {
                                 if (sender.hasPermission("antatroll.nobreak") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (Main.troll_nobreak.contains(player)) {
                                         Main.troll_nobreak.remove(player);
                                         sender.sendMessage(prefix + message_disable);
                                     } else {
                                         Main.troll_nobreak.add(player);
                                         sender.sendMessage(prefix + message_enable);
                                     }
                                 }

                            } else if (args[1].equalsIgnoreCase("randomchat")) {
                                 if (sender.hasPermission("antatroll.randomchat") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (Main.troll_randomchat.contains(player)) {
                                         Main.troll_randomchat.remove(player);
                                         sender.sendMessage(prefix + message_disable);
                                     } else {
                                         Main.troll_randomchat.add(player);
                                         sender.sendMessage(prefix + message_enable);
                                     }
                                 }
                            } else if (args[1].equalsIgnoreCase("forcechat")) {
                                 if (sender.hasPermission("antatroll.forcechat") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (args.length >= 3) {
                                         String message = "";
                                         for (int i = 2; i < args.length; i++) {
                                             message = message + args[i] + " ";
                                         }
                                         int isrdmchat = 0;
                                         if (Main.troll_randomchat.contains(player)) {
                                             isrdmchat = 1;
                                             Main.troll_randomchat.remove(player);
                                         }
                                         player.chat(message);
                                         if (isrdmchat == 1) {
                                             Main.troll_randomchat.add(player);
                                         }
                                         String message_forcechat = Main.getInstance().getConfig().getString("misc_message.forcechat.sent");
                                         message_forcechat = ChatColor.translateAlternateColorCodes('&', message_forcechat);
                                         message_forcechat = message_forcechat.replace("%player%", player.getName());
                                         message_forcechat = message_forcechat.replace("%message%", message);
                                         sender.sendMessage(prefix + message_forcechat);
                                     } else {
                                         String message_not_specified = Main.getInstance().getConfig().getString("misc_message.forcechat.not_specified");
                                         message_not_specified = ChatColor.translateAlternateColorCodes('&', message_not_specified);

                                         sender.sendMessage(prefix + message_not_specified);

                                         /*
                                         TODO : Continue here
                                          */
                                     }
                                 }
                            } else if (args[1].equalsIgnoreCase("instantdeath")) {
                                 if (sender.hasPermission("antatroll.instantdeath") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (Main.troll_instantdead.contains(player)) {
                                         Main.troll_instantdead.remove(player);
                                         sender.sendMessage(prefix + message_disable);
                                     } else {
                                         Main.troll_instantdead.add(player);
                                         String player_instadeath = Main.getInstance().getConfig().getString("misc_message.player_instadeath");
                                         player_instadeath = ChatColor.translateAlternateColorCodes('&', player_instadeath);
                                         player_instadeath = player_instadeath.replace("%player%", player.getName());
                                         sender.sendMessage(prefix + player_instadeath);
                                     }
                                 }
                            } else if (args[1].equalsIgnoreCase("rocket")) {
                                 if (sender.hasPermission("antatroll.rocket") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (args.length >= 3) {
                                         if (isInt(args[2])) {
                                             int power = Integer.parseInt(args[2]);
                                             if (!(power > 20)) {
                                                player.setVelocity(player.getVelocity().setY(power));
                                                String player_launched_in_the_sky = Main.getInstance().getConfig().getString("misc_message.player_launched_in_the_sky");
                                                player_launched_in_the_sky = ChatColor.translateAlternateColorCodes('&', player_launched_in_the_sky);
                                                player_launched_in_the_sky = player_launched_in_the_sky.replace("%player%", player.getName());
                                                player_launched_in_the_sky = player_launched_in_the_sky.replace("%power%", args[2]);
                                                sender.sendMessage(prefix + player_launched_in_the_sky);
                                             } else {
                                                 int max = 20;
                                                 int min = 0;
                                                 String message = Main.getInstance().getConfig().getString("misc_message.int_invalid");
                                                 message = ChatColor.translateAlternateColorCodes('&', message);
                                                 message = message.replace("%min%", String.valueOf(min));
                                                 message = message.replace("%max%", String.valueOf(max));
                                                 sender.sendMessage(prefix + message);
                                             }
                                         }
                                     } else {
                                         int max = 20;
                                         int min = 1;
                                         String message = Main.getInstance().getConfig().getString("misc_message.int_invalid");
                                         message = ChatColor.translateAlternateColorCodes('&', message);
                                         message = message.replace("%min%", String.valueOf(min));
                                         message = message.replace("%max%", String.valueOf(max));
                                         sender.sendMessage(prefix + message);
                                     }
                                 }
                            } else if (args[1].equalsIgnoreCase("spam")) {
                                 if (sender.hasPermission("antatroll.spam") || sender.hasPermission("antatroll.*") || sender.isOp()) {

                                     if (args.length >= 3) {

                                         String message = args[2].substring(0, args[2].length() - 1);
                                         if (isInt(message)) {
                                             if (args[2].contains("s")) {
                                                 int time = Integer.parseInt(message);
                                                 if (time > 0) {
                                                     player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20 * time, 5));
                                                     player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * time, 5));
                                                     String timestamp = Main.getInstance().getConfig().getString("time.seconds");
                                                     String player_spam_effect = Main.getInstance().getConfig().getString("misc_message.player_spam_effect");
                                                     player_spam_effect = ChatColor.translateAlternateColorCodes('&', player_spam_effect);
                                                     player_spam_effect = player_spam_effect.replace("%player%", player.getName());
                                                     player_spam_effect = player_spam_effect.replace("%time%", time + " " + timestamp);
                                                     sender.sendMessage(prefix + player_spam_effect);
                                                     Bukkit.getScheduler().runTaskAsynchronously(Main.getInstance(), new Runnable() {
                                                         @Override
                                                         public void run() {
                                                             for (int i = 0; i < time; i++) {
                                                                 for (int j = 0; j < 50; j++) {
                                                                     if (player != null) {
                                                                         String randomString = RandomStringUtils.randomAlphabetic(30);
                                                                         String randomColor = ChatColor.values()[new Random().nextInt(ChatColor.values().length)].toString();
                                                                         player.sendMessage(randomColor + randomString);
                                                                         player.sendTitle("§c§lWe ran into a problem..", randomColor + randomString, 0, 20, 0);
                                                                         try {
                                                                             Thread.sleep(50);
                                                                         } catch (InterruptedException e) {
                                                                             e.printStackTrace();
                                                                         }
                                                                     }
                                                                     player.playSound(player.getLocation(), Sound.values()[new Random().nextInt(Sound.values().length)], 1, 1);
                                                                 }
                                                                 if (i >= time - 1) {
                                                                     player.sendTitle("§c§l? A problem ?", "§f§uSolved... I think ?", 0, 20, 20);
                                                                 }
                                                             }
                                                             player.stopSound(Sound.values()[new Random().nextInt(Sound.values().length)]);

                                                         }
                                                     });
                                                 } else {
                                                     String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                                     valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                                     sender.sendMessage(prefix + valid_time);
                                                 }
                                             } else if (args[2].contains("m")) {
                                                 int time = Integer.parseInt(message);
                                                 if (time > 0) {
                                                     player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20 * 60 * time, 5));
                                                     player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 60 * time, 5));
                                                     String timestamp = Main.getInstance().getConfig().getString("time.minutes");
                                                     String player_spam_effect = Main.getInstance().getConfig().getString("misc_message.player_spam_effect");
                                                     player_spam_effect = ChatColor.translateAlternateColorCodes('&', player_spam_effect);
                                                     player_spam_effect = player_spam_effect.replace("%player%", player.getName());
                                                     player_spam_effect = player_spam_effect.replace("%time%", time + " " + timestamp);
                                                     sender.sendMessage(prefix + player_spam_effect);
                                                     Bukkit.getScheduler().runTaskAsynchronously(Main.getInstance(), new Runnable() {
                                                         @Override
                                                         public void run() {
                                                             for (int i = 0; i < time; i++) {
                                                                 for (int j = 0; j < 50 * 60; j++) {
                                                                     if (player != null) {
                                                                         String randomString = RandomStringUtils.randomAlphabetic(30);
                                                                         String randomColor = ChatColor.values()[new Random().nextInt(ChatColor.values().length)].toString();
                                                                         player.sendMessage(randomColor + randomString);
                                                                         player.sendTitle("§c§lWe ran into a problem..", randomColor + randomString, 0, 20, 0);
                                                                         try {
                                                                             Thread.sleep(50);
                                                                         } catch (InterruptedException e) {
                                                                             e.printStackTrace();
                                                                         }
                                                                     }
                                                                     player.playSound(player.getLocation(), Sound.values()[new Random().nextInt(Sound.values().length)], 1, 1);
                                                                 }
                                                                 if (i >= time - 1) {
                                                                     player.sendTitle("§c§l? A problem ?", "§f§uSolved... I think ?", 0, 20, 20);
                                                                 }
                                                             }
                                                             player.stopSound(Sound.values()[new Random().nextInt(Sound.values().length)]);


                                                         }
                                                     });
                                                 } else {
                                                     String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                                     valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                                     sender.sendMessage(prefix + valid_time);
                                                 }
                                             } else if (args[2].contains("h")) {
                                                 int time = Integer.parseInt(message);
                                                 if (time > 0) {
                                                     player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20 * 60 * 60 * time, 5));
                                                     player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 60 * 60 * time, 5));
                                                     String timestamp = Main.getInstance().getConfig().getString("time.minutes");
                                                     String player_spam_effect = Main.getInstance().getConfig().getString("misc_message.player_spam_effect");
                                                     player_spam_effect = ChatColor.translateAlternateColorCodes('&', player_spam_effect);
                                                     player_spam_effect = player_spam_effect.replace("%player%", player.getName());
                                                     player_spam_effect = player_spam_effect.replace("%time%", time + " " + timestamp);
                                                     sender.sendMessage(prefix + player_spam_effect);
                                                     Bukkit.getScheduler().runTaskAsynchronously(Main.getInstance(), new Runnable() {
                                                         @Override
                                                         public void run() {
                                                             for (int i = 0; i < time; i++) {
                                                                 for (int j = 0; j < 50 * 60 * 60; j++) {
                                                                     if (player != null) {
                                                                         String randomString = RandomStringUtils.randomAlphabetic(30);
                                                                         String randomColor = ChatColor.values()[new Random().nextInt(ChatColor.values().length)].toString();
                                                                         player.sendMessage(randomColor + randomString);
                                                                         player.sendTitle("§c§lWe ran into a problem..", randomColor + randomString, 0, 20, 0);
                                                                         try {
                                                                             Thread.sleep(50);
                                                                         } catch (InterruptedException e) {
                                                                             e.printStackTrace();
                                                                         }
                                                                     }
                                                                     player.playSound(player.getLocation(), Sound.values()[new Random().nextInt(Sound.values().length)], 1, 1);
                                                                 }
                                                                 if (i >= time - 1) {
                                                                     player.sendTitle("§c§l? A problem ?", "§f§uSolved... I think ?", 0, 20, 20);
                                                                 }
                                                             }
                                                             player.stopSound(Sound.values()[new Random().nextInt(Sound.values().length)]);

                                                         }
                                                     });
                                                 } else {
                                                     String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                                     valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                                     sender.sendMessage(prefix + valid_time);
                                                 }
                                             } else {
                                                 String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                                 valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                                 sender.sendMessage(prefix + valid_time);
                                             }
                                         } else {
                                             String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                             valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                             sender.sendMessage(prefix + valid_time);
                                         }
                                     } else {
                                         String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                         valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                         sender.sendMessage(prefix + valid_time);
                                     }
                                 }
                            } else if (args[1].equalsIgnoreCase("turn")) {
                                 if (sender.hasPermission("antatroll.turn") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (args.length >= 3) {
                                         if (isInt(args[2])) {
                                             int rotate = Integer.parseInt(args[2]);
                                             Location loc = player.getLocation();
                                             loc.setYaw(loc.getYaw() + rotate);
                                             player.teleport(loc);

                                             String player_rotated = Main.getInstance().getConfig().getString("misc_message.player_rotated");
                                             player_rotated = ChatColor.translateAlternateColorCodes('&', player_rotated);
                                             player_rotated = player_rotated.replace("%player%", player.getName());
                                             player_rotated = player_rotated.replace("%degree%", args[2]);
                                             sender.sendMessage(prefix + player_rotated);
                                         } else {
                                             String not_integer = Main.getInstance().getConfig().getString("misc_message.not_integer");
                                             not_integer = ChatColor.translateAlternateColorCodes('&', not_integer);
                                             sender.sendMessage(prefix + not_integer);
                                         }
                                     } else {
                                         String not_integer = Main.getInstance().getConfig().getString("misc_message.not_integer");
                                         not_integer = ChatColor.translateAlternateColorCodes('&', not_integer);
                                         sender.sendMessage(prefix + not_integer);
                                     }
                                 }
                            } else if (args[1].equalsIgnoreCase("explode")) {
                                 if (sender.hasPermission("antatroll.explode") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     player.getWorld().createExplosion(player.getLocation(), 1.0F, false, false);
                                     String player_fake_explosion = Main.getInstance().getConfig().getString("misc_message.player_fake_explosion");
                                     player_fake_explosion = ChatColor.translateAlternateColorCodes('&', player_fake_explosion);
                                     player_fake_explosion = player_fake_explosion.replace("%player%", player.getName());
                                     sender.sendMessage(prefix + player_fake_explosion);
                                 }

                            } else if (args[1].equalsIgnoreCase("burn")) {
                                 if (sender.hasPermission("antatroll.burn") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (args.length >= 3) {
                                         String message = args[2].substring(0, args[2].length() - 1);
                                         if (isInt(message)) {
                                             if (args[2].contains("s")) {
                                                 int time = Integer.parseInt(message);
                                                 player.setFireTicks(20*time);
                                                 String timestamp = Main.getInstance().getConfig().getString("time.seconds");
                                                 String player_burned_for = Main.getInstance().getConfig().getString("misc_message.player_burned_for");
                                                 player_burned_for = ChatColor.translateAlternateColorCodes('&', player_burned_for);
                                                 player_burned_for = player_burned_for.replace("%player%", player.getName());
                                                 player_burned_for = player_burned_for.replace("%time%", time + " " + timestamp);
                                                 sender.sendMessage(prefix + player_burned_for);
                                             } else if (args[2].contains("m")) {
                                                 int time = Integer.parseInt(message);
                                                 player.setFireTicks(20*time*60);
                                                 String timestamp = Main.getInstance().getConfig().getString("time.minutes");
                                                 String player_burned_for = Main.getInstance().getConfig().getString("misc_message.player_burned_for");
                                                 player_burned_for = ChatColor.translateAlternateColorCodes('&', player_burned_for);
                                                 player_burned_for = player_burned_for.replace("%player%", player.getName());
                                                 player_burned_for = player_burned_for.replace("%time%", time + " " + timestamp);
                                                 sender.sendMessage(prefix + player_burned_for);
                                             } else if (args[2].contains("h")) {
                                                 int time = Integer.parseInt(message);
                                                 player.setFireTicks(20*time*60*60);
                                                 String timestamp = Main.getInstance().getConfig().getString("time.seconds");
                                                 String player_burned_for = Main.getInstance().getConfig().getString("misc_message.player_burned_for");
                                                 player_burned_for = ChatColor.translateAlternateColorCodes('&', player_burned_for);
                                                 player_burned_for = player_burned_for.replace("%player%", player.getName());
                                                 player_burned_for = player_burned_for.replace("%time%", time + " " + timestamp);
                                                 sender.sendMessage(prefix + player_burned_for);
                                             } else {
                                                 String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                                 valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                                 sender.sendMessage(prefix + valid_time);
                                             }
                                         } else {
                                             String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                             valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                             sender.sendMessage(prefix + valid_time);
                                         }
                                     } else {
                                         String valid_time = Main.getInstance().getConfig().getString("misc_message.invalid_time");
                                         valid_time = ChatColor.translateAlternateColorCodes('&', valid_time);
                                         sender.sendMessage(prefix + valid_time);
                                     }
                                 }
                            } else if (args[1].equalsIgnoreCase("zeus")) {
                                 if (sender.hasPermission("antatroll.zeus") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     player.getWorld().strikeLightning(player.getLocation());
                                     String lightning_launched = Main.getInstance().getConfig().getString("misc_message.lightning_launched");
                                     lightning_launched = ChatColor.translateAlternateColorCodes('&', lightning_launched);
                                     lightning_launched = lightning_launched.replace("%player%", player.getName());
                                     sender.sendMessage(prefix + lightning_launched);
                                 }
                            } else if (args[1].equalsIgnoreCase("mob")) {
                                 if (sender.hasPermission("antatroll.mob") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (args.length >= 3) {
                                         if (args[2].equalsIgnoreCase("zombie")) {


                                             Location loc = player.getLocation();
                                             int x = loc.getBlockX();
                                             int y = loc.getBlockY();
                                             int z = loc.getBlockZ();
                                             int radius = 10;
                                             int x1 = x + (int) (Math.random() * radius * 2) - radius;
                                             int z1 = z + (int) (Math.random() * radius * 2) - radius;
                                             int y1 = y + (int) (Math.random() * radius * 2) - radius;
                                             Location loc1 = new Location(loc.getWorld(), x1, y1, z1);

                                             Zombie zombie = (Zombie) player.getWorld().spawnEntity(loc1, EntityType.ZOMBIE);
                                                zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(500);
                                                zombie.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(10);
                                                zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
                                                zombie.setHealth(500);
                                                zombie.setCanPickupItems(false);
                                                zombie.setTarget(player);


                                             String mob_sent = Main.getInstance().getConfig().getString("misc_message.mob.mob_sent");
                                            mob_sent = ChatColor.translateAlternateColorCodes('&', mob_sent);
                                            mob_sent = mob_sent.replace("%player%", player.getName());
                                            mob_sent = mob_sent.replace("%mob%", args[2]);

                                            sender.sendMessage(prefix + mob_sent);

                                         } else if (args[2].equalsIgnoreCase("spider")) {
                                             Location loc = player.getLocation();
                                             int x = loc.getBlockX();
                                             int y = loc.getBlockY();
                                             int z = loc.getBlockZ();
                                             int radius = 10;
                                             int x1 = x + (int) (Math.random() * radius * 2) - radius;
                                             int z1 = z + (int) (Math.random() * radius * 2) - radius;
                                             int y1 = y + (int) (Math.random() * radius * 2) - radius;
                                             Location loc1 = new Location(loc.getWorld(), x1, y1, z1);

                                             Spider spider = (Spider) player.getWorld().spawnEntity(loc1, EntityType.SPIDER);
                                             spider.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(500);
                                             spider.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(10);
                                             spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
                                             spider.setHealth(500);
                                             spider.setCanPickupItems(false);
                                             spider.setTarget(player);
                                         } else if (args[2].equalsIgnoreCase("creeper")) {


                                             Location loc = player.getLocation();
                                             int x = loc.getBlockX();
                                             int y = loc.getBlockY();
                                             int z = loc.getBlockZ();
                                             int radius = 10;
                                             int x1 = x + (int) (Math.random() * radius * 2) - radius;
                                             int z1 = z + (int) (Math.random() * radius * 2) - radius;
                                             int y1 = y + (int) (Math.random() * radius * 2) - radius;
                                             Location loc1 = new Location(loc.getWorld(), x1, y1, z1);
                                             Creeper creeper = (Creeper) player.getWorld().spawnEntity(loc1, EntityType.CREEPER);
                                             creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(500);
                                             creeper.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(10);
                                             creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
                                             creeper.setHealth(500);
                                             creeper.setCanPickupItems(false);
                                             creeper.setTarget(player);
                                         } else if (args[2].equalsIgnoreCase("skeleton")) {
                                                Location loc = player.getLocation();
                                                int x = loc.getBlockX();
                                                int y = loc.getBlockY();
                                                int z = loc.getBlockZ();
                                                int radius = 10;
                                                int x1 = x + (int) (Math.random() * radius * 2) - radius;
                                                int z1 = z + (int) (Math.random() * radius * 2) - radius;
                                                int y1 = y + (int) (Math.random() * radius * 2) - radius;
                                                Location loc1 = new Location(loc.getWorld(), x1, y1, z1);
                                                Skeleton skeleton = (Skeleton) player.getWorld().spawnEntity(loc1, EntityType.SKELETON);
                                                skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(500);
                                                skeleton.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(10);
                                                skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
                                                skeleton.setHealth(500);
                                                skeleton.setCanPickupItems(false);
                                                skeleton.setTarget(player);
                                         } else if (args[2].equalsIgnoreCase("enderman")) {
                                                Location loc = player.getLocation();
                                                int x = loc.getBlockX();
                                                int y = loc.getBlockY();
                                                int z = loc.getBlockZ();
                                                int radius = 10;
                                                int x1 = x + (int) (Math.random() * radius * 2) - radius;
                                                int z1 = z + (int) (Math.random() * radius * 2) - radius;
                                                int y1 = y + (int) (Math.random() * radius * 2) - radius;
                                                Location loc1 = new Location(loc.getWorld(), x1, y1, z1);
                                                Enderman enderman = (Enderman) player.getWorld().spawnEntity(loc1, EntityType.ENDERMAN);
                                                enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(500);
                                                enderman.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(10);
                                                enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
                                                enderman.setHealth(500);
                                                enderman.setCanPickupItems(false);
                                                enderman.setTarget(player);
                                         } else if (args[2].equalsIgnoreCase("witch")) {
                                                Location loc = player.getLocation();
                                                int x = loc.getBlockX();
                                                int y = loc.getBlockY();
                                                int z = loc.getBlockZ();
                                                int radius = 10;
                                                int x1 = x + (int) (Math.random() * radius * 2) - radius;
                                                int z1 = z + (int) (Math.random() * radius * 2) - radius;
                                                int y1 = y + (int) (Math.random() * radius * 2) - radius;
                                                Location loc1 = new Location(loc.getWorld(), x1, y1, z1);
                                                Witch witch = (Witch) player.getWorld().spawnEntity(loc1, EntityType.WITCH);
                                                witch.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(500);
                                                witch.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(10);
                                                witch.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
                                                witch.setHealth(500);
                                                witch.setCanPickupItems(false);
                                                witch.setTarget(player);
                                         } else if (args[2].equalsIgnoreCase("slime")) {
                                                Location loc = player.getLocation();
                                                int x = loc.getBlockX();
                                                int y = loc.getBlockY();
                                                int z = loc.getBlockZ();
                                                int radius = 10;
                                                int x1 = x + (int) (Math.random() * radius * 2) - radius;
                                                int z1 = z + (int) (Math.random() * radius * 2) - radius;
                                                int y1 = y + (int) (Math.random() * radius * 2) - radius;
                                                Location loc1 = new Location(loc.getWorld(), x1, y1, z1);
                                                Slime slime = (Slime) player.getWorld().spawnEntity(loc1, EntityType.SLIME);
                                                slime.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(500);
                                                slime.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(10);
                                                slime.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
                                                slime.setHealth(500);
                                                slime.setCanPickupItems(false);
                                                slime.setTarget(player);
                                         } else {
                                             String invalid_mob = Main.getInstance().getConfig().getString("misc_message.mob.mob_not_found");
                                             invalid_mob = ChatColor.translateAlternateColorCodes('&', invalid_mob);
                                             sender.sendMessage(prefix + invalid_mob);
                                         }

                                     } else {
                                         String invalid_mob = Main.getInstance().getConfig().getString("misc_message.mob.mob_not_specified");
                                         invalid_mob = ChatColor.translateAlternateColorCodes('&', invalid_mob);
                                         sender.sendMessage(prefix + invalid_mob);
                                     }
                                 }
                             } else if (args[1].equalsIgnoreCase("lavablock")) {
                                 if (sender.hasPermission("antatroll.lavablock") || sender.hasPermission("antatroll.*") || sender.isOp()) {
                                     if (Main.troll_lavablock.contains(player)) {
                                         Main.troll_lavablock.remove(player);
                                         sender.sendMessage(prefix + message_disable);
                                     } else {
                                         Main.troll_lavablock.add(player);
                                         sender.sendMessage(prefix + message_enable);
                                     }
                                 }
                            } else {
                                 String troll_not_found = Main.getInstance().getConfig().getString("misc_message.troll_not_found");
                                 troll_not_found = ChatColor.translateAlternateColorCodes('&', troll_not_found);
                                 troll_not_found = troll_not_found.replace("%troll%", args[1]);
                                sender.sendMessage(prefix + troll_not_found);
                            }
                        } else {
                            String troll_not_specified = Main.getInstance().getConfig().getString("misc_message.troll_not_specified");
                            troll_not_specified = ChatColor.translateAlternateColorCodes('&', troll_not_specified);
                            sender.sendMessage(prefix + troll_not_specified);
                        }
                    } else {
                        String player_not_found = Main.getInstance().getConfig().getString("misc_message.player_not_found");
                        player_not_found = ChatColor.translateAlternateColorCodes('&', player_not_found);
                        sender.sendMessage(prefix + player_not_found);
                    }
                }
            } else {
                String player_not_specified = Main.getInstance().getConfig().getString("misc_message.player_not_specified");
                player_not_specified = ChatColor.translateAlternateColorCodes('&', player_not_specified);
                sender.sendMessage(prefix + player_not_specified);
            }

        }
        return false;
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}