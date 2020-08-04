package com.eomcs.basic.ex07;



public class test07 {

  static class MyObject {
    int a;
    int b;
  }

  public static void main(String[] args) {
    MyObject ref;
    ref = getMyObject();
    System.out.println(ref.a);
    System.out.println(ref.b);

  }
  static MyObject getMyObject() {
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;
    return ref;
  }
}
