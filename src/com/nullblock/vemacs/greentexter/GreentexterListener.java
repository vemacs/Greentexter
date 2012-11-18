package com.nullblock.vemacs.greentexter;
 
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class GreentexterListener implements Listener {
 
    private Greentexter plugin;
 
    public GreentexterListener(Greentexter greentexter) {
        plugin = greentexter;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
 
        @EventHandler(priority = EventPriority.LOW)
        public void onPlayerChat(AsyncPlayerChatEvent event) {
        	String eventMessage = event.getMessage();
        	if(eventMessage.startsWith(">")){
            	event.setMessage(ChatColor.GREEN + eventMessage);
        	}
    	}
 }
 