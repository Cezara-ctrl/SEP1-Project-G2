public class SuspendedPlayer extends Player
{
  private Date timeSuspended;

  public SuspendedPlayer(String name, int number, String position, boolean substitute, boolean suspended,Date timeSuspended)
  {
    super(name, number, position, substitute,suspended);
    this.timeSuspended = timeSuspended;
  }

  public int getTimeSuspended()
  {
    return Date.today().timeUntil(timeSuspended);
  }

  public String toString(){
    String str ="";
    if(isSubstitute())
    {
      str="substitute";
    }
    else
    {
      str="not substitute";
    }
    return "name: "+getName()+" ,number: "+getNumber()+" ,position: "+getPosition()+
        " ,substitute: "+str+", suspended for a time: "+timeSuspended;
  }
}
