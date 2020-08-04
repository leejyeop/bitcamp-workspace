package com.eomcs.basic.ex07;

public class test02 {

  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    swap(a,b);
    System.out.printf("main(): a=%d, b=%d\n", a, b);
  }
  static void swap(int a, int b ) {
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
    a = b;
    int temp = a;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
}
