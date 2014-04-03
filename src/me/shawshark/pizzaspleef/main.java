package me.shawshark.pizzaspleef;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	Boolean status;
	
	public void onEnable() {
		try {
			PluginManager pm = Bukkit.getPluginManager();
			status = true;
			
			pm.registerEvents(new Command);
			
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
