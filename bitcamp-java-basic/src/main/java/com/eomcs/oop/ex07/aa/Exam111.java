package com.eomcs.oop.ex07.aa;


class Score2 {
  String name;
  int kor;
  int eng;
  int math;

  private int sum;
  private float aver;

  public int getSum() {
    return this.sum;
  }
  public float getAver() {
    return this.aver;
  }
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam111 {
  public static void main(String[] args) {
    Score2 s1 = new Score2();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    s1.compute();

    // 계산을 한 후에 임의적으로 합계나 평균을 변경한다면?
    // => sum과 aver 필드는 private 접근만 허용한다.
    // => 즉 클래스의 멤버만 접근할 수 있고 클래스 외부에서는 접근할 수 없다.
    // => 그래서 다음과 같이 임의로 접근하여 값을 변경할 수 없다.
    //
    //s1.sum = 300; // 컴파일 오류!
    //s1.aver = 100f; // 컴파일 오류!

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.getSum(), s1.getAver());
  }

}



