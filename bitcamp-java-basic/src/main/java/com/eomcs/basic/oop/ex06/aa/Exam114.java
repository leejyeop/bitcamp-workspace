package com.eomcs.basic.oop.ex06.aa;

public class Exam114 {
  public static void main(String args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Car c2 = null;

    c2 = s;
    c2 = t;

    c2 = s;

    c2.model = "티코";
    c2.capacity = 5;
    c2.cc = 890;
    c2.value = 16;


  }
}
