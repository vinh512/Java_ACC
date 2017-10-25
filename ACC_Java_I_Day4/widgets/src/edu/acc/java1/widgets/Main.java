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

    List<Widget> widgets = new ArrayList<>();

    widgets.add(new Widget("Mark 2", "TN-37620", "Red"));
    widgets.add(new Widget("Mark 2", "TX-76021", "Red"));
    widgets.add(new Widget("Mark 1", "WA-98112", "Red"));
    widgets.add(new Widget("Mark 1", "VA-24201", "Black"));
    widgets.add(new Widget("Mark 2", "KS-66216", "Black"));

    System.out.println("Gene's Widgets:");
    for (Widget w : widgets) {
      System.out.println(w);
    }

    Collections.sort(widgets, new SerialComparator());

    System.out.println("\nOrdered by Serial Number:");
    for (Widget w : widgets) {
      System.out.println(w);
    }
  }
}

class SerialComparator implements Comparator<Widget> {
  @Override
  public int compare(Widget a, Widget b) {
    return a.SERIAL_NO.compareTo(b.SERIAL_NO);
  }
}
