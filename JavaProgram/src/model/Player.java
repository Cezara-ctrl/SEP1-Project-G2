package model;

import java.util.Objects;

public class Player
{
  private String name;
  private String number;
  private String position;
  private boolean suspended;
  private boolean validPlayerForMatch;
  private String reason;
  private String suspensionDays;

  public Player(String name, String number, String position, boolean suspended,
      boolean validPlayerForMatch, String reason, String suspensionDays)
  {
    this.name = name;
    this.number = number;
    this.position = position;
    this.suspended = suspended;
    this.validPlayerForMatch = validPlayerForMatch;
    this.reason = reason;
    this.suspensionDays = suspensionDays;
  }

  public Player(String name, String number, String position, String suspensionDays)
  {
    this.name = name;
    this.number = number;
    this.position = position;
    this.suspensionDays = suspensionDays;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public void setPosition(String position)
  {
    this.position = position;
  }

  public void setReason()
  {
    if (suspended)
    {
      if (reason.equals("Injured"))
        this.reason = "Injured";
      else if (reason.equals("Red Card"))
        this.reason = "Red Card";
    }
  }

  public void setSuspensionDays()
  {
    if (suspended)
    {
      this.suspensionDays = suspensionDays;
    }
  }

  public String getSuspensionDays()
  {
    return suspensionDays;
  }

  public String getName()
  {
    return name;
  }

  public String getNumber()
  {
    return number;
  }

  public String getPosition()
  {
    return position;
  }

  public boolean isSuspended(Player player)
  {
    if (player.suspended)
      return true;
    else
      return false;
  }

  public String getReason()
  {
    return reason;
  }

  public boolean isValidPlayerForMatch()
  {
    if (!((reason.equals("Injured")) || (reason.equals("Red Card"))))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Player player = (Player) o;
    return number == player.number && suspended == player.suspended && Objects
        .equals(name, player.name) && Objects.equals(position, player.position);
  }

  public String toString()
  {
    return "Name: " + name + ". Number: " + number + ". Position: " + position
        + "." + "IsSuspended" + suspended + "model.Time of suspension in days "
        + suspensionDays;
  }
}