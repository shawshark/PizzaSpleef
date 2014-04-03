package me.shawshark.pizzaspleef;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Commands implements Listener {
	
	public main m;
	
	public Commands(main m) {
		this.m = m;
	}
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
		Player player = event.getPlayer();
		String[] command = event.getMessage();
		
		if(command[0].equalsIgnoreCase("/plugins") || (command[0].equalsIgnoreCase("/pl") || (command[0].equalsIgnoreCase("/?")))) {
			if(!player.hasPermission("plugins.viewbypass")) {
				event.setCancelled(true);
				player.sendMessage(m.Prefix + " " + ChatColor.RED + "You aren't allowed to view the plugins!");
			}
		}
	}
}