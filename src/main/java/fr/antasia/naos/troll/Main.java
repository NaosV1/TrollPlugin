package fr.antasia.naos.troll;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;


public final class Main extends JavaPlugin {

    private int resourceId;
    public static List<Material> sign = new ArrayList<Material>();
    public static List<Material> blocks = new ArrayList<Material>();
    public static List<Player> troll_replaceblock = new ArrayList<>();
    public static List<Player> troll_lavablock = new ArrayList<>();
    public static List<Player> troll_noplace = new ArrayList<>();
    public static List<Player> troll_nobreak = new ArrayList<>();
    public static List<Player> troll_randomchat = new ArrayList<>();
    public static List<Player> troll_instantdead = new ArrayList<>();
    public static Main instance;
    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new trollListener(), this);
        getCommand("troll").setExecutor( new trollCommand());
        getCommand("troll").setTabCompleter( new trollTabCompletion());
        int pluginId = 17886;
        cData.load();
        updateCheck();
        Metrics metrics = new Metrics(this, pluginId);
        for (Material block : Material.values()) {
            if (block.isBlock()) {
                blocks.add(block);
                if (block.name().contains("SIGN")) {
                    sign.add(block);
                }
            }
        }
    }

    private void updateCheck(){
        resourceId = 108424;
        try {
            URL url = new URL("https://api.spigotmc.org/legacy/update.php?resource=108424");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            if (!(content.toString().equals(getDescription().getVersion()))) {
                Bukkit.getConsoleSender().sendMessage("An update is available for AntaTroll ! Download it here : https://www.spigotmc.org/resources/antatroll.108424/");
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("Error checking update for AntaTroll : " + e.getMessage());
        }

    }



    public static Main getInstance(){
        return instance;
    }
}
