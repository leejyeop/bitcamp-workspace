package com.eomcs.basic.ex07;

import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    for (int starLen = 1; starLen <= len; starLen += 2) {
      printSpace((len-starLen) / 2);
      printStars(starLen);
      System.out.println();
    }
    keyScan.close();
  }
  public static void printSpace(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print(" ");
    }
  }
  public static void printStars(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print("*");
    }
  }
}
