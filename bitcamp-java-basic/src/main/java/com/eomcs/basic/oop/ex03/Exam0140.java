package com.eomcs.basic.oop.ex03;

public class Exam0140 {
  static class A {
    static int v1; //클래스 변수
    int v2;//인스턴스 변수
  }
  public static void main(String[] args) {
    //클래스 변수는 클래스가 로딩되는 시점에 Method area에 생성된다.
    //클래스가 로딩되는 때?
    //로딩되지 않은 클래스를 사용할 때
    //클래스 변수(static 변수 )를 사용하거나 클래스 매서드(static method)를 사용하려 할 때
    A.v1 = 100;

    //인스턴스 변수는 new 로 인스턴스를 생성할 때 만다 heap에 생성된다
    A obj1 = new A();
    A obj2 = new A();

    obj1.v2 = 200;
    obj1.v2 = 300;

    System.out.println(A.v1);
    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj1.v2);
    System.out.println(obj2.v2);


  }
}
