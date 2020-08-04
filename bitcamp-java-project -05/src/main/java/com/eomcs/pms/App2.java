package com.eomcs.pms;

import java.util.Date;

public class App2 {

  public static void main(String[] args) {
    int count = 0;
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    //여러개의 프로젝트 정보를 입력받기위해 변수 준비
    final int LENGTH = 10;
    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];

    System.out.print("[프로젝트]");
    for (int i = 0; i < LENGTH; i++) {
      count++;
      System.out.print("번호: ");
      //System.out.println(1201);
      no[i] = keyInput.nextInt();
      keyInput.nextLine(); //앤터읽음

      System.out.print("프로젝트명: ");

      title[i] = keyInput.nextLine();
      System.out.print("내용: ");

      content[i] = keyInput.nextLine();

      System.out.print("시작일: ");
      startDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
      System.out.print("종료일: ");
      endDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
      //String eDate = keyInput.nextLine();
      System.out.println("만든이: ");
      owner[i] = keyInput.nextLine();
      System.out.println("팀원: ");
      members[i] = keyInput.nextLine();
      System.out.println("계속입력하시겠습니까?(y/N");
      String response = keyInput.nextLine();

      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
    }
    keyInput.close();

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s ,%s, %s ,%s\n", no[i] ,title[i] ,content[i] ,startDate[i] ,endDate[i] ,owner[i]);
    }
  }
}
