import java.util.Date;

public class Player
{
  private  String name;
  private int number;
  private String position;
  private boolean substitute;

  public Player(String name, int number, String position, boolean substitute)
  {
    this.name=name;
    this.number=number;
    this.position=position;
    this.substitute=substitute;
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

  public String toString(){
    String str="";
    if(isSubstitute())
    {
      str="substitute";
    }
    else
    {
      str="not substitute";
    }
    return "name: "+name+" ,number: "+number+" ,position: "+position+" ,substitute: "+str;
  }
}
