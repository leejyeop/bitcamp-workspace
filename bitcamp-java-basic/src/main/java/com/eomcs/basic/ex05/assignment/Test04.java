package com.eomcs.basic.ex05.assignment;


//# 과제
//- 다음 int 변수에 들어 있는 값을
//각 자릿수의 10 진수 값을 역순으로 출력하라.
//실행 예)
//값: 23459876 천만 1000_0000
//6
//7
//8
//9
//5
//4
//2

public class Test04 {

  public static void main(String[] args) {
    int value = 23459876; //1_0110_0101_1111_1000_0010_0100

//    while (value >0) {
//      System.out.println(value % 10);
//      value = value / 10;
//    }
//
//
//    System.out.println(value % 10);
//    value = value / 10;
//    System.out.println(value % 10);
//    value = value / 10;
//    System.out.println(value % 10);
//    value = value / 10;
//    System.out.println(value % 10);
//    value = value / 10;
//    System.out.println(value % 10);
//    value = value / 10;
//    System.out.println(value % 10);
//    value = value / 10;
//    System.out.println(value % 10);
//    value = value / 10;
//    System.out.println(value % 10);
//    value = value / 10;
//
    //System.out.println(Integer.toBinaryString(value));
    //역순 출력

    int a = 0b0110_0011;
    int b = 0b1010;
    int c = 0b0000_1001;
////////////////////////
    // 0100_0011 102
    // 0000_1010
    //&---------
    // 0000_0010 2
//////////////////////
    // 0101_1110_1100_0011    32451
    // 0000_0000_0000_1010
    //&0000 0000 0000 0010    2
    ///////////////////////////////

    //쉬프트하면 될거같음
    //1001 보다 작으면 조건
    //
//    for (int i = 1; i < 9 ; i++) {
//    int jari[] = new int[9];
//    System.out.println(jari[9-i] = value % 10);
//     value = value / 10;
// }
  // 0000_0001_0110_0101_1111_1000_0010_0100 (23459876)
  // 0000_0000_0000_0000_0000_0000_0001_1111
  //&--------------------------------------------
  // 000000000000000000000000000000000000100
  //
    //
    // 0010_0101
    //|0000_1111
    //
    //
    //
    //
    //
    for (int i = 1; i < 9 ; i++) {
      int jari1[] = new int [9];
      System.out.println(jari1[i] = value & 0b0000_1111); //나머지
      value = value  10;//몫

    }
  }

}
//System.out.println(57 & 0b0000_0001);
// 어떤 값에 대해 2로 나눈 나머지 값을 구하고 싶다면,
// & 연산자를 이용하여 그 값의 하위 1비트 값만 추출하면 된다.
//나누기 연산은 여러번의 계산작업을 수행하게 된다
//그해비해 and 비트연산자즌 한번만 하면된다.
//결론 즉 짝스냐 홀수인지 알아내거나
//2의 나머지를 구하고싶다면 & 비트 연산을 수행하는것이빠르다