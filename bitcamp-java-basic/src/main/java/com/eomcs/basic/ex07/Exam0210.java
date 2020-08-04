package com.eomcs.basic.ex07;

public class Exam0210 {
  public static void main(String[] args) {
    m1();
    m2("홍길동");
    String massage = m3();
    System.out.println(massage);

    massage = m3();
    System.out.println(massage);

    m3();

    massage = m4("홍길동");
    System.out.println(massage);
    massage = m5("홍길동", 20, false);
    System.out.println(massage);

    m6("홍길동", 100 , 90 , 80);
    int[] values = new int[] {100,90,80,70,60,50};
    m7("홍길동", values);
    m7("홍길동", new int[] {100,90,80,70,60,50});
    System.out.println("---------------------");
    m8("홍길동", 100,240,1230);
    m8("홍길동", 102,10,123);
    m8("홍길동");
    m10(new int[] {100,20,40} ,new String[] {"국어","영어","수학"},"");
    //int aver = m6("홍길동")
    //massage = m3(100);
    //m2();
    //m1("100");
    //int r = m1();
    //m2(100);
    //int r  = m2("홍길동");
    //int sum;
    //sum = puls(2,3);
    int result = plus(2, 3);
    result = plus(plus(plus(2, 3), 4), 5);
    System.out.println(result);

    System.out.printf("100 + 200 = %d\n", plus(100, 200));

  }
  static void m1() {
    System.out.println("Hello");
  }
  static void m2(String name) {
    System.out.println(name + " 님 반갑습니다.");
  }
  static String m3() {
    return "안녕";
  }
  static String m4(String name) {
    return name + "님 반갑습니다..";
  }
  static String m5(String name, int age, boolean working) {
    return age + "살" + name + "님은 현재 재직상태가 " + working + "입니다";
  }
  static void m6(String name, int a ,int b,int c) {
    int sum = a + b + c;
    int aver = sum/3;

    System.out.printf("%s: %d(%d)\n",name, sum, aver);
  }
  static void m7(String name, int[] scores) {
    int sum = 0;
    for (int i =0; i < scores.length; i++) {
      sum += scores[i];
    }
    //    int aver = sum/scores.length;
    int aver = 0;
    if (scores.length > 0) {
      aver = sum /scores.length;
    }
    System.out.printf("%s: %d(%d)\n",name, sum, aver);
  }
  static void m8(String name, int... scores) {
    int sum = 0;
    for (int i =0; i < scores.length; i++) {
      sum += scores[i];
    }
    //    int aver = sum/scores.length;
    int aver = 0;
    if (scores.length > 0) {
      aver = sum /scores.length;
    }
    System.out.printf("%s: %d(%d)\n",name, sum, aver);
  }
  //  static void m9(int...is scores, String name) {
  //    //가변파라미터는 맨끝에와야한다
  //  }
  //  static void m9(int... scores,int... scores2) {
  //    //가변파라미터는 맨끝에와야한다
  //    //가변 파라미터는 여러개 선언할 수 없다.
  //    //m9(100,90,80);
  //    //가변 파라미터 중간에 다른타입의 변수가 오더라도 가변파라미터를 두개이상  둘 수 없다.
  //
  //  }
  //  static void m10(String... titles,String name, int... scores) {
  //    m9("홍길동",100,20);
  //  }
  static void m10(int[] scores, String[] titles ,String name) {
    if (scores.length != titles.length) {
      System.out.println("과목 수와 점수의 개수가 다릅니다.");
      return;

    }
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s = %d 점\n", titles[i],scores[i]);
    }
  }
  static int plus(int a,int b) {
    return a + b;
  }

}
