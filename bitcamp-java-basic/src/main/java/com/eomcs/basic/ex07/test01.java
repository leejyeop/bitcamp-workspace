package com.eomcs.basic.ex07;

public class test01 {
  public static void main(String[] args) {

    int result = plus(2,3);
    result = plus(result, 4);
    result = plus(result, 5);
    System.out.println(result);

    result = plus(plus(plus(2, 3), 4), 5);

    System.out.println(result);
    System.out.printf("100 + 200 = %d\n", plus(100, 200));

  }
  static int plus(int a, int b) {
    return a + b;
  }
}
