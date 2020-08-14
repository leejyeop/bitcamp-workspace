package com.eomcs.corelib.ex02;

public class test7 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("HeLLo");

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
  }
}
