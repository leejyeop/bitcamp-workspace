//관계 연산자 부동 소수점 비
package com.eomcs.basic.ex05test;

public class Exam0221 {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;
    
    System.out.println(f1 * f2 == 0.01f); //false
    
    System.out.println(f1 * f2);
    
    //해결책
    //오차를 제거한 후 비교
    // 계산 결과를 절대값으로 만든 후에 오차 이하의 값인지 비교하라
    float r = f1 * f2 - 0.01f;
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
  }
}
