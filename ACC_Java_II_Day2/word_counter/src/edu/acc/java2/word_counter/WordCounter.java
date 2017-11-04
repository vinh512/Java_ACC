package edu.acc.java2.word_counter;

import java.io.*;

public class WordCounter {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java edu.acc.java.word_counter.WordCounter [txt filename] [word-to-count] ");
      return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
      String line;
      int countTotal = 0;

      while ((line = br.readLine()) != null) {
        countTotal += countMatch(line, args[1]);
      }
      System.out.printf("The word \"%s\" appeared %d times.\n", args[1], countTotal);
    }
    catch (IOException e) {
      System.out.println("Possibly can't find file");
    }
     catch (Exception e) {
      System.out.println("Generic Error");
    }
  }

  private static int countMatch(String line, String wordSearch) {
    int count = 0;
    String[] wordArray = line.replaceAll("[^a-zA-z]", " ").split(" ");

    for (int i = 0; i < wordArray.length; i++) {
      if (wordSearch.equals(wordArray[i].toLowerCase())) {
        count++;
      }
    }
    return count;
  }

}
