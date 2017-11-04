package edu.acc.java2.word_counter;

import java.io.*;
import java.util.Arrays;

public class WordCounter {

  public static void main(String[] args) {
      if (args.length != 2) {
        System.out.println("Usage: java edu.acc.java.word_counter.WordCounter [txt filename] [word] ");
        return;
      }

      System.out.println("Hello");

      try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
      {
        String line;
        String wordFind = args[1];
        String wordArray[];

        int count = 0;


        while ((line = br.readLine()) != null) {
          System.out.println(args[1]);
          //find word and increment count
          //countMatch();
          wordArray = line.split(" ");
          System.out.println(Arrays.toString(wordArray));

          for (int i = 0; i < wordArray.length; i++) {
            if (wordFind.equals(wordArray[i])) {
              count++;
            }
          }

          System.out.println(count);
        }

      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Can't find file");

      } catch (Exception e) {
        System.out.println("Error?");
      }

  }

}
