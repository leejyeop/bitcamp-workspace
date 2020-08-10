package com.eomcs.basic.oop.ex02;

public class testSungjuk {

  public static class sungjuk {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {

    sungjuk s1 = new sungjuk();
    sungjuk s2 = createScore("홍길동", 100, 100, 100);

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 85;

    printScore(s1);
  }
  static void printScore(sungjuk s1) {
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;
    System.out.printf("%s: %d, %d, %d ,%d %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
  }
  static sungjuk createScore(String name, int kor, int eng, int math) {
    sungjuk s1 = new sungjuk();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    return s1;
  }
}
