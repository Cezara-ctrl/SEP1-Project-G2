package model;

import java.util.Objects;

/**
 * A class containing a constructor for player and also the methods for using this data.
 * @author Rodrigo Valente
 * @version 1.0
 */
public class Player
{
  private String name;
  private int number;
  private String position;
  private boolean suspended;
  private boolean validPlayerForMatch;
  private String reason;
  private int suspensionDays;

  /**
   * Constructor initializing the Player.
   *
   * @param name the name of the player
   * @param number the number of the player
   * @param position the position of the player
   * @param suspended if a players is suspended or not
   * @param validPlayerForMatch if the team has players for the match
   * @param reason the reason of the suspension
   * @param suspensionDays how many days a player has been suspended
   */
  public Player(String name, int number, String position, boolean suspended,
      boolean validPlayerForMatch, String reason, int suspensionDays)
  {
    this.name = name;
    this.number = number;
    this.position = position;
    this.suspended = suspended;
    this.validPlayerForMatch = validPlayerForMatch;
    this.reason = reason;
    this.suspensionDays = suspensionDays;
  }

  /**
   * Sets the name parameter of the player.
   *
   * @param name the name of the player that we want to set
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Sets the number parameter of the player.
   *
   * @param number the number of the player that we want to set
   */
  public void setNumber(int number)
  {
    this.number = number;
  }

  /**
   * Sets the position parameter of the player.
   *
   * @param position the position of the player that we want to set
   */
  public void setPosition(String position)
  {
    this.position = position;
  }

  /**
   * Sets the reason parameter of the suspended player.
   *
   * @param reason the reason of the suspended player
   */
  public void setReason(String reason)
  {
    if (suspended)
    {
      if (reason.equals("Injured"))
        this.reason = "Injured";
      else if (reason.equals("Red Card"))
        this.reason = "Red Card";
    }
  }

  /**
   * Sets how many days a player has been suspended.
   *
   * @param suspensionDays the days of the suspension that we want to set
   */
  public void setSuspensionDays(int suspensionDays)
  {
    if (suspended)
    {
      this.suspensionDays = suspensionDays;
    }
  }

  /**
   * Gets how many days a player has been suspended
   *
   * @return the days a player has been suspended
   */
  public int getSuspensionDays()
  {
    return suspensionDays;
  }

  /**
   * Gets the name parameter of the player.
   *
   * @return the name of the player
   */
  public String getName()
  {
    return name;
  }

  /**
   * Gets the number parameter of the player.
   *
   * @return the number of the player
   */
  public int getNumber()
  {
    return number;
  }

  /**
   * Gets the position parameter of the player.
   *
   * @return the position of the player
   */
  public String getPosition()
  {
    return position;
  }

  /**
   * Checks if a player is suspended
   *
   * @param player the player that we want to check if it is suspended
   * @return true if the player is suspended, false otherwise
   */
  public boolean isSuspended(Player player)
  {
    if (player.suspended)
      return true;
    else
      return false;
  }

  /**
   * Gets the reason parameter of the player suspension.
   *
   * @return the reason of the suspension
   */
  public String getReason()
  {
    return reason;
  }

  /**
   * Checks if a player is available for a match.
   *
   * @return true if the player is available, false otherwise
   */
  public boolean isValidPlayerForMatch()
  {
    if (!((reason.equals("Injured")) || (reason.equals("Red Card")))){
      return true;
    }
    return isValidPlayerForMatch();
  }

  /**
   * Checks if the name, number, position and suspended of an object is equal to another.
   *
   * @param o the object to compare with
   * @return true if they are equal, otherwise it returns false
   */
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

  /**
   * Returns the Player as a String.
   *
   * @return all the parameters of the player in the format: "Name: .Number: .Position: .IsSuspended: .Time of suspension in days: "
   */
  public String toString()
  {
    return "Name: " + name + ". Number: " + number + ". Position: " + position
        + "." + "IsSuspended" + suspended + "Time of suspension in days "
        + suspensionDays;
  }
}