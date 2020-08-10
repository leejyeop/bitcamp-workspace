package com.eomcs.basic.oop.ex03;
//초기화 블록
//스태틱 초기화 블록
//인스턴스 초기화블록
public class Exam0610 {

  static class A {

    static int x =100; //변수 선언 +초기화 문장 (variable initializer)
    //스태틱 변수초기화 문장은 스태틱 블록앞부분에삽입된 다

    static void m1() {}
    int y = 100; //초기화 문자
    //인스턴스변수 초기화 문자는 생성자의 앞부분에 삽입된다.

    //스태틱 초기화블록
    //클래스가 로딩되고 스태틱 필드가 생성된 후 스태틱 블럭을 순서대로 실행한다.
    //
    //정확한 내용
    //스태틱 블록이 여러개일경우 컴파일 과정에서 한개의 스태틱 블록으로 합친다.
    static {
      x = 200;
      System.out.println("static 블록 #1");
    }
    //인스턴스초기화블록
    //인스턴스가 생성되고 즉시 인스턴스 블럭이 순서대로 실행된다
    //그런후 생성자가 호출 된다
    //정확한내용
    // => 실제 인스턴스 블록은 컴파일 과정에서 모든 생성자의 처음부분에 삽입된다.

    {
      y = 200;
      System.out.println("인스턴스 블록 #1");

    }

    public A() {
      System.out.println("A() 생성자 호출 됨");
      //y = 300;
    }
    public A(int value) {
      System.out.println("A(int)생성자 호출됨 ");
    }
    {
      System.out.println("인스턴스 블록 #2");
    }
    static {
      x = 100;
      x = 200;
      System.out.println("스태틱 블록 #2");
    }
  }
  static class B{
    static int x = 100;;//
    int y =1000;//생성자에 삽입
    //
    static {
      x = 200;
    }
    public B() {
      y = 3000;
    }

    {
      y = 2000;
    }
  }
  public static void main(String[] args) {
    System.out.println("실행");
    A obj1;//A래퍼런스를 선언 할 때는 클래스가 로딩되지 않음
    obj1 = new A();
    //A.x = 100; //스태틱 맴버(필드, 매소드)를 사용할 때 로딩된다.
    //A.m1();
    System.out.println("-------------------------------");
    new A();//인스턴스를 생성하기전에 클래스가 로딩 되지않았다면 먼저 로딩한다
    System.out.println(A.x);
    System.out.println(obj1.y);
    new A(100);

  }
}
