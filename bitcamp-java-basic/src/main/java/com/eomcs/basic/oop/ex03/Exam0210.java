package com.eomcs.basic.oop.ex03;

public class Exam0210 {

  static class A {
    static int v1;//스태틱변수 스태틱 필드 클래스필드
    int v2;//인스턴스 변수 인스턴스 필드 논스태틱 필드
    //static method = class method
    static void m1() {
      System.out.println("m1()");
      A.v1 = 100;
      v1 = 100; //깥은 스태틱 맴버이기 때문에 생략가능
      //this.v2 = 200; //인스턴스주소를받는 메소드 this
      //인스턴스 주소를 안받음 스태틱메소드는
      //this라는 내장변수가 없다.
      //This로 사용하년 접근하여 인스턴스맴버 (필드 메소드)를 사용 할 수없다.

    }
    //non-static method = instance method
    void m2() {
      System.out.println("m2()");
      //인스턴스 필드에 접근하려면 메서드가 내장변수인
      //this 를 사용하라.
      //this 는 메서드가호출될 때 외부로부터 받은 인스턴스의
      //주소를 가지고 있다
      this.v2 = 100;
      v2 = 300; //코드를 작성할 때 this 를 생략 할 수있다.

      //스태틱 필드는 인스턴스 래퍼런스를 통해 접근할 수있다.
      //그러나 비 권장
      this.v1 = 100; //==> A.v1 = 100;
      //
      //물론 다음과 같이 클래스 이름을 생략 할 수있다.
      //반반임
      v1 = 200;// A.v1 = 200;
      A.v1 = 200;

      //인스턴스 매서드는 인스턴스 맴버(필드나 매서드)뿐만 아니라
      //클래스 맴버(필드나 매서드)도 사용할 수있다.
      m1();
      A.m1();
    }
    static int abs(int value) { //인스턴스 변수를 안쓰면 스태틱을붙여
      if (value < 0) {
        return value *-1;
      }else {
        return value;
      }
    }
  }



  public static void main(String[] args) {
    A.m1();
    //A.m2();
    //인스턴스가 있어야만 호출가능
    A obj1 = new A();
    obj1.m2();
    System.out.println(A.abs(100));
    System.out.println(Math.abs(-100));
  }

}
