package model;

import utils.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A manager to the VIAClub file to add, edit, remove and retrieve data about players and matches.
 * @author Rodrigo Valente
 * @version 1.0
 */
public class VIAClubModelManager
{
  private String playersFileName;
  private String matchesFileName;

  /**
   * 2-argument constructor setting the file name.
   * @param playersFileName the name and path of the file where players will be add, edited, removed and retrieved
   * @param matchesFileName the name and path of the file where matches will be add, edited, removed and retrieved
   */
  public VIAClubModelManager(String playersFileName,String matchesFileName)
  {
    this.playersFileName = playersFileName;
    this.matchesFileName = matchesFileName;
  }

  /**
   * Uses the MyFileHandler class to retrieve a PlayersList object with all players.
   * @return a PlayersList object with all the players added
   */
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

  /**
   * Uses the MyFileHandler class to retrieve a PlayersList object with all players.
   * @param number the number of a player to retrieve a specified player
   * @return a Player object with the number passed as argument
   */
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

  /**
   * Use the MyFileHandler class to save the player object passed as a parameter.
   * @param playersFileName the name and path of the file where players will be saved
   * @param object the object saved to players
   */
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

  /**
   * Use the MyFileHandler class to edit the player object passed as a parameter.
   * @param playersFileName the name and path of the file where players are saved
   * @param number the number of the edited object in the players array list
   * @param object the player object edited
   */
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

  /**
   * Uses the MyFileHandler class to retrieve a PlayersList object with all players
   * @param playersFileName the name and path of the file where players will be saved
   * @param player the object removed from players
   */
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

  /**
   * Uses the MyFileHandler class to retrieve a MatchesList object with all matches.
   * @return a MatchesList object with all the matches added
   */
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

  /**
   * Uses the MyFileHandler class to retrieve a MatchesList object with all matches.
   * @param date the date of a match to retrieve a specified match
   * @return a Match object with the date passed as argument
   */
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

  /**
   * Use the MyFileHandler class to save the match object passed as a parameter.
   * @param matchesFileName the name and path of the file where matches will be saved
   * @param object the object saved to matches
   */
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

  /**
   * Use the MyFileHandler class to edit the match object passed as a parameter.
   * @param matchesFileName the name and path of the file where matches are saved
   * @param date the date of the edited object in the matches array list
   * @param object the match object edited
   */
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

  /**
   * Uses the MyFileHandler class to retrieve a matchesList object with all matches
   * @param matchesFileName the name and path of the file where matches will be saved
   * @param match the object removed from matches
   */
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

  /**
   * Uses the MyFileHandler class to retrieve a PlayersList object with all players
   * @param date the date of a match to retrieve a specified match
   * @return upcoming matches object with the date passed as argument
   */
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
