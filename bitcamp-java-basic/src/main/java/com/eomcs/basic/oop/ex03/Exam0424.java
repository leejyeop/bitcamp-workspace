package com.eomcs.basic.oop.ex03;

class SmartPhone {

  int volume;
  int bright;
  int contrast;

  // 파라미터가 다른 생성자를 여러 개 정의할 수 있다.
  private SmartPhone() {
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
    //this();
  }
}
public class Exam0424 {


  public static void main(String[] args) {
    // private로 접근을 막으면 생성자를 지정할 수없다.
    SmartPhone obj1 = new SmartPhone();
    SmartPhone obj2 = new SmartPhone(50);

  }
}
