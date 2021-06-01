public abstract class Player
{
  private String name;
  private String number;
  private String position;

  public Player(String name, String number, String position)
  {
    this.name = name;
    this.number = number;
    this.position = position;
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

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Player))
    {
      return false;
    }

    Player other = (Player) obj;

    return name.equals(other.name) && number.equals(other.number) && position.equals(other.position);
  }

  public String toString()
  {
    return "Name: " + name + ". Number: " + number + ". Position: " + position + ".";
  }

}