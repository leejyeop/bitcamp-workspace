package com.eomcs.basic.oop.ex03;

public class Exam0650 {

  public static class A {
    static int a;
    static void m() {}
    static {
      System.out.println("Static{} 11111");
    }
    static {
      System.out.println("Static{} 22222");
    }
  }
  public static void main(String[] args) throws Exception {
    Class.forName("com.eomcs.basic.oop.ex03.Exam0650$A");

    System.out.println("종료!");
  }
}


