package edu.acc.java2.word_counter;

/*
  The program searches through a user-specified text file and counts the number
  of times a user-specified word occurs in the file.
  Usage: java edu.acc.java.word_counter.WordCounter [txt filename] [word]
*/

import java.io.*;

public class WordCounter {

  public static void main(String[] args) {
    // ensures 2 arguments are provided
    if (args.length != 2) {
      System.out.println("Usage: java edu.acc.java.word_counter.WordCounter [txt filename] [word]");
      return;
    }
    // gives meaning behind the user-provided arguments
    final String FILE = args[0];
    final String WORD_MATCH = args[1];

    try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
      String line;
      int countTotal = 0;

      // keeps reading lines until end-of-file and increments count total
      while ((line = br.readLine()) != null) {
        countTotal += countMatch(line, WORD_MATCH);
      }
      System.out.printf("The word \"%s\" appeared %d times.\n", WORD_MATCH, countTotal);
    }
    catch (IOException e) {
      System.out.println("Possibly can't find file");
    }
    catch (Exception e) {
      System.out.println("Error");
      e.printStackTrace();
    }
  }

  // searches for the user-specified word in a String-turned-Array & keeps count
  private static int countMatch(String line, String wordSearch) {
    int count = 0;
    // removes punctuation and converts String into an array
    String[] wordArray = line.replaceAll("[^a-zA-z]", " ").split(" ");

    for (String word : wordArray) {
      if (wordSearch.equals(word))
        count++;
    }
    return count;
  }

}
