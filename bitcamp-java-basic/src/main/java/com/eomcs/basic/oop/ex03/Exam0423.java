package com.eomcs.basic.oop.ex03;

public class Exam0423 {

  static class SmartPhone {

    int volume;
    int bright;
    int contrast;

    // 파라미터가 다른 생성자를 여러 개 정의할 수 있다.
    public SmartPhone() {
      this(50,50,50);
      System.out.println("SmartPhone() 생성자 호출됨!");
    }

    public SmartPhone(int volume) {
      this.volume = volume;
      System.out.println("SmartPhone(int) 생성자 호출됨!");
    }

    public SmartPhone(int volume, int bright, int contrast) {
      this.bright = bright;
      this.contrast = contrast;
      this.volume = volume;
      System.out.println("SmartPhone(int, int, int) 생성자 호출됨!");
    }

    public SmartPhone(int volume,int bright) {
      this.volume = volume;
      this.bright = bright;
      System.out.println("SmartPhone(int, String) 생성자 호출됨!");
    }
    void m1() {
      //일반 메소드에서 생성자를 임의로 호출 할 수없다
      this();
    }
  }

  public static void main(String[] args) {
    // 인스턴스를 생성할 때 생성자에 던지는 값에 따라
    // 자동으로 호출될 생성자가 결정된다.
    SmartPhone obj1 = new SmartPhone();
    //new SmartPhone();
    //래퍼런스로 생성자를 임의로 호출 할 수없다.
    //생성자 호출은 뉴명령을 실행할 때만 오직 실행할 수있다.
    obj1.SmartPhone();


  }
}
