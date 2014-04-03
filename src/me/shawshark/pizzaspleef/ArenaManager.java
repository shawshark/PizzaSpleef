package me.shawshark.pizzaspleef;

import java.util.ArrayList;
import java.util.List;

public class ArenaManager {
	
	main m;
	List<PlayerInfo> PlayerInfo = new ArrayList<PlayerInfo>();
	List<ArenaLocations> ArenaLoctions = new ArrayList<ArenaLocations>();
	List<Arena> Arena = new ArrayList<Arena>();
	
	public ArenaManager(main m) {
		this.m = m;
	}
	
	public Boolean playerInGame(String player) {
		for ( PlayerInfo PlayerInfo : this.PlayerInfo ) {
			if ( PlayerInfo.playerName.equalsIgnoreCase( player )) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean activeArena( String arenaName ) {
		for ( PlayerInfo PlayerInfo : this.PlayerInfo ) {
			if ( PlayerInfo.arenaName.equalsIgnoreCase( arenaName ) ) {
				return true;
			}
		}
		return false;
	}
}
