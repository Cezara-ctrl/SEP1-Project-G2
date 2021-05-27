import java.util.ArrayList;

public class Match
{
  private Date date;
  private Time time;
  private String place;
  private String type;
  private Team team;

  public Match(Date date, Time time, String place, String type, Team team)
  {
    this.date = date;
    this.time = time;
    this.place = place;
    this.type = type;
    this.team = team;
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
    if(getDate().isBefore(Date.today()))
    {
      valDate = false;
    }
    return valDate;
  }

  public boolean hasValidType()
  {
    boolean valType = false;
    if(type.equals("League") || type.equals("Cup") || type.equals("Friendly"))
    {
      valType = true;
    }
    return valType;
  }

  public boolean hasValidPlayersForType()
  {
    boolean valSubs = false;
    int substitutes = 0;
    for(int i=0; i<team.getNumberOfPlayers(); i++)
    {
      if(team.getPlayers().get(i).isSubstitute())
      {
        substitutes+=1;
      }
    }

    if(getType().equals("League") && substitutes==5)
    {
      valSubs = true;
    }
    else if(getType().equals("Cup") && substitutes==6)
    {
      valSubs = true;
    }
    return valSubs;
  }

  public void addTeam(Team t)
  {
    team = t;
  }

  public String toString(){
    return type + " match on " + date + " " + time + " at " + place + " .\n" + "The team fot this match is: " + team;
  }
}
