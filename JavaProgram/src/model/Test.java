package model;

import java.util.ArrayList;

public class Test
{
  public static void main(String args[])
  {
    Date date1 = new Date(11, 11, 2021);
    Date date2 = new Date(1,7,2021);
    Time time1 = new Time(12,30,0);

    //Player player1 = new Player();
    Player player2 = new Player("a",2,"pos",true,true, "Injured", 10);
    Player player3 = new Player("a",3,"pos",true,false, "Injured", 10);
    Player player4 = new Player("a",4,"pos",true,false, "Injured", 10);
    Player player5 = new Player("a",5,"pos",true,false, "Injured", 10);
    Player player6 = new Player("a",6,"pos",false,true, "Player is not Suspended", 0);
    Player player7 = new Player("a",7,"pos",false,true,"Player is not Suspended", 0);
    ArrayList<Player> players = new ArrayList<Player>();
    players.add(player6);
    players.add(player7);

    Team team1 = new Team(3,players);
    team1.addPlayer(player5);

    Match match1 = new Match(date1, time1, "Some place", "Friendly", players);

    //System.out.println(match1.hasValidPlayersForType());
    //System.out.println(player7.getTimeSuspended());

    VIAClub test1 = new VIAClub(team1);

    test1.addMatch(match1);

    System.out.println(test1.getMatch(date1));
  }
}
