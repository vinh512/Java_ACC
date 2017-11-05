package edu.acc.java2.word_counter;

import java.io.*;

public class WordCounter {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java edu.acc.java.word_counter.WordCounter [txt filename] [word]");
      return;
    }

    final String FILE = args[0];
    final String WORD_MATCH = args[1];

    try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
      String line;
      int countTotal = 0;

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

  private static int countMatch(String line, String wordSearch) {
    int count = 0;
    String[] wordArray = line.replaceAll("[^a-zA-z]", " ").split(" ");

    for (String word : wordArray) {
      if (wordSearch.equals(word))
        count++;
    }
    return count;
  }

}
