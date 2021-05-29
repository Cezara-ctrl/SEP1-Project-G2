import java.util.ArrayList;

public class MainClass
{
  private ArrayList<Match> matches;

  public MainClass(){
matches=new ArrayList<>();
  }
  public void addMatches(Match match){
    matches.add(match);
  }
  public void removeMatch(Match match1){
    matches.remove(match1);
  }
  public ArrayList<Match> getAllMatches(){
    return matches;
  }

 public String toString()
  {
    return "MainClass{" + "matches=" + matches + '}';
  }
}
