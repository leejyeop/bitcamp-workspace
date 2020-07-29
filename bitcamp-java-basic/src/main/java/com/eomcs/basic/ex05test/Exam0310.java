//논리연산
package com.eomcs.basic.ex05test;

public class Exam0310 {
  public static void main(String[] args) {
    
    //And연산 둘다 트루여야 트루
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false  && false);
    System.out.println("-----------------");
    System.out.println();
    //Or연산자 둘중하나만 트루라면 트루
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
    System.out.println("-------------");
    //Not 연산자 반대로
    System.out.println(!true);
    System.out.println(!false);
    System.out.println("------------");
    //Xor 연산자 두개값이 달라야 트루
    System.out.println( true ^ true);
    System.out.println( false ^ false);
    System.out.println(true ^ false);
    
  }
}
