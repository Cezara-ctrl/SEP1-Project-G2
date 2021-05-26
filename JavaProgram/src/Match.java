import java.util.ArrayList;

public class Match
{
  private Date date;
  private Time time;
  private String place;
  private String type;
  private Team team;

  public Match(Date date, Time time, String place, String type)
  {
    this.date = date;
    this.time = time;
    this.place = place;
    this.type = type;
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

  public boolean hasValidDate()
  {
    boolean valDate = true;
    if(date.getDate().isBefore(Date.today()))
    {
      valDate = false;
    }
    return valDate;
  }

  public boolean hasValidType()
  {
    boolean valType = false;
    if(type == "League" || type == "Cup" || type == "Friendly")
    {
      valType = true;
    }
    return valType;
  }

  public boolean hasValidPlayersForType()
  {

  }

  public void addTeam(Team t)
  {
    team = t;
  }

  public String toString(){
    return type + " match on " + date + " " + time + " at " + place + " .\n" + "The team fot this match is: " + team;
  }
}
