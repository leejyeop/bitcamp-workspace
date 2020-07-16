//
//주제 literal 리터털 값을 해당언어로 어떻게 표현하는 문법

package com.eomcs.basic.ex03;

class Exam0100 {

    public static void main(String[] args) {
        //출력명령문
        //System.out.println("값");
        System.out.println(78);
        System.out.println(78);
        System.out.println(-78);
        System.out.println(0116);
        System.out.println(0x4e);
        System.out.println(0b01001110);
     
        //[숫자]
        //정수
        //78 +78 -78  
        //0x4e 16진수 숫자앞에 0이있어도됨 0x04e
        //0b0100 1110  맨앞의 0은 빠져도됨
        //0116 8진수 

        //부동소수점 소수점이 바뀐당
        System.out.println(3.14); //고정소수점
        System.out.println(31.4e-1); //e-1 10분의 1 
        System.out.println(314e-2);
        System.out.println(0.0314e2); //e2 *100

        //
        //[논리]
        //true-false
        System.out.println(true);
        System.out.println(false);

        //[문자]
        //문자
        System.out.println('A'); //한개문자일때 싱글 쿼테이션
        System.out.println('가');
        //문자열
       
        System.out.println("가나다");//여러문자일땐 더블ㅋ쿼테이션
        System.out.println("ABC");
        System.out.println("A");
        System.out.println("");
    }
}
