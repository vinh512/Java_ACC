package edu.acc.java2.word_counter;

import java.io.*;
import java.util.Arrays;

public class WordCounter {
  public static void main(String[] args) {
      if (args.length != 2) {
        System.out.println("Usage: java edu.acc.java.word_counter.WordCounter [txt filename] [word-to-count] ");
        return;
      }

      try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
      {
        String line;
        int countTotal = 0;

        while ((line = br.readLine()) != null) {
          System.out.println(args[1]);
          //find word and increment count
          countTotal += countMatch(line, args[1]);
        }

        System.out.println(countTotal);

      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Can't find file");

      } catch (Exception e) {
        System.out.println("Error?");
      }
  }

  private static int countMatch(String line, String wordSearch) {
    int count = 0;
    String[] wordArray = line.split(" ");
    System.out.println(Arrays.toString(wordArray));

    for (int i = 0; i < wordArray.length; i++) {
      if (wordSearch.equals(wordArray[i].toLowerCase())) {
        count++;
      }
    }
    System.out.println(count);
    return count;
  }

}
