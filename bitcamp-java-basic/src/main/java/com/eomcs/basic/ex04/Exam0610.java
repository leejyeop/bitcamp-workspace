//상수:값을 바꿀 수 없는 변
package com.eomcs.basic.ex04;

public class Exam0610 {
  public static void main(String[] args) {
    int a;
    a = 100;
    a = 200;
    a = 3030;
    
    //변수의 값을 한번설정하면 바꾸지 못하게 막는 문법
    final int b;
    b = 200;
    //b = 300; 컴파일 오류 문법이 맞이않아 컴파일 을 할 수 없는것.
    //상수 변수는 보통 선언과 동시에 값을 저장한다 
    final int LENGHT = 100;
    //일반 변수가 아님을 표시하기위해 대문자로 작성 
    
    //상수의 이름을 대문자로 작성할떄 단어사이는 _를 삽입한다
    //ex)MAX_LENGTH    FIRST_USER_NAME
  }
}
