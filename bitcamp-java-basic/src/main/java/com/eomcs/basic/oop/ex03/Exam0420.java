package com.eomcs.basic.oop.ex03;

public class Exam0420 {
  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    void playmusic() {
      //음악을 출력한다.
    }

    //생성자란 ?
    //인스턴스를 만든후 사용하기 전에 적절한 값으로 초기화 시킬 필요가있다.
    //제품 을 만든후에 제품사용전 제품이 구동되는데 문제가 없도록 기본값으로 설정 되어야한다.
    //그래서 인스턴스를 사용하기 전에 적절한 값으로 초기화 시키기 위해
    //자동으로 호출되는 메서드를 도입하게 되었다 이것이 생성자다.

    //클래스 설계도에 따라 인스턴스를 생성한 후에
    //인스턴스 변수가 사용되기 전에 적절한 값으로 초기화 시키기위해
    //자동으로 호출하는 메서
    //모든 클래스는 반드시 한개 이상의 생성자를 가져야 한다.
    //생성자 문법
    //클래스명(파라미터, ....){}
    //생성자를 선언할떄는 리턴타입을 지정하지 않는다/
    //개발자가 생성자를 작성하지않으면
    //컴파일러가 기본  생성자를 자동으로 추가한다.
    //기본생성자 (default constructor)?
    //파라미터가 없는생성자
    //publicㅇ으로 공개된다
    //예 public 클래스명() {}

    //이 클래스에 생성자를 정의하지 않으면 다으모가 같이 기본생성자가 추가 된다.
    ///
  }
  public static void main(String[] args) {
    //인스턴스를 생성할때 반드시 호출될 생성자를 지정 해야한다
    //안하면 문법오류임
    //new A;
    //new + 클래스명 + (생성자에 넘겨줄 값);
    //예) new A(); 생성자에 파라미터가 없기 때문에 값을 넘겨주지 않는다.
    //예) new A(100);생성자의 파라미터가 int이기때문에 정수값을넘긴다.
    //new A();


    //다음과 같이 호출될 생성자를 지정하지 않으면 문법 오류이다.
    //SmartPhone obj1 = new SmartPhone;
    //다음과 같이 존재하지 않는 생성자를 지정하면 문법 오류이다.
    //SmartPhone obj2 = new SmartPhone(100);
    //SmartPhone 인스턴스를 만들 때 기본 생성자가 호출 되게 한
    SmartPhone obj2 = new SmartPhone();
    obj2.playmusic();

    System.out.println(obj2.bright);
    System.out.println(obj2.contrast);
    System.out.println(obj2.volume);

  }
}
