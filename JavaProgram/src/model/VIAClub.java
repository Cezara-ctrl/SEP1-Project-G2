package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A class that includes match class in via club
 * @author Rodrigo Valente
 * @version 1.0
 */
public class VIAClub
{
  private Team team;
  private ArrayList<Match> allMatches;

  /**
   * Constructor initializing the Team.
   *
   * @param team the team that are in via club
   */
  public VIAClub(Team team)
  {
    this.team = team;
    allMatches = new ArrayList<Match>();
  }

  /**
   * A method that adds a match to via club team
   * @param match match that needs to be added
   */
  public void addMatch(Match match)
  {
    allMatches.add(match);
  }

  /**
   * A method that removes the match from via club
   * @param date the date of the match to be removed
   * @return matches with the date that was input
   */
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

  /**
   * A method that returns a match if it exists in via club
   * @param date date of the match to be returned
   * @return match if it exists
   */
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

  /**
   * A method that checks if the object is via club
   * @param o object to be compared
   * @return true if the object is a via club
   */
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

  /**
   * A method that returns String with all the information of via club
   * @return team and all the matches
   */
  @Override public String toString()
  {
    return "VIAClub{" + "team=" + team + ", allMatches=" + allMatches + '}';
  }
}