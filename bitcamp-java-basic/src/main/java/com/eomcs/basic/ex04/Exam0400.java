//변수의 종
package com.eomcs.basic.ex04;

public class Exam0400 {
  public static void main(String[] args) {
    //정수
    byte b;  //1
    short s; //2 
    int i;  //4
    long l; //8
   
    //부동소수점
    float f; //4
    double d; //8
    
    //문자
    char c; //2
    
    //논리
    boolean bool; //1 or 4
    
    //래퍼런스 
    String str; 
    
    //변수의 메모리 크기
    b = -128;
    b = 127; 
    
    //정수 리터럴은 기본이 4바이트
    //작은 메모리에 저장할 수 없지만 오른쪽의 값이 4바이트 정수 리터럴일 경우
    //메모리에 그 리터럴을 저장할수있다면 허락한다 8바이트는 안댐
    //4바이트 리터럴 끼리의 연산 결과는 리터럴로 취급한
    //1000 0001 (129) 2의 보수로 표현이 안 됨
    //
    //0000 0000 0000 0000 0000 0000 1000 0001 (32비트)
    //1111 1111 1111 1111 1111 1111 0111 1111 (2의보수) 32비트로바
    //b = -129; //메모리 크기가 안댐 
    //b = 128;
    
    byte b2 = 20;
    //b = 100 + b2;   리터럴과 변수는 변수로 취급한다 4바이트 
    i = 100+ b2;
    
    s = -32768;
    s = 32767;
    //s = -32769;
    //s = 32768;
    
    i = -21_0000_0000;
    i = 21_0000_0000;
    //i = -22_0000_0000;
    // i = 22_0000_0000;
    
    l = -922_0000_0000_0000_0000L;//리터럴은 4바이트라서 8바이트로 저장하는 l을 붙여야한다
    l = +922_0000_0000_0000_0000L;
    
    b = 100;  //1
    s = 100;  //2
    i = 100;  //4
    
    //b = 100L; //1
    //s = 100L; //2
    //i = 100L; //4
    byte b3;
    //b3 = b;
    //b3 = s;
    //b3 = l;
    short s2;
    s2 = b;
    s2 = s;
    //s2 = i;
    //s2 = l;
    
    int i2;
    i2 = b;
    i2 = s;
    i2 = i;
    //i2 = l;
    
    long l2;
    l2 = b;
    l2 = s;
    l2 = i;
    l2 = l;
    
    s = -32768;
    s = 32767;
    char c2;         //char 은 음수를 저장할수 없다 0~ 65535가범
    //c2 = -32768; 
    
    //c2 = s;
    //s = c2;
    
    f = 999.9999f;
    f = 9.999999f;
    f= 999999.9f;
    //부동소수점은 7자리까지의 숫자만 유효하다 그이상의 자릿수인경우 
    //값이 잘린다 또는 반올림처리된다 
    //유효 자릿를 넘어간다 오류가 발생하지는 않고 값이 잘리거나 반올림됨
    
    f = 999.99993f;
    System.out.println(f);
    
    float f1 = 1.234567f;
    float f2 = 92345.22f;
    float f3 = f1 + f2;
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3); //float 의 연산결과는 float 따라서 합친건 짤린거
    double d3;
    d = 1234567890.1234567;
    d3 = 7999999299.9999987;
    System.out.println(d);
    System.out.println(d3);
    
    f = 234.9999f;
    //f = 2345678912.123456;
    f = 2345678912.123456f; 
    //8바이트값을 4바이트로 만든다 4바이트를 넘어가는 값은 자른다
    //ㄷ따라서 f에들어가는 값은 이미 잘린값이다.
    //i = 21_0000_0000;
    //i = 22_0000_0000L;
    System.out.println(f);
    d =234.5678;
    System.out.println(d);
    d =234.5678f; //8바이트 
    System.out.println(d);
    //그냥 double슨다
    //정수는 쓰까도대는데 부동소수점은하나만쓰자
    
    // 두 부동소수점을연산한 결과가 7자리를 넘어갈거 같으면
    //처음부터 더블을 사용해
    double t1 = 1.234567;
    double t2 = 92345.22;
    double t3 = t1 + t2;
    System.out.println("==>");
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
  }
}
