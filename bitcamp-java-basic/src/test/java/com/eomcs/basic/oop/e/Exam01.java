package com.eomcs.basic.oop.e;

public class Exam01 {
  public static void main(String[] args) {
    B obj = new B();
    obj.v2 = 200;
    obj.v1 = 200;
    System.out.printf("v2 =%d, v1 =%d\n" , obj.v1, obj.v2);

    B obj2 = new B();
    obj.v2 = 2000;
    obj.v1 = 1000;
    System.out.printf("v2=%d, v1=%d\n",obj2.v2, obj.v1);
  }
}
