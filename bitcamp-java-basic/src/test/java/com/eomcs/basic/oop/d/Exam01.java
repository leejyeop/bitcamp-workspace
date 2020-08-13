package com.eomcs.basic.oop.d;

import com.eomcs.basic.oop.ex05.d.Sedan;

public class Exam01 {
  public static void main(String[] args) {
    Sedan c = new Sedan("비트자동차", "티코", 5, true, true);
    System.out.println(c.model);
    System.out.println(c.maker);
    System.out.println(c.capacity);
    System.out.println(c.sunroof);
    System.out.println(c.auto);
  }
}
