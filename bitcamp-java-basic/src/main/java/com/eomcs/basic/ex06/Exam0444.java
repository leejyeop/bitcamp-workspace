package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0444 {
  public static void main(String[] args) {
//    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
//
//    // 증가치 조정
//    for (int i = 0; i < names.length; i += 2) {
//      System.out.println(names[i]);
//
//    }
//System.out.println(names.length);
//    loop:
//    for (int i = 2; i <= 9; i++) {
//      for (int j = 1; j <= 9; j++) {
//
//        System.out.printf("%d x %d = %d\n" , i, j, i*j );
//        if (i == 5 && j == 5) {
//          continue loop;
//        }
//      }
//  System.out.println("------------------");
//    }
    //int[] score = new int[5];
//    int score[] = {100,90,80,70,60};
//    for (int i = 0; i <= score.length; i += 2) {
//      System.out.println(score[i]);
//    }
//    System.out.println(score.length);
// ArrayList() scores = new ArrayList();
// scores.add(100);
// scores.add(90);
// scores.add(3.224);
// scores.add(70);
// scores.add("헐");
// scores.add(new Date());
// for (Object value : scores) {
//   System.out.println(value);
// }
    ArrayList<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");
    list.add("김원봉");
    list.add("김구");

    // 제네릭을 사용하면 for(:) 문장에서
    // 항목의 타입을 정확하게 지정하여 값을 받을 수 있다.
    for (String name : list) {
      System.out.print(name + " d");
    }
//for (int i = 0; i < scores.size(); i++) {
//  System.out.println(scores.get(i));
//}
//    int score[] = {100,90,80,70,60};
//    for (int value : score) {
//      System.out.println(value);
//    }
//    System.out.println(score.length);
//    for (int i = 0; i < score.length; i++)
//    int value = score[i];
//    System.out.println(value);







  }

}
