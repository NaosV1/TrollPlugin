package fr.antasia.naos.troll;

import org.bukkit.ChatColor;

public class cData {

        public static String ReplaceBlock = Main.getInstance().getConfig().getString("help_troll.ReplaceBlock");
        public static String NoPlace = Main.getInstance().getConfig().getString("help_troll.NoPlace");
        public static String NoBreak = Main.getInstance().getConfig().getString("help_troll.NoBreak");
        public static String RandomChat = Main.getInstance().getConfig().getString("help_troll.RandomChat");
        public static String ForceChat = Main.getInstance().getConfig().getString("help_troll.ForceChat");
        public static String InstantDeath = Main.getInstance().getConfig().getString("help_troll.InstantDeath");
        public static String Rocket = Main.getInstance().getConfig().getString("help_troll.Rocket");
        public static String Spam = Main.getInstance().getConfig().getString("help_troll.Spam");
        public static String Turn = Main.getInstance().getConfig().getString("help_troll.Turn");
        public static String Explode = Main.getInstance().getConfig().getString("help_troll.Explode");
        public static String Burn = Main.getInstance().getConfig().getString("help_troll.Burn");
        public static String Zeus = Main.getInstance().getConfig().getString("help_troll.Zeus");
        public static String LavaBlock = Main.getInstance().getConfig().getString("help_troll.LavaBlock");
        public static String Mob = Main.getInstance().getConfig().getString("help_troll.Mob");
        public static String message_option = Main.getInstance().getConfig().getString("option_help.message");
        public static String time_option = Main.getInstance().getConfig().getString("option_help.time");
        public static String power_option = Main.getInstance().getConfig().getString("option_help.power");
        public static String degree_option = Main.getInstance().getConfig().getString("option_help.degree");
        public static String creature_option = Main.getInstance().getConfig().getString("option_help.creature");

        public static String prefix = Main.getInstance().getConfig().getString("prefix");
    public static void load() {
        prefix = ChatColor.translateAlternateColorCodes('&', prefix);
        ReplaceBlock = ChatColor.translateAlternateColorCodes('&', ReplaceBlock);
        InstantDeath = ChatColor.translateAlternateColorCodes('&', InstantDeath);
        NoPlace = ChatColor.translateAlternateColorCodes('&', NoPlace);
        NoBreak = ChatColor.translateAlternateColorCodes('&', NoBreak);
        RandomChat = ChatColor.translateAlternateColorCodes('&', RandomChat);
        ForceChat = ChatColor.translateAlternateColorCodes('&', ForceChat);
        Spam = ChatColor.translateAlternateColorCodes('&', Spam);
        Rocket = ChatColor.translateAlternateColorCodes('&', Rocket);
        Turn = ChatColor.translateAlternateColorCodes('&', Turn);
        Explode = ChatColor.translateAlternateColorCodes('&', Explode);
        Burn = ChatColor.translateAlternateColorCodes('&', Burn);
        Zeus = ChatColor.translateAlternateColorCodes('&', Zeus);
        LavaBlock = ChatColor.translateAlternateColorCodes('&', LavaBlock);
        Mob = ChatColor.translateAlternateColorCodes('&', Mob);
        message_option = ChatColor.translateAlternateColorCodes('&', message_option);
        time_option = ChatColor.translateAlternateColorCodes('&', time_option);
        power_option = ChatColor.translateAlternateColorCodes('&', power_option);
        degree_option = ChatColor.translateAlternateColorCodes('&', degree_option);
        creature_option = ChatColor.translateAlternateColorCodes('&', creature_option);

    }
}
