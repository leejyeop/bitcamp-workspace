package com.eomcs.basic.oop.ex02;

import com.eomcs.util.Calculater;

public class Exam0210 {

  public static void main(String[] args) {
    //연산자 우선순위 고려하지말고 나온순서대로 계산하라
    //식1) 2 + 3 - 1 * 7 / 3 = ?
    //식2) 3 * 2 * 7 / 4 - 5 = ?
    //
    //식 1과 식 2를 동시에 계산 할 수있는가?
    //==>불가하다.
    //==>Calculater는 result변수를 한 개만 관리하기 떄문에
    //동시에 여러 개의 식결과를 관리 할 수없다.
    int result = 0;
    Calculater c1 = new Calculater();
    Calculater c2 = new Calculater();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);
    //식 1과 2를 같이 계산할 수없으니 차례대로 계산해야한
    printResult(c1.result);

    //식1과 식2를 동시에 계산하려면 result변수를 두개준비 해야한다
    c2.plus(3);
    c2.multiple(2);
    c2.multiple( 7);
    c2.divide(4);
    c2.minus(5);
    //식 1과 2를 같이 계산할 수없으니 차례대로 계산해야한다
    printResult(c2.result);
  }

  static void printResult(int value) {
    System.out.println("************************************");
    System.out.printf("==> 결과 = %d", value);
    System.out.println("************************************");
  }
  //class 문법
  //유지보수가 쉽도록 메서드를 한블록을 ㅗ묶는다
  //특정상황에 맞게 데이터를 다루기 쉽도록 메모리르 설계한다

}
