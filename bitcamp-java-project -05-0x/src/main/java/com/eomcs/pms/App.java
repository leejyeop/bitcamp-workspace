
package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;
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
public class App {

  //1)회원의 번호 이름 이메일 암호 사진 전화번호 등록일을 담을 수 있는 메모리 설계하는것을
  //member  클래스 정의라한다
  //2)Member 클래스의 래퍼런스 배열을 만들어 Member의 인스턴스를 보관한다
  //3)래퍼런스 배열을 직접 사용하여 인스턴스를 다루기 보다는  낱개의 래퍼런스를 만들어 인스턴스를 다루는 것이 더 간결하다.
  public static void main(String[] args) {
    class Member{//클래스이름은 항상 앞글자 대문자
      //값을 담기 위해 메로리를 할당할 때 어떤 종류의 메모리를 준비해야하는지
      //설계도를 작성한다
      //=>클래스 정의라고 부른다
      //인스턴스는 클래스에 변수선언에만 관계있다
      //인스턴스는 변수덩어리다
      int no; //인스턴스
      String name; //인스턴스
      String email; //인스턴스
      String password; //인스턴스
      String photo;//인스턴스
      String tel;//인스턴스
      Date createdDate;//인스턴스
      //자바는 인스턴스만들려면 new 명령어를 사용해야 만들수있다
      //===========인스턴스를 배열로 만드는 문법은 없다 ========
    }

    //Member 인스턴스의 주소를 담을 래퍼런스 배열을 준비한다
    final int LENGTH = 100;
    //int[] no = new int[MAX_LENGTH];
    //new Member[LENGTH];
    Member[] members = new Member[LENGTH]; //래퍼런스배열을 여러개 만듬
//members라는 래퍼런슬여러개만듬
//  members[i] = m;
    Scanner keyInput = new Scanner(System.in);
///////////////////////1번회원
    System.out.println("[회원]");
    long currentMillis=0;
    int count = 0;//count + =1; count ++;

    for (int i = 0; i < LENGTH; i++) {
      count++;
      //Member m;
      //m = new Member();
      Member m = new Member();

      System.out.print("번호? ");
      m.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("이름? ");
      m.name = keyInput.nextLine();

      System.out.print("이메일? ");
      m.email = keyInput.nextLine();

      System.out.print("암호?");
      m.password = keyInput.nextLine();

      System.out.print("사진?");
      m.photo= keyInput.nextLine();

      System.out.print("전화?");
      m.tel = keyInput.nextLine();

      currentMillis = System.currentTimeMillis(); //(8바이트)
      //1970년 1-1일 00:00:00에서 경과된 밀리초
      m.createdDate = new Date(currentMillis);

      members[i] = m;

      System.out.println();
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response = keyInput.nextLine();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }

      //if (!response.equals("y")|| response.equals("Y"))

    }
    keyInput.close();
    for (int i = 0; i< count; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s ,%s ,%s\n",
          m.no, m.name,m.email,m.tel,m.createdDate.toString());
    }








//    //Member 설계도에 따라 준비한 메모리의 주소 를 담을 변수 선언
//    Member m;
//    //Member :설계도에 따라 메모리 생성 방법
//    //메모리 담는 장소 래퍼런스

// Project[] projects = new Project[LENGTH]; // 배열만드는거
//    m = new Member();//인스턴스 만드는 방법
//    Project p = new Project();
    //projects[i] = p;
//    //m에 저장된 주소로 찾아가서 해당 인스턴스의 각항목에 데이터 넣기
//    m.no = 1; //m 은 래퍼런스 변
//    m.name = "홍길동";
//    m.email = "home@email.com";
//    m.password = "1111";
//    m.photo = "hong.gif";
//    m.tel = "010-1234-2222";
//    m.createdDate = Date.valueOf("2020-1-1");
//    //m에 저장된 주소로 찾아가서 해당 인스턴스의 각 항목의 값을 꺼내기
//    System.out.println(m.no);
//    System.out.println(m.name);
//    System.out.println(m.email);
//    System.out.println(m.password);
//    System.out.println(m.photo);
//    System.out.println(m.tel);
//    System.out.println(m.createdDate);
//
//    Member m2;
//    m2 = m;
//    m2.name = "임꺽정";
//    System.out.println(m.name); //같은 인스턴스를 가지고있다.
//    //=> m이라는 변수에 저장된 주소로 찾아가서 no이라는 일름의 항목 값을 꺼내기
//    // => 래퍼런스 m이 가리키는 인스턴스의 no 항목의 값을 꺼내기
//    //=> 래퍼런스 m이 가리키는 인스턴스의 no필드 값 꺼내기
//    //=> m객체의 no필드 값 꺼내기
////    Member x1, x2, x3 ,x4;
////    x1 = m;
////    x2 = m;
////    x3 = m2;
////    x4 = m2;
//    Member[] members = new Member[4];//인스턴스 주소를 담을 래퍼런스를만드는방법
//    //members 래퍼런스 배열을 가르키는 주소변수
//    members[0] = new Member();
//    members[1] = new Member();
//    members[2] = new Member();
//    members[3] = new Member();
//
//    members[0].name = "홍길동";
//    members[1].name = "임꺽정";
//    members[2].name = "유관순";
//    members[3].name = "안중근";
//
//    Member x;
//    x = members[2];
//    x.name = "오호라";
//    x = members[0];
//    x.name = "우헤헤";
//    Member x2;
//    x2 = x;
//    x2.name = "헐";
//    System.out.println(members[0].name);
//    System.out.println(members[1].name);
//    System.out.println(members[2].name);
//    System.out.println(members[3].name);




    //최대 5명의 회원 정보를 입력받는 변수를 선언




//    String[] name = new String[MAX_LENGTH];
//    String[] email = new String[MAX_LENGTH];
//    String[] password = new String[MAX_LENGTH];
//    String[] photo = new String[MAX_LENGTH];
//    String[] tell = new String[MAX_LENGTH];
//    Date[] now = new Date[MAX_LENGTH];
//    int no1=0, no2=0, no3=0, no4=0, no5=0;
//    String name1="", name2="", name3="",name4="",name5="";
//    String email1="", email2="", email3="", email4="" ,email5="";
//    String password1="",password2="",password3="",password4="",password5="";
//    String photo1="",photo2,photo3="",photo4="",photo5="";
//    String tell1="",tell2="",tell3="",tell4="",tell5="";
//    java.sql.Date now1=null,now2=null,now3=null,now4=null,now5=null;




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
    /*





    System.out.println();
    */
  }
}
