package org.lightningarc.www;

import java.util.EventListener;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginMain extends JavaPlugin implements EventListener {

	public void onEnable(){
		
	}
	
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
		return false;
	  }
	
	@EventHandler
	public void onJoin(PlayerLoginEvent event){
		Player player = event.getPlayer();
		player.sendMessage("Testaroni");
	}
	
}
