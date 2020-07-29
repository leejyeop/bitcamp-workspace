package com.eomcs.basic.ex04;

public class Exam0520 {
  public static void main(String[] args) {
    int[] i1 = new int[5];
    i1[0] = 1;
    i1[1] = 0;
    i1[2] = 2;
    i1[3] = 3;
    
    
    int ex[] = new int[5];
    int[] i2;
    i2 = new int[3];
    int[] i3 = {100,200,300};
    int i4[] =new int[] {100,200,300,400};
    i4 = i3;
    System.out.println(i4[2]);
    int i6[] = {100,200,300};
    
    int[] arr1 = new int[5];
    float[] arr2 = new float[5];
    boolean[] arr3 = new boolean[5];
    char[] arr4 = new char[5];
    Object[] arr5 = new Object[5];
    
    System.out.println(arr1[0]);
    System.out.println(arr2[0]);
    System.out.println(arr3[0]);
    System.out.println(arr4[0]);
    System.out.println(arr5[0]);
    
    
  }
}
