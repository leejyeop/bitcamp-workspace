package com.eomcs.corelib.ex02;

public class test17 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = s1.replace('l', 'x');

    System.out.printf("%s : %s\n", s1, s2); // 원본은 바뀌지 않는다.

    String s3 = s1.concat(", world!");
    System.out.printf("%s : %s\n", s1, s3); // 원본은 바뀌지 않는다.
  }
}
