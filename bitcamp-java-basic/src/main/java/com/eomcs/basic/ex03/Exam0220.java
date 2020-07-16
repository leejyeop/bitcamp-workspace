package com.eomcs.basic.ex03;

class Exam0220 {
    public static void main(String[] args) {
        // 10진수에 _문자 삽입
        System.out.println(123456);
        System.out.println(1234_5678);

        //System.out.println(_12312_) 숫자 맨앞 맨뒤에 삽입할수 없다

        //8진수에 _문자를 삽입하기
        System.out.println(044);
        System.out.println(0_2_3);

        //숫자 맨앞 또는 맨 뒤에 삽입할수없다
        //System.out.println(_023_);

        //2진수 에 _문자 삽입
        System.out.println(0b0111_1010);
        System.out.println(0b01_11_11_00);
        //숫자 맨앞 또는 맨뒤에 삽입 안됨

        //16진수에 _문자 삽입
        System.out.println(0x04e);
        System.out.println(0x0f_f_a_a);
        //숫자 맨앞 또는 맨뒤에 삽입할수 없다
    }

}