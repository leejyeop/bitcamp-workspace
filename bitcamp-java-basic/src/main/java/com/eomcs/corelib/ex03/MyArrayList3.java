package com.eomcs.corelib.ex03;

//인스턴스 /객체( 의 주소를)를 담을 래퍼런스 배열을 준비한다.
//인스턴스를 추가하는 add(Object) 메서드 정의한다
//특정 인덱스의 인스턴스를 리턴하는 get(int) 메서드를 정의한다
public class MyArrayList3 {
  static Object[] elememtData = new Object[5];
  static int size;

  public static boolean add(Object e) {
    elememtData[size++] = e;
    //size++;
    return true;
  }

  static public Object get(int index)
  {
    return elememtData[index];
  }

}
