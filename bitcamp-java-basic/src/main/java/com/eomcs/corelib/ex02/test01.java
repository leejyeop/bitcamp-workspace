package com.eomcs.corelib.ex02;

public class test01 {
  public static void main(String[] args) {
    String s1;
    s1 = new String("Hello"); //힙에 생성
    String s2 = new String("Hello"); //힙에생성 메모리 주소가 다름

    System.out.println(s1 == s2);
  }
}
