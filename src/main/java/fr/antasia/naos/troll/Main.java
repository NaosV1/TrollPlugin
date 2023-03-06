package fr.antasia.naos.troll;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;


public final class Main extends JavaPlugin {

    public static String version;
    public static List<Material> sign = new ArrayList<Material>();
    public static List<Material> blocks = new ArrayList<Material>();
    public static Map<Player, Integer> troll_replaceblock = new HashMap<Player, Integer>();
    public static Map<Player, Integer> troll_lavablock = new HashMap<Player, Integer>();
    public static Map<Player, Integer> troll_noplace = new HashMap<Player, Integer>();
    public static Map<Player, Integer> troll_nobreak = new HashMap<Player, Integer>();
    public static Map<Player, Integer> troll_randomchat = new HashMap<Player, Integer>();
    public static Map<Player, Integer> troll_instantdead = new HashMap<Player, Integer>();
    public static Main instance;
    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new trollListener(), this);
        getCommand("troll").setExecutor((CommandExecutor) new trollCommand());
        getCommand("troll").setTabCompleter((TabCompleter) new trollTabCompletion());

        for (Material block : Material.values()) {
            if (block.isBlock()) {
                blocks.add(block);
                if (block.name().contains("SIGN")) {
                    sign.add(block);
                }
            }
        }
    }

    public static Main getInstance(){
        return instance;
    }
}
