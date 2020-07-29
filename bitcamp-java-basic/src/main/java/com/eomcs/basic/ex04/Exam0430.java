package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    char c;
    
    c = 0;
    c = 65535;
    //c = -1;
    //c = 66536;
    c = 65;
    System.out.println(c);
    c = 0x42;
    System.out.println(c);
    c = 0b0100_0010;
    System.out.println(c);
    
    System.out.println((char)65);
    
    short s = 65;
    System.out.println(s);
    int  i;
    c = '헐'; //'' 연산자는 문자의 유니코드 값을 리턴한다. 16비트문자코드를 저장한
    System.out.println(c);
    i = '뜕';
    System.out.println(i);
    //문자 코드는 정수 값이다.
    for (int x = 65 ; x <80; x ++) {
      System.out.println((char)x);
    }
    
    boolean b1,b2;
    b1 = true;
    b2 = false;
    System.out.println(b1);
    System.out.println(b2);
    //i = b1 논리값은 정수로 바꿀수 없다
    //b1 = 1;
    
    
    
    }
}
