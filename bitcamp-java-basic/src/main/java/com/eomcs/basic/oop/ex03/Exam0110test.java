//인스턴스변수
package com.eomcs.basic.oop.ex03;

public class Exam0110test {
  public static void main(String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3f;

    s2.name = "임꺽정";
    s2.kor = 100;
    s2.eng = 50;
    s2.math = 50;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = s2.sum / 3f;

    s3.name = "유관순";
    s3.kor = 100;
    s3.eng = 50;
    s3.math = 70;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.aver = s3.sum / 3f;
  }

}