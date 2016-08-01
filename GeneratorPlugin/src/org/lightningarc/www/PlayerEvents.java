package org.lightningarc.www;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEvents implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		player.sendMessage("Testing!");
	}
	
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		if (event.getAction() == Action.RIGHT_CLICK_BLOCK){
			String blockname = event.getClickedBlock().getType().toString();
			event.getPlayer().sendMessage(blockname);
		}
	}
	
}
