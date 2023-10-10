package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴;

import java.util.function.BiFunction;

public class N167_람다요약 {
    public static void main(String[] args) {
        /*
        람다식을 분해해보면 세가지 핵심 요소로 구성된다.
        람다인자, 화살표, 람다 본문
        */

        BiFunction<Integer, Integer, Integer> plus = (A, B) -> A + B;
    }
}
