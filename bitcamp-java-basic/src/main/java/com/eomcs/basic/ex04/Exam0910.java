//형변환 정수 변수 ==>부동소수점 변
package com.eomcs.basic.ex04;

public class Exam0910 {
  public static void main(String[] args) {
    byte b = 100; //1바이
    short s = 100; //2바이
    int i = 100; //4바이
    long l = 100;// 8바이
    float f = 100f; //4바이
    double d =100.0; //8바이트
    boolean bool = true; // 1또는 8인가 4
    char c = 'A'; //2바이트
    float f2;  //4바이트
    //변수의 값을 다룬변수에 저장하는 기본원칙
    //반드시 같은 데이터 타입이어야 한다.
    //같은 데이터 타입이라도 저장하는 값이변수보다 작거나 같아야한
    //
    //정수 ==> 부동소수점 변수
    //정수 변수의 값을 부동소수점 변수에 저장하는것을 허용한다.
    //이를 위해 값을 저장하기 전에 정수 변수에 등러잉ㅆ는 값을
    //부동소수점으로 자동 변환 시킨다.
    //내부적으로 정수는 부동소수점으로 변환된 후 부동소수점 변수에 저장된다.
    f2 = b;
    System.out.println(f2);
    f2 = s;
    System.out.println(f2);
    f2 = i;
    System.out.println(f2);
    f2 = l;
    System.out.println(f2);
    f2 = c;
    System.out.println(f2);
    System.out.println("2------------------------");
    s = 32767;
    f2 = s;
    System.out.println(f2);
    i = 17_3456_1234;
    f2 = i;
    System.out.println(f2);
    l = 200_1234_5678L;//유효자리수를 벗어난 수는 잘린다.
    f2 = l;
    // 부동소수점 ==> 정수 , 변수
    // 부동소수점은 정수 변수에 저장할 수 없다 
    //b = f;
    //s = f;
    //l = f;
    //강제로 부동소수점을 정수 변수에 저장하는 방법
    System.out.println("3----------------");
    f = 112.123f;
    b = (byte)f; //형변환 명령을 사용하여 소수점이하가 잘리지만 저장됨 
    System.out.println(b);
    s = (short)f;
    System.out.println(s);
    i = (int)f;
    System.out.println(i);
    l = (long)f;
    System.out.println(l);
    //이렇게 명령어를 통해 강제로 형변환 시키는 것을 명시적 형변환(explicit type conversion
    //이라부른다    또는 explicit type casting 라고 한다.
    c = (char) f;
    System.out.println(c);
    //단 논리값은 정수나 부동소수점으로 바꿀수 없다.
    //
    //bool = (boolean)s; //다안됨 
    //정수 같은 정수끼리 변환
    //작은 메모리 ==> 큰메모리가능
    //큰메모리 ==>작은 메모리 명시적 형변환 필요
    //형변환 해도 값이 메모리에 저장하지못할만큼 크다면 잘린다
    
    
    
    
    System.out.println("4)--------------------");
    // 같은 정수 변수 끼리 변환
    // 작은 메모리 ==> 큰 메모리 : OK
    // 큰 메모리 ==> 작은 메모리 : 명시적 형변환 필요!
    // - 형변환할 때 값이 메모리에 저장하지 못할만큼 크다면 잘린다.
    //
    b = (byte) s;
    System.out.println(b);

    b = (byte) i;
    System.out.println(b);

    b = (byte) l;
    System.out.println(b);

    l = 130;
    System.out.println(l);
    b = (byte) l;
    System.out.println(b);
    //int 를 float 에 저장할떄 컴파일 오류는 발생하지않는다/
    //다만 실행시에 float 메모리에 저장되는 과정에서
    //유효자리수를 넘어가는 값은 잘린다
//    f = b;
//    System.out.println(f);
//    f = s;
//    System.out.println(f);
//    f = c;
//    System.out.println(f);
//    f = i;
//    System.out.println(f);
//    f = l;
//    System.out.println(f);
//    d = i;
//    System.out.println(d);
//    l = 18_2345_3456_4567_5678l;
//    d = l;
//    System.out.println(d);
  }
}
