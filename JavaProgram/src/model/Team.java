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

  public Team()
  {
    players = new ArrayList<Player>();
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

  public int size()
  {
    return players.size();
  }

  public Player get(int index)
  {
    if(index<players.size())
    {
      return players.get(index);
    }
    else
    {
      return null;
    }
  }

  public Player get(String name, int number, String position)
  {
    for(int i = 0; i<players.size(); i++)
    {
      Player temp = players.get(i);

      if(temp.getName().equals(name) && temp.getNumber()==number && temp.getPosition().equals(position))
      {
        return temp;
      }
    }
    return null;
  }

  public int getIndex(String name, int number, String position)
  {
    for(int i = 0; i<players.size(); i++)
    {
      Player temp = players.get(i);

      if(temp.getName().equals(name) && temp.getNumber()==number && temp.getPosition().equals(position))
      {
        return i;
      }
    }
    return -1;
  }

  public String toString()
  {
    return "Number of players: " + numberOfPlayers + ". Players: " + players;
  }

}