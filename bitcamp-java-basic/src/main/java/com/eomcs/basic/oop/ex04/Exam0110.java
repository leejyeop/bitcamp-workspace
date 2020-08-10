package com.eomcs.basic.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0110 {
  public static void main (String[] args)throws Exception {
    String s1 = new String(); //주소를 담는 래퍼런스 8개의 변수를제외한나머지는//래퍼런스
    //로컬변수는 항상 주소를 담아야한다
    //String s1 = null : 문자열이없다
    System.out.println("=>" + s1);
    String s2 = new String("Hello");
    System.out.println("=>" + s2);

    char[] chars = new char[] {'H','e','l','l','o','3','!'};
    String s3 = new String(chars);
    System.out.println("=>" + s3);
    // -128[80] ~ 127[7F]


    byte[] bytes = new byte[] {
        0x41,  // 0041  a
        0x42,  // 0042  b
        (byte)0xEA,//가) 128 ~ 127     // 237
        (byte)0xB0,
        (byte)0x80,
        (byte)0xEA, //각) AC01
        (byte)0xB0,
        (byte)0x81
    };
    String s4 = new String(bytes, "UTF-8");
    System.out.println("=>" + s4);

    byte[] bytes2 = new byte[] {
        0x41,  // 0041  a
        0x42,  // 0042  b
        (byte)0xB0,//가) 128 ~ 127     // 237
        (byte)0xA1,
        (byte)0xB0,//각) AC01
        (byte)0xA2,
        (byte)0xB6,//똘 EUC-KR
        (byte)0xCA,
        (byte)0x8C,//똠 MS949 /CP949
        (byte)0x63,
        (byte)0xB6,//똥 EUC -KR
        (byte)0xCB
    };
    String s5 = new String(bytes2, "MS949"); //MS949(11112자) = EUC-KR(2350자)
    System.out.println("=>" + s5);

    Date d1 = new Date();//실행시점의 날짜와 시분초로 초기화시킴
    //시분초값을 현재인스턴스값을생성하는 시점으로 값을 초기화시킴
    System.out.println(d1.toString());
    System.out.println(d1);//만약 아규먼트가 String타입이나 primitive타입이 아니라면
    //인스턴스에 대해 toString()을 호출하여 그리턴값을 출력한다

    int[] arry = new int[] {100,200,300};
    System.out.println(arry.toString());
    System.out.println(arry);

    int a = 100;
    System.out.println(a);

    Date d2 = new Date(100000);
    System.out.println(d2);

    Date d3 = new Date(120, 8 ,10);
    System.out.println(d3);

    //클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
    //이런 글래스의 인스턴스를 만들려면
    //보통 다음 2가지방법을 사용한다.
    //1번째 다른클래스의 도움을 받는다
    //2번째 해당 클래스에서 제공하는 클래스 매서드,스태틱 메서드를 사용한다,.
    //Calendar c1 = new Calendar();
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1);

    //    Car car1 = new Car();
    //    Car car2 = new Car();
    //    System.out.println(car1 == car2);
    //    car1.cc = 900;
    //    car1.model = "티코";
    //    car2.cc = 1900;
    //    car2.model = "소나타";
    //    System.out.println(car1.model);
    //    System.out.println(car2.model);
    //
    //Car2 car3 = new Car2();
    Car2 car3 = Car2.getInstance();
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4);
  }
  class Car {
    String model;
    int cc;
  }

  static class Car2 {
    String model;
    int cc;
    static Car2 obj;

    private Car2() {}

    static Car2 getInstance() {
      //보통 생성자를 private으로 막는경우는
      //인스턴스를 한개만 생성하도록 제한하고 싶을때 주로 사용한다
      if (obj == null) {
        obj = new Car2();
      }
      return new Car2();
    }
  }
}

