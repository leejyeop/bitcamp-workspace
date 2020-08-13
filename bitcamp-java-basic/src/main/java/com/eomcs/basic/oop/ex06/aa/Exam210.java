package com.eomcs.basic.oop.ex06.aa;

public class Exam210 {
  public static void main(String args) {

    Vehicle v1 = new Sedan();
    v1.model = "티코";
    v1.capacity = 5;

    Sedan s = (Sedan)v1;

    s.auto = true;
    s.sunroof = true;
    s.cc = 1960;
    s.value = 24;



  }
}
