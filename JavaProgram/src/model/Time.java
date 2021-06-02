package model;

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

  public void setHour(int hour)
  {
    this.hour = hour;
  }

  public void setMinute(int minute)
  {
    this.minute = minute;
  }

  public void setSecond(int second)
  {
    this.second = second;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
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