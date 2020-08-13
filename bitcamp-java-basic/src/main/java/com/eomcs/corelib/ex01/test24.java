package com.eomcs.corelib.ex01;

public class test24 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score() {}
    public Score(String name, int kor ,int eng ,int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum /3f;
    }
    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
          + sum + ", aver=" + aver + "]";    }
  }
  public static void main(String[] args) {

    Score s1 = new Score("홍길동", 100, 100, 100);
    System.out.println(s1);

    // 인스턴스 복제
    // 방법1:
    // => 직접 복제한다. 즉 새 객체를 만들어 기존 객체의 값을 저장한다.
    Score s2 = new Score(s1.name, s1.kor, s1.eng, s1.math); // 빈 객체 생성

    // s1과 s2는 서로 다른 인스턴스이다.
    System.out.println(s1 == s2);

    // s1과 s2에 들어 있는 값은 같다.
    System.out.println(s1);
    System.out.println(s2);
  }
}