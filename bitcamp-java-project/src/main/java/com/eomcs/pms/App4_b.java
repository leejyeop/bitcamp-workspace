
package com.eomcs.pms;
//클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다
import java.util.Scanner;
import java.sql.Date;
// 1)낱개의 변수를 사용하여 여러 회원정보 처리하기
// 2)조건문을 사용하여 입출력 제어하기
// 필요한만큼만 입력받고 출력하고싶
public class App4_b {

  public static void main(String[] args) {
 
    Scanner keyInput = new Scanner(System.in);
///////////////////////1번회원
    System.out.println("[회원]");
    
    //최대 5명의 회원 정보를 입력받는 변수를 선언
    int no1=0, no2=0, no3=0, no4=0, no5=0;
    String name1="", name2="", name3="",name4="",name5="";
    String email1="", email2="", email3="", email4="" ,email5="";
    String password1="",password2="",password3="",password4="",password5="";
    String photo1="",photo2,photo3="",photo4="",photo5="";
    String tell1="",tell2="",tell3="",tell4="",tell5="";
    java.sql.Date now1=null,now2=null,now3=null,now4=null,now5=null;
    long currentMillis=0; 
    int count = 1;//count + =1; count ++;
    
    
    System.out.print("번호? ");
    no1 = keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("이름? ");
    name1 = keyInput.nextLine();
    System.out.print("이메일? ");
    email1 = keyInput.nextLine();
    
    System.out.print("암호?");
    password1 = keyInput.nextLine();
    
    System.out.print("사진?");
    photo1 = keyInput.nextLine();
    
    System.out.print("전화?");
    tell1 = keyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); //(8바이트)
    //1970년 1-1일 00:00:00에서 경과된 밀리초 
    now1 = new Date(currentMillis);
    System.out.println();
    ////////////////////////////////// 2번회원
    
    System.out.println("계속 입력하시겠습니까? (y/N)");
    String response =keyInput.nextLine();
    
    
    if (response.equals("y")|| response.equals("Y")) {
      count = count +1 ; //count + =1; count ++;
      
      System.out.print("번호? ");
      no2 = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      name2 = keyInput.nextLine();
      
      System.out.println("이메일?");
      email2 = keyInput.nextLine();
      
      System.out.println("암호?");
      password2 = keyInput.nextLine();
      
      System.out.println("사진?");
      photo2 = keyInput.nextLine();
      
      System.out.println("전화?");
      tell2 = keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); //(8바이트)
      //1970년 1-1일 00:00:00에서 경과된 밀리초 
      now2 = new Date(currentMillis);
      System.out.println();
      
      System.out.println("계속 입력하시겠습니까? (y/N)");
      response =keyInput.nextLine();
      
      if (response.equalsIgnoreCase("y")) {
        count = count +1 ;
        /////////////////////////////////////////3번회원
        System.out.print("번호? ");
        no3 = keyInput.nextInt();
        keyInput.nextLine();
        System.out.print("이름? ");
        name3 = keyInput.nextLine();
        
        System.out.println("이메일?");
        email3 = keyInput.nextLine();
        
        System.out.println("암호?");
        password3 = keyInput.nextLine();
        
        System.out.println("사진?");
        photo3 = keyInput.nextLine();
        
        System.out.println("전화?");
        tell3 = keyInput.nextLine();
        
        currentMillis = System.currentTimeMillis(); //(8바이트)
        //1970년 1-1일 00:00:00에서 경과된 밀리초 
        now3 = new Date(currentMillis);
        System.out.println();
        ///////////////////////////////////////////4번회원
        
        System.out.println("계속 입력하시겠습니까? (y/N)");
        response =keyInput.nextLine();
        
        if (response.equalsIgnoreCase("y")) {
          count = count +1 ;
          System.out.print("번호? ");
          no4 = keyInput.nextInt();
          keyInput.nextLine();
          System.out.print("이름? ");
          name4 = keyInput.nextLine();
          
          System.out.println("이메일?");
          email4 = keyInput.nextLine();
          
          System.out.println("암호?");
          password4 = keyInput.nextLine();
          
          System.out.println("사진?");
          photo4 = keyInput.nextLine();
          
          System.out.println("전화?");
          tell4 = keyInput.nextLine();
          
          currentMillis = System.currentTimeMillis(); //(8바이트)
          //1970년 1-1일 00:00:00에서 경과된 밀리초 
          now4 = new Date(currentMillis);
          System.out.println();
///////////////////////////////////////////////5번회원
          
          System.out.println("계속 입력하시겠습니까? (y/N)");
          response =keyInput.nextLine();
          
          if (response.equalsIgnoreCase("y")) {
            count = count +1 ;
            System.out.print("번호? ");
            no5 = keyInput.nextInt();
            keyInput.nextLine();
            System.out.print("이름? ");
            name5 = keyInput.nextLine();
            
            System.out.println("이메일?");
            email5 = keyInput.nextLine();
            
            System.out.println("암호?");
            password5 = keyInput.nextLine();
            
            System.out.println("사진?");
            photo5 = keyInput.nextLine();
            
            System.out.println("전화?");
            tell5 = keyInput.nextLine();
            
            currentMillis = System.currentTimeMillis(); //(8바이트)
            //1970년 1-1일 00:00:00에서 경과된 밀리초 
            now5 = new Date(currentMillis);
            System.out.println();
            

          }
          
        }
        
      }
   
    }
    System.out.println("----------------------------------------------");
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
    System.out.println("-----------------------------");
    System.out.printf("%d, %s, %s ,%s ,%s\n", no1, name1,email1,tell1,now1.toString());
    if (count > 1) {
      System.out.printf("%d, %s, %s ,%s ,%s\n", no2, name2,email2,tell2,now2.toString());
      if (count > 2) {
        System.out.printf("%d, %s, %s ,%s ,%s\n", no3, name3,email3,tell3,now3.toString());
        if (count > 3) {
          System.out.printf("%d, %s, %s ,%s ,%s\n", no4, name4,email4,tell4,now4.toString());
          if (count > 4) {
            System.out.printf("%d, %s, %s ,%s ,%s\n", no5, name5,email5,tell5,now5.toString());
          }
        }
      }
    } 
    
    
    System.out.println();
  }
}
