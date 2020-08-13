package com.eomcs.basic.oop.a;

public class Exam0110 {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.maker = "비트자동차";
    c1.model = "티코";
    c1.capacity = 5;

    Car c2 = new Car("비트자동차","티코",5);
    System.out.println(c2.maker);
  }
}
