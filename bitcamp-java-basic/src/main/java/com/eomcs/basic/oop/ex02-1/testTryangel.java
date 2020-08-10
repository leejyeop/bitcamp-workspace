package com.eomcs.basic.oop.ex02;

import com.eomcs.util.tryAngle;

public class testTryangel {
  public static void main(String[] args) {
    tryAngle t1 = new tryAngle();

    t1.tryanlge(2, 3);
    printResult(t1.result);
  }

  static void printResult(int value) {
    System.out.println(value);
  }
}
