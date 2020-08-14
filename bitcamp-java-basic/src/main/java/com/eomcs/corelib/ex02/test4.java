package com.eomcs.corelib.ex02;

public class test4 {
  public static void main(String[] args) {
    String s1 = new String("Hello"); //힙에 생성

    String s2 = s1.intern();//상수풀에 생성 Hello생성 후 주소를 리턴
    String s3 = "Hello";//상수풀에 있는거 그냥 씀

    System.out.println(s1 == s2); //false
    System.out.println(s2 == s3); //true
  }
}
