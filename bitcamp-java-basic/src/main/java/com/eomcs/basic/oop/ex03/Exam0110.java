package com.eomcs.basic.oop.ex03;

public class Exam0110 {
  public static void main(String[] args) {
    //인스턴스 변수에 대해서 알아보
    class A { //A 설계도
      int v1; //인스턴스 변수 HEAP에준비되는 변수
      boolean v2; //인스턴스 변수
    }
    new A();
    A obj1 = new A(); //A의 객체의 주소를 담을 래퍼런스 obj1
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    obj1.v2 = true;
    obj2.v2 = false;
    obj3.v2 = false;
    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);
    //A a1 = new A();
  }

}
