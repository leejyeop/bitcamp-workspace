package com.eomcs.basic.ex04;

public class Exam0810 {// 클래스 선언 
  //클래스 블록 = 클래스 정
  
  static int x;
  
  public static void main(String[] args) { //메소드 선언 
    //메소드 정의 = 메소드 블 
  
    int a;
    
    int x;//같은 블럭에 소속된 로컬변수가 아니라면 
          //같은 이름으로 변수를 선언할수잇다.
    {
      int c; //이 c 변수는 블록밖으로 나갈시 삭제된다.
      int d;
    }
    {//int a;//같은 블록에 이름이 같은 변수를 중복 선언할 수 없
    int b;
      {
      //int a; //바깥 블록에 선언된 변수와 같은 이름을 가질 수 없다 
      //int b;  바깥 블록에 선언된건 안댄 
      //로컬블록 
      
      int c = 200;
      int d = 300;// 이전블록에서 만든 cd 변수는 삭제되었기 때문에 같은 이름으로
            //변수를 만들 수 있다.
      //블록 안에 선언된 변수는 블록을 나가는 순간 자동 삭제된다.
      //따라서 이 c 변수는 위에서 선언한 하위 블록의 c변수와 다르다
      }
     
     for(int k = 0; k < 10 ; k ++) {
       System.out.println(k);
     }
     //System.out.println(k); 접근할 수 없다.
     int age = 20;
     int m =0;
     if (age > 19) {
       m = 1530;
       int n = 300;
     }
     System.out.println(m);
     //System.out.println(n);
    }
  }

}
