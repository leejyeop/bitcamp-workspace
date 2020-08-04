//반복문 while (조건 ) 문장;
package com.eomcs.basic.ex06;

public class Exam0310 {
  public static void main(String[] args) {
    //무한루프
    //while (true)
    //System.out.println("안녕");
    //
    //while (true); //빈문장
    //System.out.println("안녕");
    int count = 0;
    int sum = 0;

    //가장 읽기 쉽게하자
//    while (count-- > -10) {
//      System.out.println(count);
//    System.out.println("안녕");
    //while
    //int temp = count;
    //count = count + 1;
    //boolean condition = temp < 10;
    //if (condition == ture) {
    //System.out.println("안녕");
    //}
    //}
// while (count++ < 20) {
//   //count++;
//   //sum = sum + count;
//   if ((count &0b01) == 1)//홀수 (> 0)
//     continue;//즉시 상위조건문으로 실행을 이동한다.
//   System.out.println(count);
//   if ((count % 2) != 0)
//     continue;//아래실행하지않고 즉시 상위조건문으로 실행을 이동한다.
//   System.out.println(count);
// }
//  while (count++ < 20) {
//  if (count > 5)
//    break;
//  System.out.println(count);
//
//  }
//    int i = 2;
//    int j = 1;
//    int result = 0;
//    loop:
//      while (i <= 9) { //nested
//      j =1 ;
//      while (j <= 9) {
//        System.out.printf("%d x %d = %d\n", i ,j ,i*j);
//        if (i == 5 && j == 5)
//          continue loop;
//        //라벨이 붙은 조건문으로 이동
//        //break loop; 한번에 바깥 으로탈출
//        j++;
//      }
//        i++;
//    }


    //반복문 while (조건) 문장 : do 문장 while(조건);
//  int i = 0;
//  int j = 1;
//  do {
//      System.out.println(i);
//      i++;
//    } while(i <10);
int a = 1;
do {
  System.out.print(a);
  a++;
}while (a < 5);// 조건이 참일 때 까지 실행

//while 문은 조건이 참일 때 까지 실행





System.out.println("나감");
  }
}
