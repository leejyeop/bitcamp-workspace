package com.eomcs.corelib.ex02;

public class test15 {
  public static void main(String[] args) {
    Object obj = new String("Hello"); //힙에생성 인스턴스주소가 100이라가정
    String str = ((String) obj).toLowerCase();
    System.out.println(str);


    String x1 = (String) obj;
    str = x1.toLowerCase();
    System.out.println(str);

  }
}
