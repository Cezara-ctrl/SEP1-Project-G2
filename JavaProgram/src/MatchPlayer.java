public class MatchPlayer extends Player
{
  private String type;

  public MatchPlayer(String name, int number, String position, boolean substitute, boolean suspended,String type){
    super(name, number, position, substitute, suspended);
    this.type=type;
  }
  public String getType(){
    return type;
  }

   public String toString()
  {
    return "MatchPlayer{" + "type='" + type + '\'' + '}';
  }
}
