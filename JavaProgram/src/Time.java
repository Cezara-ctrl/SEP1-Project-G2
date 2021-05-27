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

  public boolean isBefore(Time time2)
  {
    if(hour < time2.minute)
    {
      return true;
    }
    else if(hour > time2.minute)
    {
      return false;
    }
    else
    {
      if(minute < time2.minute)
      {
        return true;
      }
      else if(minute > time2.minute)
      {
        return false;
      }
      else
      {
        if(second < time2.second)
        {
          return true;
        }
        else
        {
          return false;
        }
      }
    }
  }

  public Time timeUntil(Time time2)
  {
    int time2InSeconds = time2.convertToSeconds();
    int currentSeconds = convertToSeconds();
    int secondsUntil = time2InSeconds - currentSeconds ;
    time2.hour = secondsUntil / 3600;
    secondsUntil = secondsUntil - time2.hour * 3600;
    time2.minute = secondsUntil / 60;
    secondsUntil = secondsUntil - time2.minute * 60;
    time2.second = secondsUntil;
    return time2;
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
