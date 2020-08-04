package com.eomcs.basic.ex07;
//재귀 호출
//스택 오버플로우
public class Exam0415 {

  public static void main(String[] args) throws Exception {
    int result = 1;
    int n = 5;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    System.out.println(result);
    System.out.println("-----------------");

    result = factorial(5);
    System.out.println(result);
    // result = 5 * factorial(4);
    // result = 5 * 4 * factorial(3);
    // result = 5 * 4 * 3 * factorial(2);
    // result = 5 * 4 * 3 * 2 *factorial(1);
    // result = 5 * 4 * 3 * 2 * 1;
    //

  }
  static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
    //
    //factorial(5) stack메모리 생성
    //factorial(4) stack메모리 생성
    //factorial(3) stack메모리 생성
    //factorial(2) stack메모리 생성
    //factorial(1) stack메모리 생성

  }
}


