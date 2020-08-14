package com.eomcs.corelib.ex02;

public class test10 {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    System.out.println(b1 == b2);//서로다른객채 false
    System.out.println(b1.equals(b2));//오버라딩안함 따라서 false
  }
}
