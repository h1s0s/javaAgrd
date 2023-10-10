package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N172_옵저버패턴구현;

@FunctionalInterface
//@FunctionalInterface는 자바 어노테이션(annotation)으로,
// 함수형 인터페이스를 선언할 때 사용됩니다.
// 함수형 인터페이스는 딱 하나의 추상 메서드를 가지는 인터페이스를 의미하며,
// 함수형 프로그래밍에서 중요한 개념 중 하나입니다.
public interface FireObserver {
    void fire(String address);
}
