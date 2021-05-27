import java.util.Date;

public class Player
{
  private  String name;
  private int number;
  private String position;
  private boolean substitute;
  private boolean suspended;

  public Player(String name, int number, String position, boolean substitute, boolean suspended)
  {
    this.name=name;
    this.number=number;
    this.position=position;
    this.substitute=substitute;
    this.suspended=suspended;
  }

  public String getName()
  {
    return name;
  }

  public int getNumber()
  {
    return number;
  }

  public String getPosition()
  {
    return position;
  }

  public boolean isSubstitute()
  {
    return substitute;
  }

  public boolean isSuspended()
  {
    return suspended;
  }

  public String toString(){
    String str=name;
    if(substitute)
    {
      str="substitute";
    }
    return "name: "+name+" ,number:"+number+" ,position: "+position+" ,substitute:"+ substitute+ str;
  }


}
