package utils;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class used for writing and reading binary files and text files
 * @author Rodrigo Valente
 * @version 1.0
 */
public class MyFileHandler
{
  /**
   * Writes an object to a binary file
   * @param fileName the name of the file in which the object will be written
   * @param object the object that will be written in the specified file
   * @throws IOException exception thrown if an IO error occurs
   */
  public static void writeToBinaryFile(String fileName, Object object) throws IOException
  {
    ObjectOutputStream objectOutputStream = null;

    try
    {
      FileOutputStream fileOutputStream = new FileOutputStream(fileName);
      objectOutputStream = new ObjectOutputStream(fileOutputStream);

      objectOutputStream.writeObject(object);
    }
    finally
    {
      if (objectOutputStream != null)
      {
        try
        {
          objectOutputStream.close();
        }
        catch (IOException e)
        {
          System.out.print("IO error when closing the file: " + fileName);
        }
      }
    }
  }

  /**
   * Reads an object from a binary file
   * @param fileName the name of the file from which the object will be read
   * @return the object read from the specified file
   * @throws IOException exception thrown if an IO error occurs
   * @throws ClassNotFoundException exception thrown when no definition for the specified class could be found
   */
  public static Object readFromBinaryFile(String fileName) throws IOException, ClassNotFoundException
  {
    Object object = null;
    ObjectInputStream objectInputStream = null;

    try
    {
      FileInputStream fileInputStream = new FileInputStream(fileName);
      objectInputStream = new ObjectInputStream(fileInputStream);

      try
      {
        object = objectInputStream.readObject();
      }
      catch (EOFException e)
      {
        System.out.print("Done reading");
      }
      catch (IIOException e){
        System.out.println("IIOE exception");
      }
    }
    finally
    {
      if (objectInputStream != null)
      {
        try
        {
          objectInputStream.close();
        }
        catch (IOException e)
        {
          System.out.print("IO error when closing file: " + fileName);
        }
      }
    }
    return object;
  }

  private void writeText(String fileName, String str, boolean append) throws FileNotFoundException
  {
    PrintWriter writeToFile = null;

    try
    {
      FileOutputStream fileOutStream = new FileOutputStream(fileName, append);
      writeToFile = new PrintWriter(fileOutStream);
      writeToFile.println(str);
    }
    finally
    {
      if (writeToFile != null)
      {
        writeToFile.close();
      }
    }
  }

  /**
   * Writes a string to a text file
   * @param fileName the name of the file in which the string will be written
   * @param str the string that will be written in the specified file
   * @throws FileNotFoundException exception thrown if the file could not be found
   */
  public void writeToTextFile(String fileName, String str) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName);
    PrintWriter write = new PrintWriter(fileOut);
    write.println(str);
    write.close();
    System.out.println("Done writing to file.");
  }

  /**
   * Appends a string to a text file
   * @param fileName the name of the file in which the string will be appended
   * @param str the string that will be appended to the specified file
   * @throws FileNotFoundException exception thrown if the file could not be found
   */
  public void appendToTextFile(String fileName, String str) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName, true);
    PrintWriter write = new PrintWriter(fileOut);
    write.println(str);
    write.close();
    System.out.println("Done appending to file.");
  }

  /**
   * Reads a string from a text file
   * @param fileName the name of the file from which the string will be read
   * @return the read string
   * @throws FileNotFoundException exception thrown if the file could not be found
   */
  public String readFromTextFile(String fileName) throws FileNotFoundException
  {
    FileInputStream fileIn = new FileInputStream(fileName);
    Scanner read = new Scanner(fileIn);
    read.close();
    System.out.println("Done reading to file.");
    return read.nextLine();
  }

  /**
   * Writes an array of strings to a text file
   * @param fileName the name of the file in which the strings will be written
   * @param string the array of strings that will be written in the specified file
   * @throws FileNotFoundException exception thrown if the file could not be found
   */
  public void writeArrayToTextFile(String fileName, String[] string) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName);
    PrintWriter write = new PrintWriter(fileOut);
    for (String string1 : string)
    {
      write.println(string1);
    }
    write.close();
    System.out.println("Done writing to file.");
  }

  /**
   * Appends an array of strings to a text file
   * @param fileName the name of the file to which the strings will be appended
   * @param strings the array of strings that will be appended
   * @throws FileNotFoundException exception thrown if the file could not be found
   */
  public void appendArrayToTextFile(String fileName, String[] strings) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName, true);
    PrintWriter write = new PrintWriter(fileOut);
    for (String string : strings)
    {
      write.println(string);
    }
    write.close();
    System.out.println("Done appending to file.");
  }

  /**
   * Reads an array of string from a text file
   * @param fileName the name of the file from which the strings will be read
   * @return the array of strings read from the specified file
   * @throws FileNotFoundException exception thrown if the file could not be found
   */
  public static String[] readArrayFromTextFile(String fileName) throws FileNotFoundException
  {
    Scanner readFromFile = null;
    ArrayList<String> string = new ArrayList<String>();

    try
    {
      FileInputStream fileInStream = new FileInputStream(fileName);
      readFromFile = new Scanner(fileInStream);

      while (readFromFile.hasNext())
      {
        string.add(readFromFile.nextLine());
      }
    }
    finally
    {
      if (readFromFile != null)
      {
        readFromFile.close();
      }
    }

    String[] stringArray = new String[string.size()];
    return string.toArray(stringArray);
  }
}
