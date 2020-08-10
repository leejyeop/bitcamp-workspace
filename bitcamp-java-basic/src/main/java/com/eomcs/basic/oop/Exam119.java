package com.eomcs.basic.oop;

import com.eomcs.util.Score4;

public class Exam119 {


  public static void main(String[] args) {


    Score4 s1 = new Score4("홍길동",100,70,80);
    Score4 s2 = new Score4("임꺽정",100,70,80);

    printScore(s1);

    System.out.println("---------------------------");

    printScore(s2);

    s1.kor = 50;
    s1.compute();
    s2.compute();

    printScore(s1);
    printScore(s2);
  }



  static void printScore(Score4 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor ,s.eng, s.math, s.sum, s.aver);
  }
}
