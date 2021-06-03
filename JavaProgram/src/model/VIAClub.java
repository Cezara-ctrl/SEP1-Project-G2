package model;

import java.util.ArrayList;
import java.util.Objects;

public class VIAClub
{
  private Team team;
  private ArrayList<Match> allMatches;

  public VIAClub(Team team)
  {
    this.team = team;
    allMatches = new ArrayList<Match>();
  }


  public void addMatch(Match match)
  {
    allMatches.add(match);
  }

  public ArrayList<Match> removeMatch(Date date)
  {
    ArrayList<Match> matchesWithDate = new ArrayList<>();
    for (int i = 0; i < allMatches.size(); i++)
    {
      if (allMatches.get(i).hasValidDate())
        matchesWithDate.remove(allMatches.get(i).getDate());
    }
    return matchesWithDate;
  }

  public Match getMatch(Date date)
  {
    Match match = null;

    for (int i = 0; i < allMatches.size(); i++)
    {
      if (allMatches.get(i).getDate().equals(date))
        match=allMatches.get(i);
    }
    return match;
  }

  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    VIAClub viaClub = (VIAClub) o;
    return Objects.equals(team, viaClub.team) && Objects
        .equals(allMatches, viaClub.allMatches);
  }

  @Override public String toString()
  {
    return "VIAClub{" + "team=" + team + ", allMatches=" + allMatches + '}';
  }
}