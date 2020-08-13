package com.eomcs.basic.oop.ex06.aa;

public class Exam113 {
  public static void main(String args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Bike b2 = null;

    b2 = c;
    b2 = s;
    b2 = t;

  }
}
