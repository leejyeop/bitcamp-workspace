package com.eomcs.basic.oop.ex03;

public class Exam0410 {

  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    //생성자가 한개라도 있으면 기본 생성자가 자동으로 생성되지 않는
    public SmartPhone(int a) {
      //음악을 출력한다.
      System.out.println("SmartPhone()");
    }

  }
  public static void main(String[] args) {
    //SmartPhone obj2 = new SmartPhone();
    SmartPhone obj2 = new SmartPhone(10);
    //SmartPhone obj3 = new SmartPhone(3.14);
  }
}
