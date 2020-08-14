package com.eomcs.corelib.ex03;

//인스턴스 /객체( 의 주소를)를 담을 래퍼런스 배열을 준비한다.
//인스턴스를 추가하는 add() 메서드 정
public class MyArrayList2 {
  static Object[] elememtData = new Object[5];
  static int size;

  public static boolean add(Object e) {
    elememtData[size++] = e;
    //size++;
    return true;
  }

}
