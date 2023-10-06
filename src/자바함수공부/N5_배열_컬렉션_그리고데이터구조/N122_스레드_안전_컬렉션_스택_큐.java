package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class N122_스레드_안전_컬렉션_스택_큐 {
    public static void main(String[] args) {
        //다수의 스레드에서 컬렉션/스택/큐에 접근할 가능성이 높으면 동시성과 관련된 예외도 발생하기 쉽다.
        //지금부터 자바에 내장된 다양한 동시 컬렉션들을 간략한 개요와 함께 소개하겠다.
        //122.1 동시 컬렉션
        //다행히 자바는 스레드 안전이 아닌 컬렉션을 대신할 스레드 안전 (동시) 컬렉션을 제공한다.
        //ArrayList의 스레드 안전 버전(다중 스레드)은 CopyOnWriteArrayList다.
        //구현 방법은 원소를 배열에 저장한다. 리스트를 변경하는 메서드를 호출하면 자바는 이 배열의 복제본을 변경한다.

        List<Integer> list = new CopyOnWriteArrayList<>();
        //자주 읽지만 거의 변경하지 않는 컬렉션에 사용


    }
}
