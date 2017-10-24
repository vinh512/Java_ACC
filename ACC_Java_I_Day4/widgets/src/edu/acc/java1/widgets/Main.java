/*
Widgets, Inc. has two widget models, the Mark 1 and the Mark 2.
Each Widget manufactured has a serial number and comes in either red or black.
Today, Gene made two Mark 1 widgets. The red one had the serial number WA-98112
and the black one had serial number VA-24201. His three Mark 3s were red, black,
 red with serial numbers TN-37620, KS-66216, and TX-76021 respectively.

Write a Java program to display the model, serial number, and color of each of
Gene's widgets using a simple loop. Add to your program a display of all the
widgets ordered by serial number.
*/

package edu.acc.java1.widgets;

import java.util.*;

public class Main {

  public static void main(String[] args) {

    Widget w1 = new Widget("Mark 2", "TN-37620", "Red");
    Widget w2 = new Widget("Mark 2", "TX-76021", "Red");
    Widget w3 = new Widget("Mark 1", "WA-98112", "Red");
    Widget w4 = new Widget("Mark 1", "VA-24201", "Black");
    Widget w5 = new Widget("Mark 2", "KS-66216", "Black");

    List<Widget> widgets = new ArrayList<>();

    widgets.add(w1);
    widgets.add(w2);
    widgets.add(w3);
    widgets.add(w4);
    widgets.add(w5);

    System.out.println("Gene's Widgets:");
    for (Widget w : widgets) {
      int size = w.toString().length();
      StringBuilder sb = new StringBuilder(size);
      sb.append(w.MODEL_NO).append(" s/n: ").append(w.SERIAL_NO);
      sb.append(", color: ").append(w.COLOR).append("\n");
      System.out.printf("Widget %s", sb.toString());
    }

    System.out.println("\nOrdered by Serial Number:");


    }
}
