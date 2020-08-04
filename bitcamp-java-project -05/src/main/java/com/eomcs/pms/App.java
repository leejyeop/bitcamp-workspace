
package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class App {
// 1)명령어 입력을 요구하는 프롬프트를 출력한다.
// 2)명령어를 입력받아 출력한다.
  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);


    //회원
    final int LENGTH = 5;
    int[] no = new int[LENGTH];



    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tell = new String[LENGTH];
    Date[] now = new Date[LENGTH];
    java.sql.Date now1=null,now2=null,now3=null,now4=null,now5=null;
    long currentMillis=0;
    int count = 0;//count + =1; count ++;


    //프로젝트
    final int PLENGTH = 10;
    int[] pno = new int[PLENGTH];
    String[] ptitle = new String[PLENGTH];
    String[] pcontent = new String[PLENGTH];
    Date[] pstartDate = new Date[PLENGTH];
    Date[] pendDate = new Date[PLENGTH];
    String[] powner = new String[PLENGTH];
    String[] pmembers = new String[PLENGTH];
    int pcount = 0;


    //작업
    final int WLENGTH = 10;
    String[] wtitle = new String[WLENGTH];
    int[] wno = new int[WLENGTH];
    String[] wcontent = new String[WLENGTH];
    Date[] wendDate = new Date[WLENGTH];
    String[] wstat = new String[WLENGTH];
    String[] wown = new String[WLENGTH];
    String[] wstr = new String[WLENGTH];
    int wcount = 0;

    loop:
      while (true) {
      System.out.print("명령>");
      String command = keyInput.nextLine();

      switch (command.toLowerCase()) {
        case "/member/add":
          System.out.println("회원 등록");
          for (int i = 0; i < LENGTH; i++) {

            System.out.print("번호? ");
            no[count]= keyInput.nextInt();
            keyInput.nextLine();
            System.out.print("이름? ");
            name[count] = keyInput.nextLine();
            System.out.print("이메일? ");
            email[count] = keyInput.nextLine();

            System.out.print("암호?");
            password[count] = keyInput.nextLine();

            System.out.print("사진?");
            photo[count] = keyInput.nextLine();

            System.out.print("전화?");
            tell[count] = keyInput.nextLine();

            currentMillis = System.currentTimeMillis(); //(8바이트)
            //1970년 1-1일 00:00:00에서 경과된 밀리초
            now[count] = new Date(currentMillis);

            count++;
            break;
//            System.out.println("계속 입력하시겠습니까? (y/N)");
//            String response =keyInput.nextLine();
//
//            if (!response.equalsIgnoreCase("y")) {
//              break;
//            }
//            //if (!response.equals("y")|| response.equals("Y"))
//
//
          }
          //

        case "/member/list":
          System.out.println("회원 목록");

          for (int i = 0; i< count; i++) {
            System.out.printf("%d, %s, %s ,%s ,%s\n", no[i], name[i],email[i],tell[i],now[i].toString());
          }

          break;
        case "/project/add":
          System.out.println("[프로젝트 등록]");


              System.out.print("번호: ");
              //System.out.println(1201);
              pno[pcount] = keyInput.nextInt();
              keyInput.nextLine(); //앤터읽음

              System.out.print("프로젝트명: ");

              ptitle[pcount] = keyInput.nextLine();
              System.out.print("내용: ");

              pcontent[pcount] = keyInput.nextLine();

              System.out.print("시작일: ");
              pstartDate[pcount] = java.sql.Date.valueOf(keyInput.nextLine());
              System.out.print("종료일: ");
              pendDate[pcount] = java.sql.Date.valueOf(keyInput.nextLine());
              //String eDate = keyInput.nextLine();
              System.out.print("만든이: ");
              powner[pcount] = keyInput.nextLine();
              System.out.print("팀원: ");
              pmembers[pcount] = keyInput.nextLine();

              pcount++;
              break;
        case "/project/list":
          System.out.println("[프로젝트 목록]");

          for (int i = 0; i < pcount; i++) {
            System.out.printf("%d, %s ,%s, %s ,%s\n", pno[i] ,ptitle[i] ,pcontent[i] ,pstartDate[i] ,pendDate[i] ,powner[i]);
          }
          break;

        case "/task/add":
          System.out.println("작업 목록");

          for (int i = 0; i < WLENGTH; i++) {

            System.out.printf("[작업]");
            System.out.print("\n프로젝트? ");
            wtitle[wcount] = keyInput.nextLine();
            System.out.print("번호? ");
            wno[wcount] = keyInput.nextInt();
            keyInput.nextLine();
            System.out.print("내용? ");
            wcontent[wcount] = keyInput.nextLine();
            System.out.print("완료일? ");
             wendDate[wcount] = java.sql.Date.valueOf(keyInput.nextLine());
            System.out.print("상태? ");
            System.out.println("\n0: 신규\n1: 진행중\n2: 완료");
            wstat[wcount] = keyInput.nextLine();
            switch (wstat[wcount]) {
              case "0":
                wstat[wcount] = "신규";
                break;
              case "1":
                wstat[wcount] = "진행중";
                break;
              case "2":
                wstat[wcount] = "완료";
                break;
              default :
                wstat[wcount] = "모름";
            }
            System.out.print("담당자?");
            wown[wcount] = keyInput.nextLine();
            wcount++;
            break;
          }

        case "/task/list":
          System.out.println("작업 목록");
          for (int i = 0; i < wcount; i++) {
            System.out.printf("%s, %d, %s, %s, %s ,%s"
         ,wtitle[i], wno[i], wcontent[i], wendDate[i], wstat[i],wown[i]);
            System.out.println();
          }
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
}
