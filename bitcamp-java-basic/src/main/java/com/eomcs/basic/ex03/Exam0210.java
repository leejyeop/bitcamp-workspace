package com.eomcs.basic.ex03;

class Exam0210 {
    public static void main(String[] args) {
    //10진수 리터럴
    //-코드에서 일반적으로 정수 값을 표현할 때 사용
    System.out.println(100);

    //8진수 리터럴
    // -코드를 작성할 때 잘 사용하지 않는다.
    // - 0으로 시작해야 한다.
    System.out.println(0144); //64+32+4

    //2진수 리터럴
    // 메모리의 상태를 직설적으로 보여주고 싶을때 사용
    // 0b 또는 0B로 시작한다.
    System.out.println(0b1101_0010);
    System.out.println(0b111_0100); //맨앞자리가 0일경우 생략해도됨

    //16진수 리터럴
    //2진수를 간결하게 표현하기 위해 사용
    System.out.println(0x4e);
    System.out.println(0x03f); //숫자앞에 0이 있어도 된다.

    }

}