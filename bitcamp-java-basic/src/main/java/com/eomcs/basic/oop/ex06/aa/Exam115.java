package com.eomcs.basic.oop.ex06.aa;

public class Exam115 {
  public static void main(String args) {

    Car c = new Sedan();

    c.model = "티코";
    c.capacity = 5;
    c.value = 16;
    c.cc = 890;

    c.sunroof = ture;
    c.auto = ture;

    ((Sedan)c).sunroof = true;
    ((Sedan)c).auto = true;

    Sedan s = (Sedan)c;

    s.sunroof = true;
    s.auto = true;

  }
}
