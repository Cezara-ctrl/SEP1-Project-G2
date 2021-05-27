import java.util.ArrayList;

public class Test
{
  public static void main(String args[])
  {
    Player player1 = new Player("a",1,"pos",true);
    Player player2 = new Player("a",2,"pos",true);
    Player player3 = new Player("a",3,"pos",true);
    Player player4 = new Player("a",4,"pos",true);
    Player player5 = new Player("a",5,"pos",false);
    Player player6 = new Player("a",6,"pos",false);
    ArrayList<Player> players = new ArrayList<Player>();
    Team team1 = new Team(players, 6);
    team1.addPlayer(player1);
    team1.addPlayer(player2);
    team1.addPlayer(player3);
    team1.addPlayer(player4);
    team1.addPlayer(player5);
    team1.addPlayer(player6);
    Date date1 = new Date(11, 11, 2021);
    Time time1 = new Time(12,30,0);
    Match match1 = new Match(date1, time1, "Some place", "League", team1);
    System.out.println(match1.hasValidPlayersForType());
  }
}
