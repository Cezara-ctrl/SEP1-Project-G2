public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time(int totalTimeInSeconds)
  {
    hour = totalTimeInSeconds / 3600;
    totalTimeInSeconds -= 3600 * hour;

    minute = totalTimeInSeconds / 60;
    totalTimeInSeconds -= 60 * minute;

    second = totalTimeInSeconds;
  }

  public int convertToSeconds()
  {
    return hour * 3600 + minute * 60 + second;
  }

  public int getSecond()
  {
    return second;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getHour()
  {
    return hour;
  }

  public Time copy()
  {
    return new Time(hour, minute, second);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Time))
    {
      return false;
    }

    Time other = (Time) obj;

    return hour == other.hour && minute == other.minute && second == other.second;
  }

  public String toString()
  {
    return hour + ":" + minute + ":" + second;
  }

}
