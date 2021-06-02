import java.util.ArrayList;

public class Match
{
  private String place;
  private String type;
  private ArrayList<MatchPlayer> matchPlayers;
  private Date date;
  private Time time;


  public Match(Date date, Time time, String place, String type, ArrayList<MatchPlayer> matchPlayers)
  {
    this.date = date;
    this.time = time;
    this.place = place;
    this.type = type;
    this.matchPlayers = matchPlayers;
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

  public ArrayList<MatchPlayer> getMatchPlayers()
  {
    return matchPlayers;
  }

  public boolean hasValidDate()
  {
    boolean valDate = !getDate().isBefore(Date.today());
    return valDate;
  }


}