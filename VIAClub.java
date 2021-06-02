package model;

import java.util.ArrayList;

public class VIAClub
{
  private Team team;
  private ArrayList<Match> allMatches;

  public VIAClub(Team team)
  {
    this.team = team;
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



  public String toString()
  {
    return "All players: "  + ". All matches: " + allMatches;
  }

}