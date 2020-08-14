package com.eomcs.corelib.ex03;

public class MyArrayListTest {
  public static void main(String[] args) {
    MyArrayList.add("aaa");
    MyArrayList.add("bbb");
    MyArrayList.add("ccc");
    MyArrayList.add("DDD");
    MyArrayList.add("eee");
    MyArrayList.add("ccc");

    print();
    MyArrayList.add(1, "xxx");
    print();
    MyArrayList.set(2, "yyy");

    Object prevObj = MyArrayList.set(2, "yyy");
    print();


    Object old = MyArrayList.remove(1);
    print();
  }

  static void print() {
    for (int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}