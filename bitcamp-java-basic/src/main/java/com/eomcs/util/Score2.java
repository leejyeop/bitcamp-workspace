package com.eomcs.util;

public class Score2 {

  public String name;//설계도
  public int kor;//설계도
  public int math;//설계도
  public int eng;//설계도
  public int sum ;//설계도
  public float aver;//설계도

  public void compute() {//non static은값을 줘야한다 s1,s2
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
  public void init(String name,int kor,int eng,int math) {
    this.name = name;
    this.kor = kor;
    this.math = math;
    this.eng = eng;

  }
}