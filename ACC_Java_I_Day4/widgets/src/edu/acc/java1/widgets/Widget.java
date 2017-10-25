package edu.acc.java1.widgets;

public class Widget {

  public final String MODEL_NO;
  public final String SERIAL_NO;
  public final String COLOR;

  public Widget(String model, String serial, String color) {
    MODEL_NO = model;
    SERIAL_NO = serial;
    COLOR = color;
  }

  @Override
  public String toString() {
    return String.format("Widget %s s/n: %s, color: %s", MODEL_NO, SERIAL_NO, COLOR);
  }
}
