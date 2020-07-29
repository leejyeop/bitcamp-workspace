//논리연산자 && vs &
package com.eomcs.basic.ex05test;

public class Exam0330 {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    System.out.printf("a=%b, b=%b,r=%b\n", a, b, r);
// &가 두개이면 계산 결과가 확정되면 오른쪽연산을 실행하지않는다
    //따라서  b = true 는 들어가지않고 b는 false가 된다.
    
    a = false;
    b = false;
    r = a & (b = true);
    System.out.printf("a=%b,b=%b,r=%b\n", a, b, r);
  }
}
