package com.eomcs.basic.oop.ex05.a;

public class Car {
  public String model;
  public String maker;
  public int capacity;

  public Car() {}

  //오버로드:새로운 방법을 추가하는거
  public Car(String model, String maker, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }
}


