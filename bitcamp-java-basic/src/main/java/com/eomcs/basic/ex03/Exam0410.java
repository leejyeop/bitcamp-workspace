package com.eomcs.basic.ex03;

//# 문자리터럴 

public class Exam0410 {
  public static void main(String[] args) {
    
    
    System.out.println('A'); //0x0041
    System.out.println('까');  //0xac00
    System.out.println('\u0041'); //유니코드값을 직접 지
    System.out.println('\u4eba');
    //println()출력값으로 문자 코드가 주어지면 해당코드의 문자를 폰트파일에서 찾아 출력한다.
    //만약폰트파일에 해당코드의 문자가 없으면 출력하지 못한다.
    //그냥숫자출력일반정수값으로 출력한다
    System.out.println(0x0041);
    
    
  }
}    
//문자를 메모리에 저장하려면 2진수로 바꿀 수 있어야 한다
//문자를 2진수로 바꾸는 규칙 "문자집합(Character Set)"이라 한다.
//문자집합에는 여러 규칙이 있다 ASCII(7비트) 'A' = 0100_0001 = Ox41  '1(문자)' = 0011_0001 = 0x31
//ASCII에서 한글(11172)은 정의도어있지않다
//,ISO-8859-1(8비트)    ASCII+유럽 문자 
//,EUC-KR(KSC-5601)(16비트), 한글 2350자에대한 규칙추가됨 '가' = 1011_0000_1010_0001 =0xb0_a1
//현대 통용도는 한글 11172자를 모두 ㅍ현할수 없
//UNICODE(ISO 10646),(영어 한글 모두 2바이트로 표현)
//일반적으 대부분든 국가의 문자를 달고있다 'A' = 0x0041 'B' = 0x0042 '1' = 0x0031 '가' =0xac00
//한글은 새로 정의했기때문에 EUC-KR과 호환되지않느다
//UTF-8(8비트~32비트)Universal Coded Character Set + Transformation Format – 8-bit 의 약자 )라는 규칙이있다
//Unicode에 있는  문자를 규칙에 따라 1~4바이트로 변환한 규칙이다.
//ISO-8859-1(영어숫자특수문자):1바이트로표현한다
//한글:3바이트로 표현한다 'A'= 0x41 'B' = 0x42  '1'= 0x31 '가'= 0xac00(1010_1100_0000_0000 ,Unicode =>1110xxxx_10xxxxxx_10xxxxxx)
//11101010_10110000_10000000 =>0xea_b0_80(UTF-8)
//UTF-8은 문자에따라 바이트 크기가 다르다.
//기존의 ISO-8859-1 은 1바이트로 표현한다.
//한글은 규칙에 따라 3바이트로 변환한다.