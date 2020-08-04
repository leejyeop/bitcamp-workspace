package com.eomcs.basic.ex07.assignment;

public class test5 {
  public static void main(String[] args) {
    System.out.println("main()11111");
    hello(20, "홍길동");

  }
  static void hello(int age,String name) {
    System.out.printf("%d 살 %s님 반갑숩니다.\n", age, name);
  }

}
