package com.eomcs.basic.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0210 {
  public static void main(String[] args)throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("ABC가각");
    //인스턴스 매소드
    //인스턴스 주소를 가지고 호출해야한다.
    //-스태틱이안붙은 non static
    //-this라는 내장변수가있다
    //특정인스턴스의 변수를 다루는 매소드


    //1번 인덱스의 문자 코드를 리턴
    char c1 = s1.charAt(1);
    System.out.println(c1);

    char c2 = s2.charAt(1);
    System.out.println(c2);

    System.out.println(s1.compareTo(s2));
    System.out.println(s1.contains("ell"));
    System.out.println(s2.contains("AB"));
    System.out.println(s1.equals(s2));
    System.out.println("-----------------------");
    System.out.println(s1.getBytes());

    byte[] bytes = s2.getBytes();//UTF -16으로저장한다 ==>OS의기본 문자표(리눅스,유닉스UTF-8)(윈도우MS95=949)
    //로 바꾼다
    //Linux,Unix: 41,42,43,ea,b0,80,ea,b0,81
    //윈도우 : 41, 42, 43 b0a1, b0a2
    //한글일때 문제
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff));
    }

    System.out.println("-----------------------");
    bytes = s2.getBytes("ms949");
    //UTF -16으로저장한다 ==>OS의기본 문자표(리눅스,유닉스UTF-8)(윈도우MS95=949)
    //로 바꾼다
    //Linux,Unix: 41,42,43,ea,b0,80,ea,b0,81
    //윈도우 : 41, 42, 43 b0a1, b0a2
    //한글일때 문제
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff));
    }
    System.out.println("-----------------------");
    String s3 = String.format("%s님 방가방가!", "홍길동");
    System.out.println(s3);
    String s4 = String.join(",","홍길동", "임꺽정","유관순");
    System.out.println(s4);

    String s5 = String.valueOf(true);
    String s6 = String.valueOf(100);
    String s7 = String.valueOf(3.14f);
    System.out.printf("%s %s %s\n", s5, s6 ,s7);
    System.out.println(Math.abs(-100));
    System.out.println("-----------------------");
    System.out.println(Math.ceil(3.28));
    System.out.println(Math.floor(3.28));
    System.out.println(Math.ceil(-3.28));
    System.out.println(Math.floor(-3.28));
    System.out.println("-----------------------");
    System.out.println(Math.pow(2,7));
    System.out.println(Math.round(3.14));
    System.out.println(Math.round(3.54));
    System.out.println("-----------------------");
    Date d1 = new Date();
    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDay()); //월요일은 1
    long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
    System.out.println(millis);
    System.out.println("-----------------------");
    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDay());

    long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDate());


    System.out.println("-----------------------");

    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(1)); //year
    System.out.println(cal.get(2) + 1);//month
    System.out.println(cal.get(5));//day
    System.out.println(cal.get(7));//요일 일요일 1 월요일 2
    System.out.println(cal.get(4)); //해당월의 몇번째 주인지알아내는것
    System.out.println(cal.get(10));//12 hour
    System.out.println(cal.get(11));//24 hour
    System.out.println(cal.get(12));//분
    System.out.println(cal.get(13));//초
    System.out.println("-----------------------");
    System.out.println(cal.get(Calendar.YEAR)); //year
    System.out.println(cal.get(Calendar.MONTH) + 1);//month
    System.out.println(cal.get(Calendar.DATE));//day
    System.out.println(cal.get(Calendar.DAY_OF_WEEK));//요일 일요일 1 월요일 2
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); //해당월의 몇번째 주인지알아내는것
    System.out.println(cal.get(Calendar.HOUR));//12 hour
    System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24 hour
    System.out.println(cal.get(Calendar.MINUTE));//분
    System.out.println(cal.get(Calendar.SECOND));//초


    //int => Integer ,byte => Byte , short => Short ,
    //long =. Long , float => Float , double => Double, char => Character
    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i1 == i2);

    Integer i3 = Integer.valueOf(100);
    Integer i4 = Integer.valueOf(100);

    System.out.println(i3.toString());
    System.out.println(i4.toString());
    System.out.println(i3 == i4);
  }
}
