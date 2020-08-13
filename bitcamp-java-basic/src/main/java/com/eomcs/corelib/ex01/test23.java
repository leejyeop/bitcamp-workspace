package com.eomcs.corelib.ex01;

public class test23 {
  public static void main(String[] args) {
    String[] obj2 = new String[10];
    Class<?> classInfo = obj2.getClass();
    System.out.println(classInfo.getName());

    Class<?> compTpyeInfo = classInfo.getComponentType();
    System.out.println(compTpyeInfo.getName());
    System.out.println(obj2.getClass().getComponentType().getName());



  }

}