import java.util.ArrayList;

public class Team
{
  private int numberOfPlayers;
  private ArrayList<Player> allPlayers;
  private Player number;

  public Team(int numberOfPlayers, ArrayList<Player> allPlayers)
  {
    this.numberOfPlayers = numberOfPlayers;
    this.allPlayers = allPlayers;
  }

  public void addPlayer(Player player)
  {
    allPlayers.add(player);
  }

  public Player getNumber()
  {
    return number;
  }

  public void removePlayer(Player player)
  {
    allPlayers.remove(player);
  }

  public int getNumberOfPlayers()
  {
    return numberOfPlayers;
  }

  public ArrayList<Player> getAllPlayers()
  {
    return allPlayers;
  }

  public String toString()
  {
    return "Number of players: " + numberOfPlayers + ". Players: " + allPlayers;
  }

}