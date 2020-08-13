package com.eomcs.basic.oop.ex05.d;
//상속은 기존코드를 복사하는것이아님 그냥 쓰겟다고 선언하는거
//sub class ,child class 상속하는 클래스
//super class, parent class상속 당하는 클래스
public class Sedan extends Car {
  boolean sunroof;
  boolean auto;

  public Sedan(String model, String maker, int capacity,
      boolean sunroof, boolean auto) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
    this.sunroof = sunroof;
    this.auto = auto;
  }
}
