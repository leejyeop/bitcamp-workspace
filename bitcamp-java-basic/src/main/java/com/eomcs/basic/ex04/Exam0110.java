//변수 선언:데이터를 저장할 메모리를 확보하는 명령
package com.eomcs.basic.ex04;



public class Exam0110 {

  public static void main(String[] args) {
    int i;
    int i2;
    int i3;
    int x,x1,x2,x3,y,z;
    int 가 ;
    
    //primitive data type
    // int = 메모리 종류(Data Type:         i = 확보한 메모리 이름(변수:variable)
    //byte(1바이트) short(2바이트) int(4바이트) long(8바이트) 부동소수점 float(4바이트) double(8바이트)16자
    //문자:char (2바이트)  논리값:boolean(4바이트(변수하나) Or 1바이트(배열일));
    //할당연산자 = assignment operator 배정연산자 
    //연산자를 기준으로 왼쪽l-value 값이올수없다;          오른쪽 r-value이다 값 메모리 표현식(expression)
    //표현식 :결과를 리턴하는 문장  ex)a+b a>b plus(10,20) 조건문 반복문 변수선언 등클래스선언 메소드선언 문장(statement)
   // 2) reference(레퍼런스)
//  데이터가 저장된 메모리의 주소를 저장하는 메모리.
//- 문자열(주소)
// - String : 문자열이 저장된 메모리의 주소를 저장한다.
//            프로그래밍 입문 단계에서는 그냥 문자열을 저장하는 메모리로 생각하라!
//- 날짜(주소)
// - Date : 날짜 값이 저장된 메모리의 주소를 저장한다.
//          프로그래밍 입문 단계에서는 그냥 날짜를 저장하는 메모리로 생각하라!
//- 레퍼런스에 대한 자세한 사항은 추후에 자세히 설명할 것이다.
    byte f;
    f= -128;
    i = 100;
    i2 = 223;
    x = i;
    y = i * x;
    가 = y;
    
    byte b1 = 10; // 00001010
    byte b2 = 12; // 00001100
    b1 = b2;
    
    i = b1; // 00000000_00000000_00000000_00001010
    //b2 = i; error
    b2 = (byte)i;
    
    int a = 320, b = 233, cc ,d;
    
    
    
    
  }
}
