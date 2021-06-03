package model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class VIAClubModelManager
{
  private String playersFileName;
  private String matchesFileName;

  public VIAClubModelManager(String playersFileName, String matchesFileName)
  {
    this.playersFileName = playersFileName;
    this.matchesFileName = matchesFileName;
  }

  public ArrayList<Player> getAllPlayers()
  {
    ArrayList<Player> allPlayers = new ArrayList<Player>();

    try
    {
      allPlayers = (ArrayList<Player>)MyFileHandler.readFromBinaryFile(playersFileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.print("Class not found");
    }
    return allPlayers;
  }

  public Player getPlayer(int number)
  {
    ArrayList<Player> players = getAllPlayers();
    Player player = null;

    for(int i = 0; i < players.size(); i++)
    {
      if (players.get(i).getNumber()==(number))
      {
        player = players.get(i);
        break;
      }
    }
    return player;
  }

  public void savePlayers(String playersFileName, Object object)
  {
    ArrayList<Player> players = getAllPlayers();
    players.add((Player) object);

    try
    {
      MyFileHandler.writeToBinaryFile(playersFileName, players);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error writing to file");
    }
  }

  public void editPlayer(String playersFileName, int number, Object object)
  {
    ArrayList<Player> players = getAllPlayers();
    players.set(number, (Player) object);

    try
    {
      MyFileHandler.writeToBinaryFile(playersFileName, players);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error when reading file");
    }
  }

  public void removePlayer(String playersFileName, Player player)
  {
    ArrayList<Player> players = getAllPlayers();
    for(int i = 0; i < players.size(); i++)
    {
      if (players.get(i).equals(player))
      {
        players.remove(players.get(i));
      }
    }

    try
    {
      MyFileHandler.writeToBinaryFile(playersFileName, players);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error when reading file");
    }
  }

  public ArrayList<Match> getAllMatches()
  {
    ArrayList<Match> allMatches = new ArrayList<Match>();

    try
    {
      allMatches = (ArrayList<Match>)MyFileHandler.readFromBinaryFile(matchesFileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.print("Class not found");
    }
    return allMatches;
  }

  public Match getMatch(Date date)
  {
    ArrayList<Match> matches = getAllMatches();
    Match match = null;

    for(int i = 0; i < matches.size(); i++)
    {
      if (matches.get(i).getDate().equals(date))
      {
        match = matches.get(i);
        break;
      }
    }
    return match;
  }

  public void saveMatches(String matchesFileName, Object object)
  {
    ArrayList<Match> matches = getAllMatches();
    matches.add((Match) object);

    try
    {
      MyFileHandler.writeToBinaryFile(matchesFileName, matches);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error writing to file");
    }
  }

  public void editMatch(String matchesFileName, int date, Object object)
  {
    ArrayList<Match> matches = getAllMatches();
    matches.set(date, (Match) object);

    try
    {
      MyFileHandler.writeToBinaryFile(matchesFileName, matches);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error when reading file");
    }
  }

  public void removeMatch(String matchesFileName, Match match)
  {
    ArrayList<Match> matches = getAllMatches();
    for(int i = 0; i < matches.size(); i++)
    {
      if (matches.get(i).equals(match))
      {
        matches.remove(matches.get(i));
      }
    }

    try
    {
      MyFileHandler.writeToBinaryFile(matchesFileName, matches);
    }
    catch (FileNotFoundException e)
    {
      System.out.print("File not found");
    }
    catch (IOException e)
    {
      System.out.print("IO error when reading file");
    }
  }

  public  ArrayList<Match> getUpcomingMatches(Date date)
  {
    ArrayList<Match> allMatches = getAllMatches();
    ArrayList<Match> upcomingMatches = new ArrayList<>();
    for (int i = 0; i < allMatches.size(); i++)
    {
      if (!(allMatches.get(i).getDate().isBefore(Date.today())))
      {
        upcomingMatches.add(allMatches.get(i));
      }
      try
      {
        allMatches = (ArrayList<Match>) MyFileHandler.readFromBinaryFile(matchesFileName);
      }
      catch (FileNotFoundException e)
      {
        System.out.println("File is not found");
      }
      catch (IOException e)
      {
        System.out.println("IOE exception");
      }
      catch (ClassNotFoundException e)
      {
        System.out.println("Is not found");
      }
    }
    return upcomingMatches;
  }

}
