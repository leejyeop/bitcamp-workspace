package com.eomcs.corelib.ex01;

public class test2 {
  static class My {

  }

  public static void main(String[] args) {

    My obj = new My();
    System.out.println(obj.toString());

    My obj2 = new My();
    My obj3 = new My();

    System.out.println(obj2 == obj3);
    System.out.println(obj2.toString());
    System.out.println(obj3.toString());
  }


}
