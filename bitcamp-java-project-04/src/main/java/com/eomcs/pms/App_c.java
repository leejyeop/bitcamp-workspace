
package com.eomcs.pms;
//클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다
import java.util.Scanner;
import java.sql.Date;
// 1)낱개의 변수를 사용하여 여러 회원정보 처리하기
// 2)조건문을 사용하여 입출력 제어하기
// 필요한만큼만 입력받고 출력하고싶다
// 배열을 사용하여 여러개의 값을 다루기
//배열을 사용하면간단하게 여러개의 변수를 선언할 수있
public class App_c {

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
    int count = 1;//count + =1; count ++;
    
    
    System.out.print("번호? ");
    no[0]= keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("이름? ");
    name[0] = keyInput.nextLine();
    System.out.print("이메일? ");
    email[0] = keyInput.nextLine();
    
    System.out.print("암호?");
    password[0] = keyInput.nextLine();
    
    System.out.print("사진?");
    photo[0] = keyInput.nextLine();
    
    System.out.print("전화?");
    tell[0] = keyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); //(8바이트)
    //1970년 1-1일 00:00:00에서 경과된 밀리초 
    now[0] = new Date(currentMillis);
    System.out.println();
    ////////////////////////////////// 2번회원
    
    System.out.println("계속 입력하시겠습니까? (y/N)");
    String response =keyInput.nextLine();
    
    
    if (response.equals("y")|| response.equals("Y")) {
      count = count +1 ; //count + =1; count ++;
      
      System.out.print("번호? ");
      no[1] = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      name[1] = keyInput.nextLine();
      
      System.out.println("이메일?");
      email[1] = keyInput.nextLine();
      
      System.out.println("암호?");
      password[1] = keyInput.nextLine();
      
      System.out.println("사진?");
      photo[1] = keyInput.nextLine();
      
      System.out.println("전화?");
      tell[1] = keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); //(8바이트)
      //1970년 1-1일 00:00:00에서 경과된 밀리초 
      now[1] = new Date(currentMillis);
      System.out.println();
      
      System.out.println("계속 입력하시겠습니까? (y/N)");
      response =keyInput.nextLine();
      
      if (response.equalsIgnoreCase("y")) {
        count = count +1 ;
        /////////////////////////////////////////3번회원
        System.out.print("번호? ");
        no[2] = keyInput.nextInt();
        keyInput.nextLine();
        System.out.print("이름? ");
        name[2] = keyInput.nextLine();
        
        System.out.println("이메일?");
        email[2] = keyInput.nextLine();
        
        System.out.println("암호?");
        password[2] = keyInput.nextLine();
        
        System.out.println("사진?");
        photo[2] = keyInput.nextLine();
        
        System.out.println("전화?");
        tell[2] = keyInput.nextLine();
        
        currentMillis = System.currentTimeMillis(); //(8바이트)
        //1970년 1-1일 00:00:00에서 경과된 밀리초 
        now[2] = new Date(currentMillis);
        System.out.println();
        ///////////////////////////////////////////4번회원
        
        System.out.println("계속 입력하시겠습니까? (y/N)");
        response =keyInput.nextLine();
        
        if (response.equalsIgnoreCase("y")) {
          count = count +1 ;
          System.out.print("번호? ");
          no[3] = keyInput.nextInt();
          keyInput.nextLine();
          System.out.print("이름? ");
          name[3] = keyInput.nextLine();
          
          System.out.println("이메일?");
          email[3] = keyInput.nextLine();
          
          System.out.println("암호?");
          password[3] = keyInput.nextLine();
          
          System.out.println("사진?");
          photo[3] = keyInput.nextLine();
          
          System.out.println("전화?");
          tell[3] = keyInput.nextLine();
          
          currentMillis = System.currentTimeMillis(); //(8바이트)
          //1970년 1-1일 00:00:00에서 경과된 밀리초 
          now[3] = new Date(currentMillis);
          System.out.println();
///////////////////////////////////////////////5번회원
          
          System.out.println("계속 입력하시겠습니까? (y/N)");
          response =keyInput.nextLine();
          
          if (response.equalsIgnoreCase("y")) {
            count = count +1 ;
            System.out.print("번호? ");
            no[4] = keyInput.nextInt();
            keyInput.nextLine();
            System.out.print("이름? ");
            name[4] = keyInput.nextLine();
            
            System.out.println("이메일?");
            email[4] = keyInput.nextLine();
            
            System.out.println("암호?");
            password[4] = keyInput.nextLine();
            
            System.out.println("사진?");
            photo[4] = keyInput.nextLine();
            
            System.out.println("전화?");
            tell[4] = keyInput.nextLine();
            
            currentMillis = System.currentTimeMillis(); //(8바이트)
            //1970년 1-1일 00:00:00에서 경과된 밀리초 
            now[4] = new Date(currentMillis);
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
    System.out.printf("%d, %s, %s ,%s ,%s\n", no[0], name[0],email[0],tell[0],now[0].toString());
    if (count > 1) {
      System.out.printf("%d, %s, %s ,%s ,%s\n", no[1], name[1],email[1],tell[1],now[1].toString());
      if (count > 2) {
        System.out.printf("%d, %s, %s ,%s ,%s\n", no[2], name[2],email[2],tell[2],now[2].toString());
        if (count > 3) {
          System.out.printf("%d, %s, %s ,%s ,%s\n", no[3], name[3],email[3],tell[3],now[3].toString());
          if (count > 4) {
            System.out.printf("%d, %s, %s ,%s ,%s\n", no[4], name[4],email[4],tell[4],now[4].toString());
          }
        }
      }
    } 
    
    
    System.out.println();
  }
}
