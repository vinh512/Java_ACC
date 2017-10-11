// we need to create a directory of folders (edu, acc, java1, and day1 with the .class file
//package edu.acc.java1.day1;

// by importing this, we don't need to type out 'System'
import static java.lang.System.out;
import javax.swing.JOptionPane;

public class Hello2017 {

  public static void main(String[] args) {
      // get a random greeting
      final String GREETING = getRandomGreeting();
      // build a RESPONSE
      final String RESPONSE = buildResponse(GREETING);
      // display the response
      display(RESPONSE);
  }

  private static String getRandomGreeting() {
    // provide a predefined array of greeting messages
    final String[] GREETINGS = {"Hello", "Wassup", "Yo", "Hi", "Howdy"};
    // generates of random number from 0 - 4
    final String GREETING = GREETINGS[ (int)(Math.random() * GREETINGS.length) ];
    return GREETING;
  }

  private static String buildResponse(final String GREETING) {
    String name;
    // do until user enters valid name
    do  {
      name = System.console().readLine("What's your name? ");
    } while (name.isEmpty());
    // builds a string and assigns it to RESPONSE constant
    final String RESPONSE = String.format("%s, %s\n", GREETING, name);
    return RESPONSE;
  }

  private static void display(final String RESPONSE) {
    // prints out the message
    out.print(RESPONSE);
    // opens a dialog prompt displaying the greeting message
    JOptionPane.showMessageDialog(null, RESPONSE);
  }

}