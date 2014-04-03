package me.shawshark.pizzaspleef;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	Boolean status;
	
	public void onEnable() {
		try {
			
			status = true;
			
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
