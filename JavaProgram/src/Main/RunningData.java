package Main;

import model.Date;
import model.Match;
import model.Player;
import model.Time;
import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class RunningData
{
  public static void main(String[] args)
  {
    ArrayList<Player> players = new ArrayList<>();
    String[] playerArray = null;

    try
    {
      playerArray = MyFileHandler.readArrayFromTextFile("player.txt");

      for (int i = 0; i < playerArray.length; i++)
      {
        String temp = playerArray[i];
        String name = playerArray[0];
        String position = playerArray[1];

        players.add(new Player(name, 2, position, false, true, null, 0));
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File was not found, or could not be opened");
    }

    try
    {
      MyFileHandler.writeToBinaryFile("players.bin", players);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Error opening file ");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file ");
    }

    System.out.println("Done");

    ArrayList<Match> matches = new ArrayList<>();
    String[] matchesArray = null;

    try

    {
      matchesArray = MyFileHandler.readArrayFromTextFile("matches.txt");

      for (int i = 0; i < matchesArray.length; i++)
      {
        String temp = matchesArray[i];
        String place = matchesArray[0];
        String type = matchesArray[1];
        Date date=new Date(21,3,2021);
        Time time = new Time(12,00,00);
        matches.add(new Match(date,time,place,type,players));
      }
    }
    catch (FileNotFoundException e)

    {
      System.out.println("File was not found, or could not be opened");
    }

    try

    {
      MyFileHandler.writeToBinaryFile("matches.bin", matches);
    }
    catch (FileNotFoundException e)

    {
      System.out.println("Error opening file ");
    }
    catch (IOException e)

    {
      System.out.println("IO Error writing to file ");
    }

    System.out.println("Done");
  }

}