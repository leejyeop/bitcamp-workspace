package com.eomcs.corelib.ex02;

public class test12 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1.hashCode() == s2.hashCode());
    //Object 의 hashcode는 인스턴스만다 다르지만
    //String 의 hashcode는 문자열이 같으면 같은 hashcode를 리턴하도록 오버라이딩 하였다
    //이유
    //문자열이 같은경우 같은 객체로다루기 위함]
    // - HashSet 에서 객체를 저장할 때 이 메서드의 리턴 값으로 저장 위치를 계산한다.
    // - HashMap이나 Hashtable에서는 Key를 다룰 때 이 메서드의 리턴 값을 사용한다.
    // - 보통 equals()를 함께 오버라이딩 한다.
  }
}
