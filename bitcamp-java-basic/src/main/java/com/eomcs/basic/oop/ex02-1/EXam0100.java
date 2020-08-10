package com.eomcs.basic.oop.ex02;

import com.eomcs.util.Calculater;

public class EXam0100 {
  public static void main(String[] args) {//



    Calculater c1 = new Calculater();//new연산자 힙영역생성 변수만 있는곳
    //Calculater 설계도에 따른 c1생성 메인영역에
    c1.plus(4);
    c1.plus(6);
    c1.divide(2);
    c1.multiple(4);

    printResult(c1.result);

  }
  static void printResult(int value) { //스태틱 stack 영역 변수만 있는곳
    System.out.println("************************************");
    System.out.printf("==> 결과 = %d", value);
    System.out.println("************************************");
  }

}