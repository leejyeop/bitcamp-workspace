
package com.eomcs.pms;
//클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다
import java.util.Scanner;
import java.sql.Date;
// 1)낱개의 변수를 사용하여 여러 회원정보 처리하기
// 2)조건문을 사용하여 입출력 제어하기
// 필요한만큼만 입력받고 출력하고싶다
// 배열을 사용하여 여러개의 값을 다루기
//배열을 사용하면간단하게 여러개의 변수를 선언할 수있다
//반복문을 사용하여 여러개의 값을 다루기
//반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
public class App_d {

  public static void main(String[] args) {
 
    Scanner keyInput = new Scanner(System.in);
///////////////////////1번회원
    System.out.println("[회원]");
    
    //최대 5명의 회원 정보를 입력받는 변수를 선언
    int[] no = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] photo = new String[5];
    String[] tell = new String[5];
    Date[] now = new Date[5];
    int no1=0, no2=0, no3=0, no4=0, no5=0;
    String name1="", name2="", name3="",name4="",name5="";
    String email1="", email2="", email3="", email4="" ,email5="";
    String password1="",password2="",password3="",password4="",password5="";
    String photo1="",photo2,photo3="",photo4="",photo5="";
    String tell1="",tell2="",tell3="",tell4="",tell5="";
    java.sql.Date now1=null,now2=null,now3=null,now4=null,now5=null;
    long currentMillis=0; 
    int count = 0;//count + =1; count ++;
    
    for (int i = 0; i < 5; i++) {
      count++;
      System.out.print("번호? ");
      no[i]= keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      name[i] = keyInput.nextLine();
      System.out.print("이메일? ");
      email[i] = keyInput.nextLine();
      
      System.out.print("암호?");
      password[i] = keyInput.nextLine();
      
      System.out.print("사진?");
      photo[i] = keyInput.nextLine();
      
      System.out.print("전화?");
      tell[i] = keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); //(8바이트)
      //1970년 1-1일 00:00:00에서 경과된 밀리초 
      now[i] = new Date(currentMillis);
      System.out.println();
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response =keyInput.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      //if (!response.equals("y")|| response.equals("Y"))
      
    }
    
    
   
    ////////////////////////////////// 2번회원
    
   
    keyInput.close();
    
    
    
    
//    System.out.print("계속 입력 하시겠습니까?(y/N) ");
//    String response = keyInput.nextLine();
//    
//    if (response.equals("y")) {
//      //추가로 회원 정보를 입력받는다
//    }
    
    

//    System.out.printf("이름: %s\n" , name1);
//    System.out.printf("이메일: %s\n" , email1);
//    System.out.printf("암호: %s\n" , password1);
//    System.out.printf("사진: %s\n" , photo1);
//    System.out.printf("전화: %s\n" , tell1);
//    System.out.printf("가입일: %s\n" , now1.toString());
    
    //System.out.printf("이름: %s\n" + x);
    for (int i = 0; i< count; i++) {
      System.out.printf("%d, %s, %s ,%s ,%s\n", no[i], name[i],email[i],tell[i],now[i].toString());
    }
   
    
    
    
    System.out.println();
  }
}