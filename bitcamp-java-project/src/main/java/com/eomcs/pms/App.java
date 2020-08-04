
package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App {

  static Scanner keyInput = new Scanner(System.in);

  //회원
  static final int LENGTH = 5;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tell = new String[LENGTH];
  static Date[] now = new Date[LENGTH];
  static int count = 0;//count + =1; count ++;

  //프로젝트
  static final int PLENGTH = 10;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];
  static int pcount = 0;


  //작업
  static final int WLENGTH = 10;
  static String[] wtitle = new String[WLENGTH];
  static int[] wno = new int[WLENGTH];
  static String[] wcontent = new String[WLENGTH];
  static Date[] wendDate = new Date[WLENGTH];
  static int[] wstat = new int[WLENGTH];
  static String[] wown = new String[WLENGTH];
  static String[] wstr = new String[WLENGTH];
  static int wcount = 0;

  public static void main(String[] args) {

    loop:
      while (true) {
        String command = promptString("명령> ");//사용자

        switch (command.toLowerCase()) {
          case "/member/add":
            addMember();
            break;

          case "/member/list":
            listMember();
            break;

          case "/project/add":
            addProject();
            break;

          case "/project/list":
            listProject();
            break;

          case "/task/add":
            addTask();
            break;

          case "/task/list":
            listTask();
            break;

          case "exit":
          case "quit":
            System.out.println("안녕");
            break loop;

          default:
            System.out.println("실행할 수 없는 명령입니다.");

        }
      }
  System.out.println();
  keyInput.close();

  System.out.println("종료!");




  }

  static void addMember() {
    System.out.println("회원 등록");


    //String input = prompt("번호? ");
    no[count]= promptInt("번호? ");//no[count]= Integer.parseInt(input);
    name[count] = promptString("이름? ");
    email[count] = promptString("이메일? ");
    password[count] = promptString("비밀번호? ");
    photo[count] = promptString("사진? ");
    tell[count] = promptString("전화? ");


    //currentMillis = System.currentTimeMillis(); //(8바이트)
    now[count] = new Date(System.currentTimeMillis());

    count++;

  }
  static void listMember() {
    System.out.println("회원 목록");
    for (int i = 0; i< count; i++) {
      System.out.printf("%d, %s, %s ,%s ,%s\n", no[i], name[i],email[i],tell[i],now[i].toString());
    }
  }
  static void addProject() {
    System.out.println("[프로젝트 등록]");

    pno[pcount] = promptInt("번호? ");
    ptitle[pcount] = promptString("프로젝트명? ");
    pcontent[pcount] = promptString("내용? ");
    pstartDate[pcount] = promptDate("시작일? ");
    pendDate[pcount] = promptDate("종료일? ");
    powner[pcount] = promptString("작성자? ");
    pmembers[pcount] = promptString("맴버? ");
    pcount++;
  }
  static void listProject() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s ,%s, %s ,%s\n", pno[i] ,ptitle[i] ,pcontent[i] ,pstartDate[i] ,pendDate[i] ,powner[i]);
    }
  }
  static void addTask() {
    System.out.println("작업 목록");

    wtitle[wcount] = promptString("제목? ");
    wno[wcount] = promptInt("번호 ?");
    wcontent[wcount] = promptString("내용? ");
    wendDate[wcount] = promptDate("마감일? ");
    //System.out.println("\n0: 신규\n1: 진행중\n2: 완료");
    wstat[wcount] = promptInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    wown[wcount] = promptString("담당자? ");
    wcount++;


  }
  static void listTask() {
    System.out.println("작업 목록");
    for (int i = 0; i < wcount; i++) {
      System.out.printf("%s, %d, %s, %s, %s ,%s"
          ,wtitle[i], wno[i], wcontent[i], wendDate[i], wstat[i],wown[i]);
      System.out.println();

    }
  }
  static String promptString(String title) {
    System.out.print(title);
    return keyInput.nextLine();
  }

  static int promptInt(String title) {
    System.out.print(title);
    return Integer.parseInt(keyInput.nextLine());
  }

  static Date promptDate(String title) {
    System.out.print(title);
    return Date.valueOf(keyInput.nextLine());
  }
}
