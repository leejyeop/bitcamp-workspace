package com.eomcs.basic.ex07;

public class Exam0414 {
  static class Score {
    //클래스를만들면
    //name,kor,eng,math,sum,aver
    //[]   []  []  []   []  []
    //각각메모리에 (주소)이름을 붙일수있다.
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) throws Exception {
    Score s = new Score();

  }
  //  Score 설계도에 따라 Heap에 생성한 메모리의 주소를 리턴
  //Score  class에 따라 Heap에 생성한 인스턴스 주소를 리턴
  //Score 클래스의 인스턴스를 생성한 후 그 주소를 리턴
  //Score 클래스의 인스턴스를 리턴
  //Score 인스턴스를 리턴
  //Score 객체를 리턴
  static Score creatObject() {
    Score s = new Score();
    return s;//return은 Score 설계도에 따라 Heap에
    //생성한 메모리의 주소를 리턴

  }

}


