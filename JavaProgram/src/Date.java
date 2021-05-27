import java.time.LocalDate;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean isBefore(Date date2)
  {
    if(year < date2.year)
    {
      return true;
    }
    else if(year > date2.year)
    {
      return false;
    }
    else
    {
      if(month < date2.month)
      {
        return true;
      }
      else if(month > date2.month)
      {
        return false;
      }
      else
      {
        if(day < date2.day)
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

  public static Date today()
  {
    LocalDate date = LocalDate.now();
    String datee = date.toString();
    String dateYear = datee.substring(0, 4);
    String dateMonth = datee.substring(5, 7);
    String dateDay = datee.substring(8, 10);
    int dateY = Integer.parseInt(dateYear);
    int dateM = Integer.parseInt(dateMonth);
    int dateD = Integer.parseInt(dateDay);
    return new Date(dateD, dateM, dateY);
  }

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

  public Date timeUntil(Date date2)
  {


  }

  public void nextDay()
  {
    if(month == 12 && day == 31)
    {
      month = 1;
      day = 1;
      year++;
    }
    else if(month == 2)
    {
      if((isLeapYear() && day == 29) || (!isLeapYear() && day == 28))
      {
        month = 3;
        day = 1;
      }
    }
    else if(((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) || ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30))
    {
      day = 1;
      month++;
    }
    else
    {
      day++;
    }
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Date))
    {
      return false;
    }

    Date other = (Date) obj;

    return day == other.day && month == other.month && year == other.year;
  }

  public String toString()
  {
    String str = "";

    if(day < 10)
    {
      str += "0";
    }
    str += day + "/";

    if(month < 10)
    {
      str += "0";
    }
    str += month + "/";

    str += year;

    return str;
  }

}
