package model;

import java.util.ArrayList;

/**
 * A class containing a constructor for team and also the methods for using this data.
 * @author Rodrigo Valente
 * @version 1.0
 */
public class Team
{
  private int numberOfPlayers;
  private ArrayList<Player> players;

  /**
   * Constructor initializing the Team.
   *
   * @param numberOfPlayers the number of players that are in the team
   * @param players all the players that are in the team
   */
  public Team(int numberOfPlayers, ArrayList<Player> players)
  {
    this.numberOfPlayers = numberOfPlayers;
    this.players = new ArrayList<>();
  }

  /**
   * Constructor initializing the Team.
   *
   */
  public Team()
  {
    players = new ArrayList<Player>();
  }

  /**
   * Add a player in all players.
   *
   * @param player the player that we want to add.
   */
  public void addPlayer(Player player)
  {
    players.add(player);
  }

  /**
   * Remove a player in all players.
   *
   * @param player the player that we want to remove
   */
  public void removePlayer(Player player)
  {
    players.remove(player);
  }

  /**
   * Gets the number of players in the team.
   *
   * @return the number of players.
   */
  public int getNumberOfPlayers()
  {
    return numberOfPlayers;
  }

  /**
   * Gets all the players that are in the team.
   *
   * @return all the players that are in the team
   */
  public ArrayList<Player> getAllPlayers()
  {
    return players;
  }

  /**
   * Gets how many players exist.
   *
   * @return how many players exist.
   */
  public int size()
  {
    return players.size();
  }


  /**
   * Gets a player by an index
   *
   * @param index player index that we wanna get
   * @return a player with the set index
   */
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

  /**
   * Gets a player by the name, number and position
   *
   * @param name the name of the player
   * @param number the number of the player
   * @param position the position of the player
   * @return a player with a given name, number and position
   */
  public Player get(String name, int number, String position)
  {
    for(int i = 0; i<players.size(); i++)
    {
      Player temp = players.get(i);

      if(temp.getName().equals(name) && temp.getNumber()==(number) && temp.getPosition().equals(position))
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

      if(temp.getName().equals(name) && temp.getNumber()==(number) && temp.getPosition().equals(position))
      {
        return i;
      }
    }
    return -1;
  }

  /**
   * Returns the Team as a String.
   *
   * @return all the parameters of the team in the format: "Number of players: . Players: "
   */
  public String toString()
  {
    return "Number of players: " + numberOfPlayers + ". Players: " + players;
  }

}