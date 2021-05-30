public class SuspendedPlayer extends Player
{
  private Date timeSuspended;

  public SuspendedPlayer(String name, int number, String position, boolean substitute, boolean suspended,Date timeSuspended){
    super(name, number, position, substitute, suspended);
    this.timeSuspended=timeSuspended;
  }
  public boolean isSuspended(){
    return true;
  }
  // Something wrong with this method
/**  public int getTimeSuspended(){
    if(isSuspended())

  }**/
}
