//논리연산자  || 또는 |
package com.eomcs.basic.ex05test;

public class Exam0340 {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean r = a || (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    //연산자가 두개이면 연산할떄 값이 결과가 정해지면 나머지 연산을 하지않는다
    // 따라서 b 에 true 가 들어가진 않는다
    
     r = a && (b = true);
    System.out.println(r);
    
    
    
    a = true;
    b = false;
    r = a | (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
  }
}
