// call by value vs call by reference
package com.eomcs.basic.ex07;

public class Exam0310 {

  static class Person { //데이터 타입 새로운종류 만들고싶을때
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {
    int a = 200;

    m1(a);
    System.out.println(a);
    a = 300;
    m1(a); //call by value 값
    System.out.println(a);

    int[] arr = new int[3];
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;

    m2(arr);// call by reference 주소
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println("---------------------");

    Person p;
    p = new Person();

    System.out.printf("%s %d %b\n", p.name, p.age, p.working);
    m3(p); //call by reference

    System.out.printf("%s %d %b\n", p.name, p.age, p.working);
  }
  static void m3(Person p) {
    p.name = "홍길동";//heap에 홍길동이 저장됨
    p.age = 20;
    p.working = true;
  }
  static void m1(int a) {
    a = 100;
    System.out.println("==>" +a);
  }
  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;
  }
}
//new 명령으로 생성하는 변수는 heap라는 영역에 생성된다
//시험지:
//1:다음 계산을 수행하라
// a 변수에 100을 넣어라
// b 변수에 200을 넣어라
// a와 b 를 더해 그 결과를 출력하라.
//메소드 호출될때 stack에 로컬변수가 생성되고 호출이 끝나면 사라진다
//
