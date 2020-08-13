package com.eomcs.basic.oop.ex05.f;

public class B {
  int v2;

  B(int value) {
    // 수퍼 클래스의 어떤 생성자를 호출할지 지정하지 않으면 컴파일러는
    // 다음과 같이 수퍼 클래스의 기본 생성자를 호출하라는 명령을 붙인다.
    super(); // 즉 개발자가 붙이지 않으면 자동으로 붙인다.
    this.v2 = value;
    System.out.println("B(int) 생성자!");
  }
  void m2() {
    System.out.println("B.m2()");
  }
}






