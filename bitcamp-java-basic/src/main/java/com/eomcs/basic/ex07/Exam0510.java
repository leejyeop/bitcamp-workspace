package com.eomcs.basic.ex07;

import java.util.Properties;
import java.util.Set;

public class Exam0510 {

  //실행하는 클래스는 다음과 같이 main() 메소드의 시그너처(signature)를 가져야 한다
  //=> method signature == function prototype == 메서드 선언
  //=> 파라미터의 이름은 상관없다
  public static void main(String... args) throws Exception {
    //프로그램 아규먼트
    //java Exam 0510 aaaa bbbb cccc
    System.out.println("Hello!");
    오호라(100);
    System.out.println(args.length);
    System.out.println("-----------------------");


    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    for (String str: args) {
      System.out.println("[" + str + "]");
    }


    String s1 = System.getProperty("name");
    String s2 = System.getProperty("age");
    System.out.println(s1);
    System.out.println(s2);
    //jvm 아규먼트
    //java -D이름=값 -D이름=값 Exam0510
    //java -Dage=20 -Dname=홍길  -cp bin/main com.eomcs.basic.ex07.Exam0510 aab cc dd
    System.out.println("-------------------------------------------");
    //jvm의 전체 프로퍼티 목록
    //jvm의 기본환경변수
    Properties pros = System.getProperties();
    Set keyList = pros.keySet();

    for (Object key : keyList) {
      System.out.printf("%s ---> %s\n", key,System.getProperty((String)key));
    }
  }
  static void 오호라(int 값1) {
    System.out.println(값1 * 2);
  }

}


