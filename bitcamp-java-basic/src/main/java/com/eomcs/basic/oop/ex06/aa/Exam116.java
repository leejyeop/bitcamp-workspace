package com.eomcs.basic.oop.ex06.aa;

public class Exam116 {
  public static void main(String args) {

    Car c = new Car();

    c.model = "타우론";
    c.capacity = 2000000;
    c.cc = 376400000;
    c.value = 3;
    Sedan s = (Sedan)c;
    s.sunroof = true;
    s.auto = true;


  }
}
