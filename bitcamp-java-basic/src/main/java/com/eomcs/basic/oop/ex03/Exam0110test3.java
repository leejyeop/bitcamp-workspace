//인스턴스변수
package com.eomcs.basic.oop.ex03;

public class Exam0110test3 {

  static class A {
    static int v1;
    int v2;
  }

  public static void main(String[] args) {

    A.v1 = 100;
    A p = new A();

    p.v2 = 200;

    A p2 = new A();
    p2.v2 = 300;

    System.out.printf("%d,%b\n", A.v1,A.v2);}

}