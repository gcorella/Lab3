package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;



public class Game {
	private UUID GameID;
	private UUID TableID;
	private List<Player> GamePlayers = new ArrayList<Player>();
	
	public Game(UUID tableID, ArrayList<Player> gp) {
		TableID = tableID;
		GamePlayers = gp;
		UUID.randomUUID();
	}
	
	
	


	public UUID getGameID() {
		return GameID;
	}
	
	public List<Player> getGamePlayers() {
		return GamePlayers;
	}



	public UUID getTableID() {
		return TableID;
	}
	
	public void setGameID(UUID gameID) {
		GameID = gameID;
	}


	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	
	public void setGamePlayers(List<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	
	public void AddPlayerToGame(Table t, Player p){
		t.AddPlayerToTable(p);	
		this.AddPlayerToGame(t, p);
	}
}