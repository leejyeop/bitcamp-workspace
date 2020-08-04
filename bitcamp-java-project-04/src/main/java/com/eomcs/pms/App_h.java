
package com.eomcs.pms;
//클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다
import java.util.Scanner;
import org.checkerframework.checker.units.qual.m;
import java.sql.Date;
// 1)낱개의 변수를 사용하여 여러 회원정보 처리하기
// 2)조건문을 사용하여 입출력 제어하기
// 필요한만큼만 입력받고 출력하고싶다
// 3배열을 사용하여 여러개의 값을 다루기
//배열을 사용하면간단하게 여러개의 변수를 선언할 수있다
//4반복문을 사용하여 여러개의 값을 다루기
//반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
//5배열 개수를 변수에서 관리하기
//변수의 값만 바꾸면 배열 개수를 바꿀수 있어 편리하다
//6상수를 사용하여 초기값을 변경하지 못하게막기
//변수는 중간에 값을 바꿀수 있기 때문에 값을 바꾸지 말아야 하는 경우 
//실수를 막기위해 상수로 변경을 선언한다. 상수는 값을 못바꾼다
//7메서드를  사용하여 코드를 분리하기
//메서드를 사용하면 기능별로 코드를 별도의 블럭을 ㅗ분리할 수있다.
//작은 단위로 코드가 분리되면 관리하기 쉽다.
//8클래스를사용하여 데이터를 담을 메모리를 정의한다
//번호 이름 이메일 등 각각의 데이터를 낱개로 다루는 것보
//하나의 데이터로 묶어서 다루면 값을 다루기가 편하다.
public class App_h { 
  
  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tell;
    Date now;
  }
  
  static final int MAX_LENGTH = 5;
  static Member[] members = new Member[MAX_LENGTH];
  static int count = 0;//count + =1; count ++;
  
//  static int[] no = new int[MAX_LENGTH];
//  static String[] name = new String[MAX_LENGTH];
//  static String[] email = new String[MAX_LENGTH];
//  static String[] password = new String[MAX_LENGTH];
//  static String[] photo = new String[MAX_LENGTH];
//  static String[] tell = new String[MAX_LENGTH];
//  static Date[] now = new Date[MAX_LENGTH];
  
  
  public static void main(String[] args) {
 
    
///////////////////////1번회원
    System.out.println("[회원]");
    
    //최대 5명의 회원 정보를 입력받는 변수를 선언
    
    
    inputMembers(); //별도의 블록을 분리한 코드를 실행하기
    
    System.out.println("-----------------");
    printMembers();

    int no1=0, no2=0, no3=0, no4=0, no5=0;
    String name1="", name2="", name3="",name4="",name5="";
    String email1="", email2="", email3="", email4="" ,email5="";
    String password1="",password2="",password3="",password4="",password5="";
    String photo1="",photo2,photo3="",photo4="",photo5="";
    String tell1="",tell2="",tell3="",tell4="",tell5="";
    java.sql.Date now1=null,now2=null,now3=null,now4=null,now5=null;
     

   
    ////////////////////////////////// 2번회원
    
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
    System.out.println();
  }
  
  
  static void inputMembers() {
    
    Scanner keyInput = new Scanner(System.in);
    long currentMillis=0;
    
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Member m =new Member();
      System.out.print("번호? ");
      m.no= keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      m.name = keyInput.nextLine();
      System.out.print("이메일? ");
      m.email = keyInput.nextLine();
      
      System.out.print("암호?");
      m.password = keyInput.nextLine();
      
      System.out.print("사진?");
      m.photo = keyInput.nextLine();
      
      System.out.print("전화?");
      m.tell = keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); //(8바이트)
      //1970년 1-1일 00:00:00에서 경과된 밀리초 
      m.now = new Date(currentMillis);
      members[i] =m;
      System.out.println();
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response =keyInput.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      //if (!response.equals("y")|| response.equals("Y"))
      
    }
    keyInput.close();
  }
  
  static void printMembers() {
    for (int i = 0; i< count; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s ,%s ,%s\n",m.no, m.name,m.email,m.tell,m.now.toString());
    }
  }
  
  
  
  
  
  
}
