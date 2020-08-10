package com.eomcs.basic.oop.ex03;

public class Exam0421 {

  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    public SmartPhone() {
      this.(50,50,50);//다른생성자를 호출할 때는 반드시 첫문장이어야한다.
      System.out.println();

    }
    public SmartPhone(int valume) {
      //음악을 출력한다.
      System.out.println("SmartPhone(int)");
      this.volume = valume;
      this.bright = 50;
      this.contrast = 50;
    }
    public SmartPhone(String b) {
      System.out.println("SmartPhone(String)");
    }
    public SmartPhone(int valume,int bright,int contrast) {
      this.volume = valume;
      this.bright = bright;
      this.contrast = contrast;
      System.out.println("SmartPhone(String,int)");
    }
    public SmartPhone(int a , String str) {
      System.out.println("SmartPhone(int,String)");
    }

  }
  public static void main(String[] args) {
    //인스턴스를 생성할 떄 생성자에 던지는 값에 따라
    //자동으로 호출되ㅣㄹ 생성자가 결정된다
    new SmartPhone(100);
    new SmartPhone("dsf");
    new SmartPhone(100,70,70);
    SmartPhone obj2 = new SmartPhone();

  }
}
