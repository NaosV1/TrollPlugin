package fr.antasia.naos.troll;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class trollTabCompletion implements TabCompleter {


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 2) {
            List<String> troll_list = new ArrayList<String>();
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
            List<String> list = new ArrayList<String>();
            if (args[1].equalsIgnoreCase("spam") || args[1].equalsIgnoreCase("burn")) {
                list.add("10s");
                list.add("20s");
                list.add("30s");
                list.add("40s");
                list.add("50s");
                list.add("1m");
                list.add("5m");
                list.add("10m");
                list.add("15m");
                list.add("20m");
                list.add("25m");
                list.add("30m");
                list.add("1h");
                list.add("2h");
                list.add("3h");
                list.add("4h");
                list.add("5h");
            } else if (args[1].equalsIgnoreCase("turn")) {
                list.add("10");
                list.add("20");
                list.add("40");
                list.add("90");
                list.add("180");
                list.add("360");

            } else if (args[1].equalsIgnoreCase("rocket")) {
                for (int i = 1; i <= 20; i++) {
                    list.add(String.valueOf(i));
                }
            } else if (args[1].equalsIgnoreCase("mob")) {
                list.add("Zombie");
            }
            return list;
        }
        return null;
    }
}
