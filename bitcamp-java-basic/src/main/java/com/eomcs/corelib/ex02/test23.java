package com.eomcs.corelib.ex02;

public class test23 {

  public static void main(String[] args) {
    // int ==> Integer
    int i1 = 100;
    Integer obj1 = Integer.valueOf(i1);

    // Integer ==> int
    Integer obj2 = Integer.valueOf(200);
    int i2 = obj2.intValue();

  }
}
