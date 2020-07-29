package com.eomcs.pms;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");
    

    System.out.print("번호: ");
    //System.out.println(1201);
    int no = keyInput.nextInt();
    keyInput.nextLine(); //엔터읽는거
    
    System.out.print("프로젝트명: ");
    //System.out.println("미니 프로젝트 관리 시스템 개발");
    String name = keyInput.nextLine();
    System.out.print("내용: ");
    //System.out.println("소규모 팀을 위한 프로젝트 관리 시스템을 개발한다.");
    String contents = keyInput.nextLine();
    
    System.out.print("시작일: ");
    java.util.Date startDate = java.sql.Date.valueOf(keyInput.nextLine());
    System.out.print("종료일: ");
    java.util.Date endDate = java.sql.Date.valueOf(keyInput.nextLine());
    //String eDate = keyInput.nextLine();
    System.out.println("만든이: ");
    String owner = keyInput.nextLine();
    System.out.println("만든이: ");
    /*
     * System.out.println("팀원: " + "홍길동" + "," + "김구" + "," + "유관순" + "," + "안중근" + "," + "윤봉길");
     */
    System.out.println("팀원");
    
    String team = keyInput.nextLine();
    
    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");
    
    System.out.printf("번호: %d\n", no);
    
    System.out.printf("프로젝트명: %s\n", name);

    System.out.printf("내용: %s\n", contents);
    
    System.out.printf("시작일: %s\n", startDate.toString());
    
    System.out.printf("종료일: %s\n", endDate.toString());
    
    System.out.printf("만든이: %s\n", owner);
    
    //System.out.println("팀원: %s\n", team);
    
  }
}
