package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    System.out.printf("[작업]");
    System.out.print("\n프로젝트? ");
    String name = keyInput.nextLine();
    System.out.print("번호? ");
    String str = keyInput.nextLine();
    int no = Integer.parseInt(str);
    //nextInt 는 입력값중에서 숫자만 읽는다
    //Int 를 호출하면 숫자 뒤에 문자를 남긴다
    keyInput.nextLine(); //숫자 뒤에 남아있는 CR/LF 값을 읽어서 제거한다.
    
    System.out.print("내용? ");
    String contents = keyInput.nextLine();
    System.out.print("완료일? ");
    //String eDate = keyInput.nextLine();
    java.sql.Date completedDate = java.sql.Date.valueOf(keyInput.nextLine());
    System.out.print("상태? ");
    System.out.println("\n0: 신규\n1: 진행중\n2: 완료");
    String stat = keyInput.nextLine();
    System.out.print("담당자? 홍길동");
    String own = keyInput.nextLine();
    System.out.println("------------------------");
    
    
    System.out.printf("\n프로젝트: %s\n", name);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("완료일: %s\n", completedDate.toString());
    
    
    
//    switch (stat) {
//      case "0": 
//        stat = "신규";  
//        break;
//      case "1": 
//        stat = "진행중";
//      break;
//      case "2": 
//        stat = "완료";
//      break;
//      default :
//      System.out.println("모름");
//    }
//    
//    
//    System.out.printf("상태: %s\n", stat);
    //스트링변수에 들어있는
    //문자열을 비교할떄는 변수.equals(문자열)을 넣음
    
   
    System.out.print("상태: ");
    if (stat.equals("0")) {
     System.out.println("신규");
   } else if (stat.equals("1")) {
     System.out.println("진행중");
   } else {
     System.out.println("완료");
   }
   
    
    
    System.out.printf("담당자: %s\n", own);
    keyInput.close();
    
    
  }
}
