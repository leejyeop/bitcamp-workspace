package com.eomcs.basic.oop.ex03;

public class Exam0130 {
  static class A { //A 설계도 //스태틱은 메소드안에 클래스를 선언하는경우 붙일수 없음
    static int v1; //인스턴스 field 변수 HEAP에준비되는 변수 non static variable
    boolean v2; //인스턴스 변수
    //스태틱변수는 메소드에어리어에 생성됨
  }
  public static void main(String[] args) { //스택에 메인
    //인스턴스 변수에 대해서 알아보자
    new A();
    A obj1 = new A(); //A의 객체의 주소를 담을 래퍼런스 obj1 //A클래스 로딩 스태틱필드  (클래스변수)만듬 2개 v1 ,v2
    A obj2 = new A();

    // 래퍼런스 변수명 = 100;
    // -래퍼런스가 가르키는 인스ㅓㄴ스에서 해당변수를 찾아 값을 넣는다.
    // - 없다면 클래스 변수를 찾아 값을 넣는다
    //래퍼런스 다음에 지정한 변수가 인스턴스 변수가 아니라 클래스 변수라면
    //컴파일러가 컴파일 하는 과정에 정확하게 클래스변수를 가르키도록 기계어로 바꾼다
    //갭라자가 래퍼런스를 통해 클래스 변수를 지정하더라도 컴파일러가 클래스변수로 클래스 변수를 사용하는
    //코드로 변환한다
    obj1.v1 = 100; //v1 = 100;//A클래스의 클래스변수
    obj2.v1 = 200; //v1 = 200;

    obj1.v2 = true;
    obj2.v2 = false;

    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj1.v2);
    System.out.println(obj2.v2);
    //A a1 = new A();
  }

}
