public class Match
{
  private Date date;
  private Time time;
  private String place;
  private String type;

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
}
