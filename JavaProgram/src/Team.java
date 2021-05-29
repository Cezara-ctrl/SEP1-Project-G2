import java.util.ArrayList;
import java.util.Objects;

public class Team
{
  private ArrayList<Player> players = new ArrayList<Player>();
  private int numberOfPlayers;

  /**
   * This is a 2 arguments constructor.
   *
   * @param players
   * @param numberOfPlayers
   */
  public Team(ArrayList<Player> players, int numberOfPlayers)
  {
    this.numberOfPlayers = numberOfPlayers;
    this.players = players;
  }

  /**
   * This method adds a player to our team.
   *
   * @param player
   */
  public void addPlayer(Player player)
  {
    players.add(player);
  }

  /**
   * This method removes a player from the team.
   *
   * @param player
   */
  public void removePlayer(Player player)
  {
    players.remove(player);
  }

  public int getNumberOfPlayers()
  {
    return players.size();
  }

  public ArrayList<Player> getPlayers()
  {
    return players;
  }

  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Team team = (Team) o;
    return numberOfPlayers == team.numberOfPlayers && Objects
        .equals(players, team.players);
  }

  public String toString()
  {
    return "Players" + players + "Number of the players" + numberOfPlayers;
  }
}
