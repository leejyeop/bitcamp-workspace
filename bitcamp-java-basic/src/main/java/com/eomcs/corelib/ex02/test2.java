package com.eomcs.corelib.ex02;

public class test2 {
  public static void main(String[] args) {
    String x1 = "Hello";//상수풀에 생성
    String x2 = "Hello";//있으면 그거 그냥그대로 씀 주소 같음
    System.out.println(x1 == x2);
  }
}
