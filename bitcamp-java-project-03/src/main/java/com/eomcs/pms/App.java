
package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    //콘솔에서 사용자의 입력을 처리하 도구를 준비한다.
    //(input stream)keyboard->System.in
    //입력에서 데이터를 읽어 
    //적절한 타입으로 리턴하는 도구ㅏ도구:Scanner
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    //new java.io.BufferedInputStream(System.in);
    //new java.io.DataInputStream(System.in);
    
    System.out.println("[회원]");
    System.out.print("번호? ");
    String no = keyInput.nextLine();
    System.out.print("이름? ");
    String name = keyInput.nextLine();
    
    System.out.println("이메일?");
    String email = keyInput.nextLine();
    
    System.out.println("암호?");
    String password = keyInput.nextLine();
    
    System.out.println("사진?");
    String photo = keyInput.nextLine();
    
    System.out.println("전화?");
    String tell = keyInput.nextLine();
    
    long currentMillis = System.currentTimeMillis(); //(8바이트)
    //1970년 1-1일 00:00:00에서 경과된 밀리초 
    java.sql.Date now = new java.sql.Date(currentMillis);
    
    System.out.println("가입일?");
    
    
    keyInput.close();
    System.out.println("-----------------------------");
    System.out.println("번호: "+no);
    System.out.printf("이름: %s\n" , name);
    System.out.printf("이메일: %s\n" , email);
    System.out.printf("암호: %s\n" , password);
    System.out.printf("사진: %s\n" , photo);
    System.out.printf("전화: %s\n" , tell);
    System.out.printf("가입일: %s\n" , now.toString());
    
    //System.out.printf("이름: %s\n" + x);
    
  }
}
