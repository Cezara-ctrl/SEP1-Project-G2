package model;

import java.util.ArrayList;

public class MainClass
{
  private ArrayList<Match> matches;

  /**
   * This is a constructor.
   */
  public MainClass()
  {
    matches = new ArrayList<>();
  }

  /**
   * This method for adding a new match.
   * @param match
   */
  public void addMatches(Match match)
  {
    matches.add(match);
  }

  /**
   * Remove a match method.
   * @param match1
   */
  public void removeMatch(Match match1)
  {
    matches.remove(match1);
  }

  /**
   * Method that shows all matches.
   * @return
   */
  public ArrayList<Match> getAllMatches()
  {
    return matches;
  }

  /**
   * A toString method which return
   * @return
   */
  public String toString()
  {
    return "model.MainClass{" + "matches=" + matches + '}';
  }
}
