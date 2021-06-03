package model;

/**
 * A class containing a constructor for time and also the methods for using this data.
 * @author Rodrigo Valente
 * @version 1.0
 */
public class Time
{
  private int hour;
  private int minute;
  private int second;

  /**
   * Constructor initializing the Time.
   *
   * @param hour the hour of the time
   * @param minute the minute of the time
   * @param second the second of the time
   */
  public Time(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /**
   * Sets the hour parameter of the time.
   *
   * @param hour the hour of the time that we want to set
   */
  public void setHour(int hour)
  {
    this.hour = hour;
  }

  /**
   * Sets the minute parameter of the time.
   *
   * @param minute the minute of the time that we want to set
   */
  public void setMinute(int minute)
  {
    this.minute = minute;
  }

  /**
   * Sets the second parameter of the time.
   *
   * @param second the second of the time that we want to set
   */
  public void setSecond(int second)
  {
    this.second = second;
  }

  /**
   * Gets the hour parameter of the time.
   *
   * @return the hour of the time
   */
  public int getHour()
  {
    return hour;
  }

  /**
   * Gets the minute parameter of the time.
   *
   * @return the minute of the time
   */
  public int getMinute()
  {
    return minute;
  }

  /**
   * Gets the second parameter of the time.
   *
   * @return the second of the time
   */
  public int getSecond()
  {
    return second;
  }

  /**
   * A method that copies the time.
   *
   * @return new time with a new hour, minute and second
   */
  public Time copy()
  {
    return new Time(hour, minute, second);
  }

  /**
   * Checks if the hour, minute and second of an object is equal to another.
   *
   * @param obj the object to compare with
   * @return true if they are equal, otherwise it returns false
   */
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Time))
    {
      return false;
    }

    Time other = (Time) obj;

    return hour == other.hour && minute == other.minute && second == other.second;
  }

  /**
   * Returns the Time as a String.
   *
   * @return all the parameters of the time in the format: "hour:minute:second"
   */
  public String toString()
  {
    return hour + ":" + minute + ":" + second;
  }

}