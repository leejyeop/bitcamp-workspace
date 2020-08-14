package com.eomcs.corelib.ex03;

//테스트 1 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//인스턴스 /객체( 의 주소를)를 담을 래퍼런스 배열을 준비한다.
//인스턴스를 추가하는 add(Object) 메서드 정의한다
//특정 인덱스의 인스턴스를 리턴하는 get(int) 메서드를 정의한다
//인스턴스를 특정 위치에 삽입하는 메소드를 추가한다.
//특정위치의 값을 다른 인스턴스로 교체하는 set(int,Object)메서드를 정의한다.
//특정위치의 항목을 제거하는 remove(int)메서드를 정의한다.
//테스트 2ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//배열의 크기를 add() 할때 배열의 크기가 넘는경우, 배열의 크기를 늘린다.
//
//add(int ,Object)로 임의의 위치에 삽일할 때 배열의 크기가 작으면늘리고
//인덱스의 유효성을 검증한다. 인덱스가 유효하지않으면 예외를 발생시킨다
//
//get으로 유효하지 않은 인덱스의 값을 꺼낼때 예외를 발생시킨다.
//
//remove를 수행한다음 맨끝에 남아있는 주소를 null로설정하여
//인스턴스의 래퍼런스 카운트를 한개줄인다.
//
//set을 호출할때 인덱스가 유효하지 않으면 예외를 발생 시킨다.

//테스트 3ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//여러개의 목록을 동시에 관리할 수 있도록
//MyArrayList에 선언된 래퍼런스 배열을 스태틱 대신 인스턴스로 전환한다.
//개별적으로 관리해야 할 데이터는 인스턴스 변수를 사용해야 한다..

//캡슐화를 적용하여 공개할 맴버와 공개하지 말아야할 맴버를 구분한다.
public class MyArrayList {
  private Object[] elementData = new Object[5];
  private int size;

  public boolean add(Object e) {
    if(size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }
  private void grow() {
    System.out.println("배열을 늘리자");
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    for (int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;
  }
  public  void add(int index, Object element) {
    if(size == elementData.length) {
      grow();
    }
    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    for (int i = size; i > index ; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }
  public  Object set(int index, Object element) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  public Object remove(int index) {
    Object old = elementData[index];

    for (int i = 0; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
    size--;
    elementData[size] = null;
    //쓰지않는 인스턴스의 주소를 제거하여 가비지가 될수 있게한다.
    return old;
  }


  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return elementData[index];
  }
  public int size() {
    return this.size;
  }

}
