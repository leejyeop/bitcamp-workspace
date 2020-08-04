package com.eomcs.basic.ex07;

public class test10 {
  public static void main(String[] args) {
    System.out.println(sum(100000));
  }
  static int sum(int value) {
    if (value == 1) {
      return 1;
    }
    return value + sum(value - 1);
  }


}
