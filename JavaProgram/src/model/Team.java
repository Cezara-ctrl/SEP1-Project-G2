package model;

import java.util.ArrayList;

public class Team
{
  private int numberOfPlayers;
  private ArrayList<Player> players;


  public Team(int numberOfPlayers, ArrayList<Player> players)
  {
    this.numberOfPlayers = numberOfPlayers;
    this.players = new ArrayList<>();
  }

  public void addPlayer(Player player)
  {
    players.add(player);
  }


  public void removePlayer(Player player)
  {
    players.remove(player);
  }

  public int getNumberOfPlayers()
  {
    return numberOfPlayers;
  }

  public ArrayList<Player> getAllPlayers()
  {
    return players;
  }

  public String toString()
  {
    return "Number of players: " + numberOfPlayers + ". Players: " + players;
  }

}