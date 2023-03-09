package fr.antasia.naos.troll;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class trollTabCompletion implements TabCompleter {


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        List<String> troll_list = new ArrayList<>();
        if (args.length == 2) {
            troll_list.add("replaceblock");
            troll_list.add("noplace");
            troll_list.add("nobreak");
            troll_list.add("randomchat");
            troll_list.add("forcechat");
            troll_list.add("instantdeath");
            troll_list.add("spam");
            troll_list.add("rocket");
            troll_list.add("turn");
            troll_list.add("explode");
            troll_list.add("burn");
            troll_list.add("zeus");
            troll_list.add("lavablock");
            troll_list.add("mob");
            return troll_list;
        } else if (args.length == 3) {
            if (args[1].equalsIgnoreCase("spam") || args[1].equalsIgnoreCase("burn")) {
                troll_list.add("10s");
                troll_list.add("20s");
                troll_list.add("30s");
                troll_list.add("40s");
                troll_list.add("50s");
                troll_list.add("1m");
                troll_list.add("5m");
                troll_list.add("10m");
                troll_list.add("15m");
                troll_list.add("20m");
                troll_list.add("25m");
                troll_list.add("30m");
                troll_list.add("1h");
                troll_list.add("2h");
                troll_list.add("3h");
                troll_list.add("4h");
                troll_list.add("5h");
            } else if (args[1].equalsIgnoreCase("turn")) {
                troll_list.add("10");
                troll_list.add("20");
                troll_list.add("40");
                troll_list.add("90");
                troll_list.add("180");
                troll_list.add("360");

            } else if (args[1].equalsIgnoreCase("rocket")) {
                for (int i = 1; i <= 20; i++) {
                    troll_list.add(String.valueOf(i));
                }
            } else if (args[1].equalsIgnoreCase("mob")) {
                troll_list.add("Zombie");
                troll_list.add("spider");
                troll_list.add("creeper");
                troll_list.add("skeleton");
                troll_list.add("witch");
                troll_list.add("enderman");
                troll_list.add("slime");
            }
        }
        return troll_list;
    }
}
