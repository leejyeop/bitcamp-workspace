package com.eomcs.basic.oop.ex06.bb;

public class Exam0110 {
  static class Calculator {
    static int plusi(int a, int b) {
      return a + b;
    }
    static int plusi2(int a) {
      return a + a;
    }
    static float plusif(float a, float b) {
      return a + b;
    }

  }
  public static void main(String[] args) {
    int r1 = Calculator.plusi(100,200);
    int r2 = Calculator.plusi2(100);
    float r3 = Calculator.plusif(35.7f,22.2f);
    float r4 = Calculator.plusif(35.7f,22);
    System.out.printf("%d, %d, %.1f\n", r1, r2, r3);
    System.out.printf("%d, %d, %.1f\n", r1, r2, r3);
  }
}
