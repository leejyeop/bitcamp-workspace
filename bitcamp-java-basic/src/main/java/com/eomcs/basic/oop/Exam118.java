package com.eomcs.basic.oop;

import com.eomcs.util.Score3;

public class Exam118 {


  public static void main(String[] args) {


    Score3 s1 = new Score3();
    s1.init("홍길동",90,100,87);
    s1.compute();
    printScore(s1);
    System.out.println("---------------------------");

    Score3 s2 = new Score3();
    s2.init("임꺽정",100,94,98);
    s2.compute();
    printScore(s2);
    s1.kor = 50;
    s1.compute();
    System.out.println("------------------");
    printScore(s1);

  }



  static void printScore(Score3 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor ,s.eng, s.math, s.sum, s.aver);
  }
}
