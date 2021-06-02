package model;

import com.sun.media.jfxmediaimpl.platform.Platform;

import java.util.ArrayList;
import java.util.Objects;

public class Match
{

  private String place;
  private String type;
  private ArrayList<Player> players;
  private Date date;
  private Time time;

  public Match(Date date, Time time, String place, String type,
      ArrayList<Player> players)
  {
    this.date = date;
    this.time = time;
    this.place = place;
    this.type = type;
    this.players = addValidPlayer(players);
  }

  public Date getDate()
  {
    return date;
  }

  public Time getTime()
  {
    return time;
  }

  public String getPlace()
  {
    return place;
  }

  public String getType()
  {
    return type;
  }

  public ArrayList<Player> getAllPlayers()
  {
    return players;
  }

  public ArrayList<Player> addValidPlayer(ArrayList<Player> allPlayersList)
  {
    ArrayList<Player> validPlayerList = new ArrayList<>();
    for (int i = 0; i < players.size(); i++)
    {
      if (players.get(i).isValidPlayerForMatch())
      {
        validPlayerList.add(players.get(i));
      }
    }
    return validPlayerList;
  }
  public ArrayList<Player> removePlayer(ArrayList<Player> allValidPlayers)
  {
    ArrayList<Player> playerList=new ArrayList<>();
    for(int i=0;i<players.size();i++){
      playerList.remove(players.get(i));
    }
    return playerList;
  }

  public boolean hasValidDate()
  {
    boolean valDate = !(getDate().isBefore(Date.today()));
    return valDate;
  }

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

  public String toString()
  {
    return "Match{" + "place='" + place + '\'' + ", type='" + type + '\''
        + ", players=" + players + ", date=" + date + ", time=" + time + '}';
  }
}