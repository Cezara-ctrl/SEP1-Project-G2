package utils;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileHandler
{
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

  public void writeToTextFile(String fileName, String str) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName);
    PrintWriter write = new PrintWriter(fileOut);
    write.println(str);
    write.close();
    System.out.println("Done writing to file.");
  }

  public void appendToTextFile(String fileName, String str) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName, true);
    PrintWriter write = new PrintWriter(fileOut);
    write.println(str);
    write.close();
    System.out.println("Done appending to file.");
  }

  public String readFromTextFile(String fileName) throws FileNotFoundException
  {
    FileInputStream fileIn = new FileInputStream(fileName);
    Scanner read = new Scanner(fileIn);
    read.close();
    System.out.println("Done reading to file.");
    return read.nextLine();
  }

  public void writeArrayToTextFile(String fileName, String[] strs) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName);
    PrintWriter write = new PrintWriter(fileOut);
    for (String string : strs)
    {
      write.println(string);
    }
    write.close();
    System.out.println("Done writing to file.");
  }

  public void appendArrayToTextFile(String fileName, String[] strs) throws FileNotFoundException
  {
    FileOutputStream fileOut = new FileOutputStream(fileName, true);
    PrintWriter write = new PrintWriter(fileOut);
    for (String string : strs)
    {
      write.println(string);
    }
    write.close();
    System.out.println("Done appending to file.");
  }

  public String[] readArrayFromTextFile(String fileName) throws FileNotFoundException
  {
    FileInputStream fileIn = new FileInputStream(fileName);
    Scanner read = new Scanner(fileIn);
    ArrayList<String> strs = new ArrayList<String>();
    while (read.hasNext())
    {
      strs.add(read.nextLine());
    }
    read.close();
    String[] strsArray = new String[strs.size()];
    strsArray = strs.toArray(strsArray);
    System.out.println("Done reading to file.");
    return strsArray;
  }
}
