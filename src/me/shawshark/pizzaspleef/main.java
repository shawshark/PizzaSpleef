package me.shawshark.pizzaspleef;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import ru.tehkode.permissions.commands.CommandsManager;

public class main extends JavaPlugin {

	Boolean status;
	public String Prefix = ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "PizzaSpleef" + ChatColor.DARK_GRAY + "]";
	
	public void onEnable() {
		try {
			PluginManager pm = Bukkit.getPluginManager();
			status = true;
			
			pm.registerEvents(new Commands(this), this);
			
		} catch(Exception ex) {
			ex.printStackTrace();
			status = false;
		}
	}
	
	public void onDisable() {
		try {
			if(status) {
				
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
