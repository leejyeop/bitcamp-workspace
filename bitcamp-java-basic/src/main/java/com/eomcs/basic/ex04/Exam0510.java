package com.eomcs.basic.ex04;

public class Exam0510 {
  public static void main(String[] args) {
   int[] p =new int[3]; //c언어로 표현하면 (int*)malloc(sizeof(int *3)
   //p 는 int배열의 주소를 담는변수
   //보통 래퍼런스라 부른다
   
   //new int[3]은 int 변수를 연속해서 3개 준비한다.
   //메모리를 확보한 후 리턴 값은 그메모리의 시작주소이다
   //
   //
   //배열의 개수 알아내기
   System.out.println(p.length);
   
   //배열의 주소가 없는상태에서 사용하지 말자
   int[] x;
   //System.out.println(x.length);
   
   
   //배열에 값 저장
   p[0] = 100;
   p[1] = 200;
   p[2] = 300;
   
   System.out.printf("%d %d %d\n", p[0], p[1],p[2]);
   
   //p[3] = 400;//실행 예외 발생 (runtime excption)
   //p[-1] = 500;//실행 예외 발생 
   
   int sum = 0;
   
   for (int i = 0; i < p.length; i++) {
     sum = sum + p[i];
   }
   System.out.println(sum);
   //배열 래퍼런스를 선언한는 방법
   int[] p2; //자바에서 주로사용하는방
   int p3[]; //c 언어 방식 도 사용 가능하다 단 개수를 지정해선는 안 된다.
  //단 개수를 지정해서는 안된
   p2 = p;// p래퍼런스 주소를 p2래퍼런스에 복사한다.
   
   p2[1] = 1000;
   System.out.println(p[1]);
   
   p = new int[4];
   p[1] = 2000;
   System.out.printf("%d,%d\n", p[1], p2[1]);
   
   //System.out.println(p3[1]); 래퍼런스에 값이 없어서 컴파일 오
   //new 명령으로 확보한 메모리 instance 인스턴
   //인스턴스에 주소를 저장한 변수 는 래퍼런스 reference
  //byte, int short long float double boolean char프리머티브 타입
   //프리머티브타입을 제외한 모든변수는 래퍼런스 배열변수도 래퍼런스
   
   
   //래퍼런스 변수의 주소값을 0으로 초기화 하
   //p2 = 0; //이렇게 직접적으로 초기화 시킬수 없다 
   p2 = null; // 주소변수 래퍼런스를 0으로 초기화 시키려면 null사용하라.
       
   //System.out.printf("%d %d %d", p2[0], p2[1], p2[3]); 오류
   
   //java 호환언어 kotlin 그루비
   
   
   int k1;
   int[] k2 = new int[3];
   //new 명령으로 메모리를 준비할 때
   //모든 메모리는 0으로 자동초기화 된다.
   //따라서 따로 초기화 할 필요없이 바로 사용할 수 있다.
   System.out.println(k2[0]);
   System.out.println(k2[1]);
   System.out.println(k2[2]);
   
   //배열 생성 후 즉시 초기화 하기
   int[] k3 = new int[] {100, 200, 300};
   //{}안에 값을 넣을 수 있는 int 배열을 만든 후 그 배열에  값을 넣는다.
   //배열의 개수를 지정하면 안된다 무법오류
   int[] k4;
   k4 = new int[] {10, 20};
   
   int[] k5 = {11, 12 , 13}; //new int[] {11, 12, 13};
   int[] k6;
   //k6 = {111, 112 ,113}; 변수 선언 없이는 생략 할 수 없다. 
   
   int[] x1 = new int[3];
   int[] x2 = new int[4];
   int[] x3 = x1;
   x2 = x1; //x2 가 가리켰던 int[4] 배열 메모리의 주소를 잃어버려 
   //더이상 사용할 수 없는 메모리를 가비지라 한다.
   //가비지는 자바버추얼머신이 자동으로 해제시킨다 단 바로 해제시키는것이아니라/
   //다음조건이 히당될때 해제시킨다
   //메모리가 부족할떄
   //시스템이 한참동안 핞가할 때
   //결론 언제 가비지를 메모리에서 해제시ㅣ킬지 알 수 없다.
   //가비지를 찾아 해제 시킨다 가비지 컨트롤러
   //System.gc(); 가비지콜렉터실행을 제안함 가능하다면 빠른시일내에 가비지를 수집해 줄것을 요구
   //주의 * gc를 호출한다 해서 가비지콜렉터가 바로 동작하는것은 아니다
   //가비지 콜렉터으 ㅣ실행을 앞당겨 달라고 요청하는 것이다.
   //요구를 수용여부는 JVM의 판단에 달려있다
   //따라서 gc 를 호출하면 가비지 컬렉터가 바로 실행된다고 믿지말라
   System.gc();
   
  }
}
