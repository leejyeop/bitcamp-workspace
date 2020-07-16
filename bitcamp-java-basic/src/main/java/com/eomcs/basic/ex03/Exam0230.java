//
//주제 메모리크기에 따른 표기법

package com.eomcs.basic.ex03;

class Exam0230 {

    public static void main(String[] args) {
        //출력명령문
        //System.out.println("값");
        //
        //자바의 기본 정수값을 저장하는 메모리 크기:4byte
        //2^32 =4,294,967,296-1     -2,147,483,648 ~ +2,147,483,647
        //System.out.println(2_147_483_648);
        //System.out.println(-2_147_483_649);

        //8바이트 메모리를 사용하는 정수 리터럴
        System.out.println(2_147_483_648L);
        System.out.println(-2_147_483_649L);

        //8바이트 메모리를 사용하는 정수 리터럴
        System.out.println(1); //4 바이트 메모리를 사용하는 1
        System.out.println(1L); //8 바이트 메모리를 사용하는 1

        System.out.println(Integer.MAX_VALUE); //4바이트 정수 최대값
        System.out.println(Integer.MIN_VALUE); //4바이트 정수 최소값
        System.out.println(Long.MAX_VALUE);//8바이트 최대 값
        System.out.println(Long.MIN_VALUE);//8바이트 최소 값
        

    }
}
