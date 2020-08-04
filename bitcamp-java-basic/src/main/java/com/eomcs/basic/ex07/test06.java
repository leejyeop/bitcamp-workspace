package com.eomcs.basic.ex07;

public class test06 {
  public static void main(String[] args) {
    int[] arr;
    arr = getArray();
    System.out.println(arr[1]);
  }
  static int[] getArray() {
    int[] arr = new int[] {100, 200, 300};
    return arr;
  }
}
