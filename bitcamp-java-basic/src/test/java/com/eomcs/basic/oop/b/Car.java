package com.eomcs.basic.oop.b;

public class Car {
  String model;
  String maker;
  int capacity;
  boolean auto;
  boolean sunroof;

  public Car() {}

  public Car(String model, String maker, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity =capacity;
  }

  public Car(String model, String maker, int capacity,
      boolean sunroof, boolean auto) {
    this(model, maker, capacity);
    this.sunroof = sunroof;
    this.auto = auto;
  }
}
