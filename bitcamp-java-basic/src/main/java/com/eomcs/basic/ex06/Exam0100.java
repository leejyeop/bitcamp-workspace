package com.eomcs.basic.ex06;

public class Exam0100 {
  public static void main(String[] args) {
    int age1 = 64;
    if (age1 >= 19) {
      System.out.println("성인");
    }
    if (age1 >= 65) {
      System.out.println("노인연금수령대상자 입니다");
    }
    //독립적으로 검사해야할때

    int age = 18;
    //이프문안에 대괄호로 안 묶으면 한문장만 실행
    if (age >= 19) {
      System.out.println("성인");
    } else {
      System.out.println("미성년");
    }
    System.out.println("------------");
    int gender = 2;
    if (gender == 1) {  //서로 배타적인경
      System.out.println("여성");

      System.out.println("------------");
    } else {
      System.out.println("남성");
      System.out.println("------------");
    }
    System.out.println("----------------------");

    int age2 = 17;
    // 대괄호가 없을때 else는 가장 가까운 if 문과 연결되어 묶인다
    //(if (if else) else)
    //문장이 하나일때는 괄호 안쳐도댐
    if (age2 >= 19)
      if (age2 >= 65)
        System.out.println("지하철 무임승차 가능합니다.");

      else
        System.out.println("미성년입니다");

    //원래 문장
    System.out.println("-----------------");
    int age3 = 18 ;
    if (age3 < 8)
      System.out.println("아동");
    else
      if (age3 < 14)
        System.out.println("어린이");
      else
        if (age3 < 19)
          System.out.println("청소년");
        else
          if (age3 < 65)
            System.out.println("성인");
          else
            System.out.println("노인");
    System.out.println("-------------------");
    //자바는 else if 라는 문법이없다.
    age3 = 55 ;
    if (age3 < 8)
      System.out.println("아동");
    else if (age3 < 14)
      System.out.println("어린이");
    else if (age3 < 19)
      System.out.println("청소년");
    else if (age3 < 65)
      System.out.println("성인");
    else
      System.out.println("노인");

    System.out.println("-------------------");
    //자바는 else if 라는 문법이없다.
    age3 = 22 ;
    if (age3 < 8) {
      System.out.println("아동");
    } else if (age3 < 14) {
      System.out.println("어린이");
    } else if (age3 < 19) {
      System.out.println("청소년");
    } else if (age3 < 65) {
      System.out.println("성인");
    } else {
      System.out.println("노인");
    }



  }
}
