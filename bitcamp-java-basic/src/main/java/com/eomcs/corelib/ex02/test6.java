package com.eomcs.corelib.ex02;

public class test6 {
  public static void main(String[] args) {
    String s1 = new String("Hello");//힙에생성 힙에생성은 메모리주소가다름
    String s2 = new String("Hello");//힙에서 생성

    System.out.println(s1 == s2);// false  메모리주소 비교
    System.out.println(s1.equals(s2));// 값 비교 true
  }
}
