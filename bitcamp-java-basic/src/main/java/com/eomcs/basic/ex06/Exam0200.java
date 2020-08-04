package com.eomcs.basic.ex06;

public class Exam0200 {
  public static void main(String[] args) {
    final int DEVEOLPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;
    int type = 1;
    if (type == 1) {//개발자일경우
      System.out.println("정보처리자격증");
      System.out.println("졸업 증명서");
      System.out.println("이력서");
    } else if (type == 2) {//일반 관리자경우
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == 3) {//시설관리경
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }
    System.out.println("----------------");
    switch (type) {
      case DEVEOLPER:
        System.out.println("정보처리자격증");
        System.out.println("졸업 증명서");
        System.out.println("이력서");
        break;
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");
    }
    int score = 70;
    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
        System.out.println("B");
        break;
      case 70:
        break;
      case 60:
        System.out.println("C");
        break;
      default:
      System.out.println("F");


    }
    final String VALUE1 = "값";
  final String VALUE2 = "값";//long float 안댐
//4바이트 이하 정수 (byte,short,int,char),문자열
  //String 문자열 가능 ,enum 상수
  switch (VALUE2) {
    case "값":
      break;
    //case VALUE1: //200은저장할수없다
    case "값1":
    case "100+3":
      break;
      default:
  }
  //case에는 리터럴만 올 수있다 즉변수사용불가
  //상수일경우 사용가능
  //case문자의 값에 변수를 사용할수 없지만
  //값이 바뀌지않는 final 상수일 경우 case문자의
  //값으로 사용 할 수 있다
  int value3 = 300;
  int x = 200;
  final int Y = 100;
  final int y = 200;
  String abc = "sd";
  switch (value3) {
    case 200:
      break;
    case 100+3:
      break;
    case Y:
      break;
      default:
  }
  //enum으로 정의된 상수를 사용하려면
  //enum 타입의 변수를 선언해야한다.
  //enum을 사용하는 주된 이유는
  //100,200."admin" 과 같이 값을 직접 지정할
  //필요가없다.
  //enum변수에는 그타입에 정의된 값만저장할수있다.
  //다음과 같이 switch나 case 값으로 enum타입의 값이
  //올 수 있다.
  Job type2 = Job.DEV;

  switch (type2) {
    case DEV:
      break;
    case GM:
      break;
      default:
  }



  }
  //상수를 조직적으로 관리하는 방법
  //enum을 사용하ㅏ여 상수를 정의한다
  //nested enum은 기본이 static이다
  //그래서 static을 생략 해도 ㅗ딛ㄴ다
  enum Job {
    DEV,GM,BM
    }
}
