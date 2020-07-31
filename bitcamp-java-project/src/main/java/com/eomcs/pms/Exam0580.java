package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class Exam0580 {
  public static void main(String[] args) {
    class History{
      int num;
      String title;
      String content;
      String refernce;
      String author;
      Date day;
    }
    Scanner keyInput =new Scanner(System.in);
    long currentMillis=0;
    final int LENGTH = 5000;
    int count = 0;
//    History history;
//    history = new History();

    History[] historys = new History[LENGTH];

    for (int i = 0; i < LENGTH; i++) {
      count++;
      History his = new History();
      System.out.print("제목을적으시오");
      his.title = keyInput.nextLine();
      System.out.print("내용을 적으시오");
      his.content = keyInput.nextLine();
      System.out.println("번호 를 적으시오");
      his.num = keyInput.nextInt();
      keyInput.nextLine();
      System.out.println("작성자를 적으시오");
      his.author = keyInput.nextLine();
      System.out.println("참조 를 적으시오");
      his.refernce = keyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      his.day = new Date(currentMillis);
      historys[i] = his;
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    for (int i = 0; i < count; i++) {
    History his = historys[i];
    System.out.printf("%s %s %s %s %s %d\n "
        ,his.author ,his.content ,his.refernce ,his.title ,his.day ,his.num);
    }
  }
}
