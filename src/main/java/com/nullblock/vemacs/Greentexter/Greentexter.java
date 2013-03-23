package com.nullblock.vemacs.Greentexter;

import org.bukkit.plugin.java.JavaPlugin;

public final class Greentexter extends JavaPlugin {
    @Override
    public void onEnable() {
        new GreentexterListener(this);
    }
    @Override
    public void onDisable() {        
        
    }

}
