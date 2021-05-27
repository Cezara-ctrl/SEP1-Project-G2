import java.util.Date;

public class Player
{
  private  String name;
  private int number;
  private int position;
  private boolean substitute;
  private Date birthday;

  public Player(String name, int number, int position, boolean substitute, Date birthday)
  {
    this.name=name;
    this.number=number;
    this.position=position;
    this.substitute=substitute;
    birthday=birthday.copy();
  }

  public String getName()
  {
    return name;
  }

  public int getNumber()
  {
    return number;
  }

  public int getPosition()
  {
    return position;
  }

  public boolean isSubstitute()
  {
    return substitute;
  }

  public Date getBirthday()
  {
    return birthday.copy();
  }

  public String toString()
  {
    String str=name;
    if(substitute)
    {
      str="substitute";
    }
    return "name: "+name+" ,number:"+number+" ,position: "+position+" ,substitute:"+ substitute+ str+" ,birthday"+birthday;
  }


}
