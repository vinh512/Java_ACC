package edu.acc.java2.word_counter;

public class WordCounter {

  public static void main(String[] args) {
      if (args.length != 2) {
        System.out.println("Usage: java edu.acc.java.WordCounter [txt filename] [word] ")
        return;
      }

      try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
        String line;
        while ((line = br.readLine()) != null) {

        }

      } catch (IOException e) {

      }

  }

}
