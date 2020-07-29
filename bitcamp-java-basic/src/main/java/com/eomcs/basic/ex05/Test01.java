package com.eomcs.basic.ex05;

import java.util.Scanner;

//# 과제1 : 다음 int 변수에 들어있는것
//4바이트 정수을 입력받은 후에 다음곽같이 첫바이트부터 끝바이트까지 순서대로 출력하
//실행 예)
//입력? 28_6443_4397 AABBCCDD
//AA
//BB
//CC
//DD
public class Test01 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
  
    System.out.print("입력? ");
    int value = Oxaabbccdd;
    int start = keyScan.nextInt();
    int end = keyScan.nextInt();
    
    int sum = 0;
    for (int no = start; no <= end; no++) {
      sum += no;
    }
    
    System.out.printf("%d에서 %d까지의 합은 %d입니다.\n", start, end, sum);
    
    keyScan.close();
  }

}








