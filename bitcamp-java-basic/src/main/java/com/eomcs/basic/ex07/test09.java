package com.eomcs.basic.ex07;

public class test09 {
  public static void main(String[] args) {
    System.out.println(sum(5));
  }
  static int sum(int value) {
    if (value == 1) {
      return 1;
    }
    return value + sum(value -1);
  }//
}
