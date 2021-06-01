import java.util.ArrayList;
import java.util.Objects;

public class VIAClub
{
  private ArrayList<Team> allPlayers;
  private ArrayList<Match> allMatches;

  public VIAClub()
  {
    allPlayers = new ArrayList<Team>();
    allMatches = new ArrayList<Match>();
  }

  private void addMatch(Match match)
  {
    allMatches.add(match);
  }

  public void removeMatch(Date date)
  {
    for (Match match : allMatches)
    {
      if (match.getDate().equals(date))
      {
        allMatches.remove(match);
      }
    }
  }

  public Match getMatch(Date date)
  {
    for (Match match : allMatches)
    {
      if (match.getDate().equals(date))
      {
        return match;
      }
    }
    return null;
  }

  public void addPlayer(Team player)
  {
    allPlayers.add(player);
  }

  public void removePlayer(String number)
  {
    for (Team player : allPlayers)
    {
      if (player.getNumber().equals(number))
      {
        allMatches.remove(player);
      }
    }
  }

  public Player getPlayer(String number)
  {
    for (Team player : allPlayers)
    {
      if (player.getNumber().equals(number))
      {
        return player.getNumber();
      }
    }
    return null;
  }

  public ArrayList<Team> getAllPlayers()
  {
    return allPlayers;
  }

  public ArrayList<Match> getAllMatches()
  {
    return allMatches;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof VIAClub))
    {
      return false;
    }

    VIAClub other = (VIAClub) obj;

    return allPlayers.equals(other.allPlayers) && allMatches.equals(other.allMatches);
  }

  public String toString()
  {
    return "All players: " + allPlayers + ". All matches: " + allMatches;
  }

}