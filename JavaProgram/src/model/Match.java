package model;

import com.sun.media.jfxmediaimpl.platform.Platform;
import java.util.ArrayList;
import java.util.Objects;

/**
 * A class managing matches (creating, editing and deleting).
 * @author Oliwia Jankowska
 * @version 1.0
*/
public class Match
{
  private String place;
  private String type;
  private ArrayList<Player> players;
  private Date date;
  private Time time;

  /**
   * Constructor initializing the Match.
   * @param date the date of the match
   * @param time the time of the match
   * @param place the place the match will be located at
   * @param type the type of the match
   * @param players the list of players participating in the match
  */
  public Match(Date date, Time time, String place, String type,
      ArrayList<Player> players)
  {
    this.date = date;
    this.time = time;
    this.place = place;
    this.type = type;
    this.players = addValidPlayer(players);
  }

  /**
   * Gets the date parameter of the match.
   * @return the date of the match.
  */
  public Date getDate()
  {
    return date;
  }

  /**
   * Gets the time parameter of the match.
   * @return the time of the match.
  */
  public Time getTime()
  {
    return time;
  }

  /**
   * Gets the place parameter of the match.
   * @return the place of the match.
  */
  public String getPlace()
  {
    return place;
  }

  /**
   * Gets the type parameter of the match.
   * @return the type of the match.
  */
  public String getType()
  {
    return type;
  }

  /**
   * Gets the players parameter of the match.
   * @return the list of players assigned to the match.
  */
  public ArrayList<Player> getAllPlayers()
  {
    return players;
  }

  /**
   * Adds only valid players to the list of layers (the player parameter).
   * @param allPlayersList the list of all players assigned to the match (not validated yet)
   * @return the list of all players assigned to the match that are valid to participate
  */
  public ArrayList<Player> addValidPlayer(ArrayList<Player> allPlayersList)
  {
    ArrayList<Player> validPlayerList = new ArrayList<>();
    for (int i = 0; i <= players.size(); i++)
    {
      if (players.get(i).isValidPlayerForMatch())
      {
        validPlayerList.add(players.get(i));
      }
    }
    return validPlayerList;
  }

  /**
   * Removes a player from the match.
   * @param allValidPlayers the list of all players assigned to the match (validated)
   * @return the list of players assigned to the match.
  */
  public ArrayList<Player> removePlayer(ArrayList<Player> allValidPlayers)
  {
    ArrayList<Player> playerList=new ArrayList<>();
    for(int i=0;i<players.size();i++){
      playerList.remove(players.get(i));
    }
    return playerList;
  }

  /**
   * Checks if the date of the match is valid.
   * @return true if the date of the match is not before today's date, otherwise it returns false
  */
  public boolean hasValidDate()
  {
    boolean valDate = !(getDate().isBefore(Date.today()));
    return valDate;
  }

  /**
   * Checks if the object is equal to another.
   * @return true if they are equal, otherwise it returns false
  */
   public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Match match = (Match) o;
    return Objects.equals(place, match.place) && Objects
        .equals(type, match.type) && Objects.equals(players, match.players)
        && Objects.equals(date, match.date) && Objects.equals(time, match.time);
  }

  /**
   * Returns the object as a String.
   * @return all the parameters of the match as one string
  */
  public String toString()
  {
    return "Match{" + "place='" + place + '\'' + ", type='" + type + '\''
        + ", players=" + players + ", date=" + date + ", time=" + time + '}';
  }
}