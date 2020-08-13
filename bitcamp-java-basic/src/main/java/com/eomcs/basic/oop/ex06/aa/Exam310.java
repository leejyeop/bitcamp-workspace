package com.eomcs.basic.oop.ex06.aa;

public class Exam310 {
  public static void printSedan(Sedan sedan) {
    System.out.printf("모델명: %s\n", sedan.model);
    System.out.printf("cc: %d\n", sedan.cc);
    System.out.printf("sunroof: %b\n",sedan.sunroof);
    System.out.println("-------------------------");
  }

  public static void printCar(Car car) {
    System.out.printf("모델명: %s\n", car.model);
    System.out.printf("cc: %d\n", car.cc);
    System.out.println("-------------------------");
  }

  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    Sedan c = car1;
    c.model = "티코";
    c.cc = 800;
    c.sunroof = true;


    Truck car2 = new Truck();
    car2.model = "타이탄II";
    car2.cc = 10000;

    // 또다른 해결책?
    // Sedan과 Truck을 모두 처리하는 메서드를 만들어 사용하라!
    printCar(car1); // OK! 왜? Sedan은 Car의 일종이다.
    printCar(car2); // OK! 왜? Truck도 Car의 서브클래스이다.

  }
}
