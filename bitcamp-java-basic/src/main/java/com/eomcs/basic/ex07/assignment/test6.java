package com.eomcs.basic.ex07.assignment;

public class test6 {
  // 3) 메서드 : 리턴값(O), 파라미터(X)
  // => 메서드 블록을 실행한 후 값을 리턴하는 메서드.
  // 메서드 정의할 때 어떤 값을 리턴하는 지 그 타입을 적어야 한다.
  // 메서드에서도 종료하기 전에 반드시 그 타입의 값을 리턴해야 한다.
  // => 리턴 타입은 반드시 한 개만 가능하다.
  // 만약 여러 개의 값을 리턴하고 싶다면, 배열에 담거나 객체에 담아 리턴하라!
  // => "손들어. 돈내놔!"
  static String hello() {
    // 값을 리턴하는 문법
    // return 값;
    return "안녕하세요!"; // 리턴 명령을 실행하면 메서드 실행을 종료한다.

    // 메서드를 리턴한 후에 작업을 수행할 수 없다.
    // int a; // 컴파일 오류!
    // System.out.println("NO!"); // 컴파일 오류!
  }

  static String hello(String name, int age) {
    String retVal = String.format("%d살 %s님을 환영합니다!", age, name);
    return retVal;
  }

  public static void main(String[] args) {

    // hello() 메서드를 실행하고, 그 리턴 값을 변수에 담는다.
    String r = hello("홍길동", 20);
    System.out.println(r);

    // 리턴 값을 안 받아도 된다.
    // 리턴 값은 버려진다.
    String k = hello("임꺽정", 30);
    System.out.println(k);

  }
}
