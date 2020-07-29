package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 증가 연산자
//
public class Exam0610 {
  public static void main(String[] args) {
    int i = 2;
    //증갑연산자가 없다면
    //기존 변수의 값을 1증가시키기 위해 다음과 같이 코딩해야 한다.
   // i = i + 1;
    //증감연산자를 사용하면 다음과 같이 간단하게  작성할 수 있다.
    i++;  // 3
    // 현재 위치에 i 메모리에 들어 있는 값을 꺼내 놓는다. 
    // i 메모리의 값을 1 증가시킨다.

    i++;  // 4

    System.out.println(i); // 4

    System.out.println(i++); // 4 지만 다음 i는 5
    // System.out.println(4);
    // i = i + 1;
    System.out.println(++i); //(전위 연산자) i는 5에다 전위연산자라 1을 더해 6
    System.out.println(i); //i 는 6

  }
}
