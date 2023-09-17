package me.v0rham.needful;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    static Main instance;

    @Override
    public void onEnable() {
        if (instance == null) instance = this;
    }

    @Override
    public void onDisable() {
        if (instance != null) instance = null;
    }
    
    public static Main getInstance() {
        return instance;
    }
}
