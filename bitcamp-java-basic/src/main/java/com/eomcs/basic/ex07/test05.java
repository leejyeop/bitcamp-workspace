package com.eomcs.basic.ex07;

public class test05 {
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    swap(a, b);
    System.out.printf("main(): a=%d, b=%d\n:", a, b);
  }
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
}
