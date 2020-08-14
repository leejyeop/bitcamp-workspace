package com.eomcs.corelib.ex02;

public class test5 {
  public static void main(String[] args) {
    String s1 = new String("Hello"); //힙에 생성
    String s2 = "Hello"; //상수풀에 생성

    String s3 = s1.intern(); //상수풀에있는걸 씀

    System.out.println(s1 == s2);//false
    System.out.println(s2 == s3);// ture
  }
}
