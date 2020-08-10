package com.eomcs.util;

public class Calculater {

  public int result = 0; //여러개를 개별적으로 관리하고싶으면 static 을 뺌

  public void plus(int value) {
    this.result += value;
  }
  public void minus(int value) {
    this.result -= value;
  }
  public void divide(int value) {
    this.result /= value;
  }
  public void multiple(int value) {
    this.result *= value;
  }
}
