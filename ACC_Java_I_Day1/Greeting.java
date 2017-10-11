package edu.acc.java1.day1;

public class Greeting {
  // made private so that only this class has access
  private static final String[] GREETINGS = {"Hello", "Wassup", "Yo", "Hi", "Howdy"};

  // needs to be public
  public static String getOne() {
    // generates of random number from 0 - 4
    final String GREETING = GREETINGS[ (int)(Math.random() * GREETINGS.length) ];
    return GREETING;
  }

}
