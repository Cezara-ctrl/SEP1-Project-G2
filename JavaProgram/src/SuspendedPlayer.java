public class TeamPlayer extends Player
{
  private boolean suspended;
  private Date timeSuspended;

  public TeamPlayer(String name, String number, String position)
  {
    super(name, number, position);
    suspended = false;
  }

  /**
   * A method that sets the player to suspended
   */
  public void playerSuspended()
  {
    suspended = true;
  }

  /**
   * A method that sets the player to not suspended
   */
  public void playerNotSuspended()
  {
    suspended = false;
  }

  /**
   * A method that checks if the suspended player is true
   */
  public boolean isSuspended()
  {
    return suspended;
  }

  public void setTimeSuspended(Date timeSuspended)
  {
    this.timeSuspended = timeSuspended;
  }

  public Date getTimeSuspended()
  {
    return timeSuspended;
  }

  public TeamPlayer copy()
  {
    return new TeamPlayer(super.getName(), super.getNumber(), super.getPosition());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof TeamPlayer))
    {
      return false;
    }
    TeamPlayer other = (TeamPlayer) obj;
    return super.equals(other) && suspended == other.suspended;
  }

  public String toString()
  {
    return super.toString();
  }

}
