package com.eomcs.basic.ex06;

public class Exam0420 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 == 0)
          continue; // 다음 줄로 가지 않고 '변수증가문'으로 이동한다.
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
  }

