package com.eomcs.pms;

import java.util.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    final int LENGTH = 10;
    String[] title = new String[LENGTH];
    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] stat = new String[LENGTH];
    String[] own = new String[LENGTH];
    String[] str = new String[LENGTH];
    int count = 0;

    for (int i = 0; i < LENGTH; i++) {
      count++;
      System.out.printf("[작업]");
      System.out.print("\n프로젝트? ");
      title[i] = keyInput.nextLine();
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
//      str[i] = keyInput.nextLine();
//      no[i] = Integer.parseInt(str[i]);
      //nextInt 는 입력값중에서 숫자만 읽는다
      //Int 를 호출하면 숫자 뒤에 문자를 남긴다
      keyInput.nextLine(); //숫자 뒤에 남아있는 CR/LF 값을 읽어서 제거한다.

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();
      System.out.print("완료일? ");
      //String eDate = keyInput.nextLine();
       endDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
      System.out.print("상태? ");
      System.out.println("\n0: 신규\n1: 진행중\n2: 완료");
      stat[i] = keyInput.nextLine();
      switch (stat[i]) {
        case "0":
          stat[i] = "신규";
          break;
        case "1":
          stat[i] = "진행중";
        break;
        case "2":
          stat[i] = "완료";
        break;
        default :
        System.out.println("모름");
      }
      System.out.print("담당자? 홍길동");
      own[i] = keyInput.nextLine();
      System.out.println("------------------------");
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyInput.close();

    for (int i = 0; i < count; i++) {
      System.out.printf("%s, %d, %s, %s, %s ,%s"
   ,title[i], no[i], content[i], endDate[i], stat[i],own[i]);
      System.out.println();
    }
//
//    System.out.printf("\n프로젝트: %s\n", name);
//    System.out.printf("번호: %d\n", no);
//    System.out.printf("내용: %s\n", contents);
//    System.out.printf("완료일: %s\n", completedDate.toString());
//
//


//
//
//    System.out.printf("상태: %s\n", stat);
    //스트링변수에 들어있는
    //문자열을 비교할떄는 변수.equals(문자열)을 넣음


//    System.out.print("상태: ");
//    if (stat.equals("0")) {
//     System.out.println("신규");
//   } else if (stat.equals("1")) {
//     System.out.println("진행중");
//   } else {
//     System.out.println("완료");
//   }
//    System.out.printf("담당자: %s\n", own);
//    keyInput.close();


  }
}
