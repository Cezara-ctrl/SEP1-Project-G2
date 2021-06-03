package model;

import java.time.LocalDate;
import java.util.GregorianCalendar;

/**
 * A class containing a constructor for date and also the methods for using this data.
 * @author Rodrigo Valente
 * @version 1.0
 */
public class Date
{
  private int day;
  private int month;
  private int year;

  /**
   * Constructor initializing the Date.
   *
   * @param day the hour of the date
   * @param month the minute of the date
   * @param year the second of the date
   */
  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  /**
   * Sets the day parameter of the date.
   *
   * @param day the day of the date that we want to set
   */
  public void setDay(int day)
  {
    this.day = day;
  }

  /**
   * Sets the month parameter of the date.
   *
   * @param month the month of the date that we want to set
   */
  public void setMonth(int month)
  {
    this.month = month;
  }

  /**
   * Sets the year parameter of the date.
   *
   * @param year the year of the date that we want to set
   */
  public void setYear(int year)
  {
    this.year = year;
  }

  /**
   * Gets the day parameter of the date.
   *
   * @return the day of the date
   */
  public int getDay()
  {
    return day;
  }

  /**
   * Gets the month parameter of the date.
   *
   * @return the month of the date
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * Gets the year parameter of the date.
   *
   * @return the year of the date
   */
  public int getYear()
  {
    return year;
  }

  /**
   * Gets a string representation of the date
   *
   * @return a string representation of the date
   */
  public String getDate()
  {
    return day + "/" + month + "/" + year;
  }

  /**
   * Check if the current Date object is before another Date object
   *
   * @param date2 the Date object to compare against
   * @return true if the current Date object is before the other Date object, false otherwise
   */
  public boolean isBefore(Date date2)
  {
    if (year < date2.year)
    {
      return true;
    }
    else if (year > date2.year)
    {
      return false;
    }
    else
    {
      if (month < date2.month)
      {
        return true;
      }
      else if (month > date2.month)
      {
        return false;
      }
      else
      {
        if (day < date2.day)
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

  /**
   * Gets the today date.
   *
   * @return today's date
   */
  public static Date today()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentDay = currentDate.get(GregorianCalendar.DATE);
    int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
    int currentYear = currentDate.get(GregorianCalendar.YEAR);

    return new Date(currentDay, currentMonth, currentYear);
  }

  /**
   * Checks if a year is a leap year.
   *
   * @return true if the year is a leap year, false otherwise
   */
  public boolean isLeapYear()
  {
    if (this.year % 4 == 0)
    {
      if (this.year % 100 == 0)
      {
        return this.year % 400 == 0;
      }
      else
      {
        return true;
      }
    }
    else
    {
      return false;
    }
  }

  /**
   * Gets the day of tomorrow
   *
   */
  public void nextDay()
  {
    if (month == 12 && day == 31)
    {
      month = 1;
      day = 1;
      year++;
    }
    else if (month == 2)
    {
      if ((isLeapYear() && day == 29) || (!isLeapYear() && day == 28))
      {
        month = 3;
        day = 1;
      }
    }
    else if (
        ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10) && day == 31) || (
            (month == 4 || month == 6 || month == 9 || month == 11)
                && day == 30))
    {
      day = 1;
      month++;
    }
    else
    {
      day++;
    }
  }

  /**
   * Gets the days in a month.
   *
   * @return the days in a month
   */
  private int daysInMonth()
  {
    LocalDate dateToCountMonthDays = LocalDate.of(year, month, day);
    int daysInMonth = dateToCountMonthDays.lengthOfMonth();
    return daysInMonth;
  }

  /**
   * Gets the days in a month.
   *
   * @param date the date that we want to know how many days until this date
   * @return the days between two dates
   */
  public int timeUntil(Date date)
  {
    Date dateBefore = copy();
    Date dateAfter = date;
    int daysBetween = 0;
    int y;
    Date yDate = dateBefore;
    int m;
    Date mDate = dateBefore;
    for (y = yDate.year; y < dateAfter.year; y++)
    {
      if (yDate.isLeapYear())
      {
        daysBetween += 366;
      }
      else
      {
        daysBetween += 365;
      }
      yDate.year++;
    }
    if (dateBefore.month < dateAfter.month)
    {
      for (m = mDate.month; m < dateAfter.month; m++)
      {
        daysBetween += mDate.daysInMonth();
        mDate.month++;
      }
    }
    else if (dateBefore.month > dateAfter.month)
    {
      for (m = mDate.month; m < dateAfter.month; m++)
      {
        daysBetween -= mDate.daysInMonth();
        mDate.month++;
      }
    }
    if (dateBefore.day < dateAfter.day)
    {
      daysBetween += dateAfter.day - dateBefore.day;
    }
    else if (dateBefore.day > dateAfter.day)
    {
      daysBetween -= dateBefore.day - dateAfter.day;
    }
    return daysBetween;
  }

  /**
   * A method that copies the date.
   *
   * @return new date with a new day, month and year
   */
  public Date copy()
  {
    return new Date(day, month, year);
  }

  /**
   * Checks if the day, month and year of an object is equal to another.
   *
   * @param obj the object to compare with
   * @return true if they are equal, otherwise it returns false
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
    {
      return false;
    }

    Date other = (Date) obj;

    return day == other.day && month == other.month && year == other.year;
  }

  /**
   * Returns the Date as a String.
   *
   * @return all the parameters of the date in the format: "day/month/year"
   */
  public String toString()
  {
    String str = "";

    if (day < 10)
    {
      str += "0";
    }
    str += day + "/";

    if (month < 10)
    {
      str += "0";
    }
    str += month + "/";

    str += year;

    return str;
  }


}
