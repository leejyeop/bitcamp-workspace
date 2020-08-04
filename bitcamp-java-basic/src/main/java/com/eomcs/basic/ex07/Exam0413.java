package com.eomcs.basic.ex07;

import java.util.ArrayList;

//# 메서드 : JVM 메모리
//Stack 과 Heap메모리 영역

public class Exam0413 {

  public static void main(String[] args) throws Exception {
    ArrayList list = new ArrayList();

    while (true) {
      list.add(creatArray());
      Thread.currentThread().sleep(2000);
    }
  }
  static int[] creatArray() {
    System.out.print(".");
    return new int[10_000_000];

  }

}


