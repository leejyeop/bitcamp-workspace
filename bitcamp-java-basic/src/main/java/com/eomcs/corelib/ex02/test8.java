package com.eomcs.corelib.ex02;

public class test8 {
  static class Member {
    String name;
    int age;

    public Member (String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  public static void main(String[] args) {
    Member m1 = new Member("홍길동",20);
    Member m2 = new Member("홍길동",20);

    System.out.println(m1 == m2);//폴스
    System.out.println(m1.equals(m2)); //맴버 클래스에 이퀼이 오버라이딩안되있어서 폴
  }
}
