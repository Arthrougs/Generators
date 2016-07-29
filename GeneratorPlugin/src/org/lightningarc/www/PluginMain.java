package org.lightningarc.www;

import java.util.EventListener;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginMain extends JavaPlugin implements EventListener {

	@Override
	public void onEnable(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerEvents(), this);
		pm.registerEvents(this, this);
	}
	
	@Override
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
		return false;
	  }
	
	@EventHandler
	public void onJoin(PlayerLoginEvent event){
		
	}
	
}
