package com.eomcs.basic.oop;

public class Exam0115 {

  static class Score {
    String name;//설계도
    int kor;//설계도
    int math;//설계도
    int eng;//설계도
    int sum ;//설계도
    float aver;//설계도

    void compute(Score s) {//non static은값을 줘야한다 s1,s2
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
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
    s1.compute(s1);

    printScore(s1);
    System.out.println("---------------------------");

    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 100;
    s2.eng = 94;
    s2.math = 88;
    s1.compute(s2);
    printScore(s2);
  }



  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor ,s.eng, s.math, s.sum, s.aver);
  }
}