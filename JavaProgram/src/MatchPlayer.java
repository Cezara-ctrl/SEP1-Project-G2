public class MatchPlayer
{
  private String type;
  private Player player;

  public MatchPlayer(String type, Player player)
  {
    this.type = type;
    this.player = player;
  }

  public void setPlayer(Player player)
  {
    this.player = player;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getType()
  {
    return type;
  }

  public Player getPlayer()
  {
    return player;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof MatchPlayer))
    {
      return false;
    }

    MatchPlayer other = (MatchPlayer) obj;

    return player.equals(other.player) && type.equals(other.type);
  }

  public String toString()
  {
    return "Player: " + player + ". Type: " + type;
  }
}