package com.eomcs.basic.oop;

public class Exam0114 {

  static class Score {
    String name;
    int kor;
    int math;
    int eng;
    int sum ;
    float aver;

    static void computeScore(Score s) {
      s.sum = s.kor + s.eng + s.math;
      s.aver = s.sum / 3f;
    }

  }
  public static void main(String[] args) {
    Score s1;
    s1 = new Score();
    //Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.math = 90;
    s1.eng = 87;
    Score.computeScore(s1);

    printScore(s1);
    System.out.println("---------------------------");

    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 100;
    s2.eng = 94;
    s2.math = 88;
    Score.computeScore(s2);
    printScore(s2);
  }



  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor ,s.eng, s.math, s.sum, s.aver);
  }
}