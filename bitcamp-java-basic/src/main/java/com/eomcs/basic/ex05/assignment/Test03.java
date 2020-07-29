package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제2 : 다섯 개의 정수 값을 입력 받고 최소, 최대 값을 구하라.
//실행 예)
//입력? 4 17 -1 6 9
//최소값: -1
//최대값: 17
//
//

public class Test03 {

  public static void main(String[] args) {
    
    int value = 0xaabbccdd;
    System.out.println(Integer.toHexString(value >> 24 & 0xff));
    //11111111_11111111_11111111_10101010
    //00000000_00000000_00000000_11111111
    //------------------------------------
    //00000000_00000000_00000000_10101010
    System.out.println(Integer.toHexString(value >> 16 & 0xff));
    System.out.println(Integer.toHexString(value >> 8 & 0xff));
    System.out.println(Integer.toHexString(value & 0xff));

  }

}
