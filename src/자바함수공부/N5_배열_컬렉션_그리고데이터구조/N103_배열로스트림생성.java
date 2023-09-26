package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class N103_배열로스트림생성 {
    public static void main(String[] args) {
        //배열로 스트림을 생성하면 모든 스트림 API 접근 가능
        //스트림이란 배열의 반복적인 연산을 처리해주는 기능, 불필요한 for문 if문을 줄여주며
        //함수형 프로그래밍을 활용할 수 있게 도움을 준다
        //알아두면 좋은 연산
        String[] arr = {"One", "Two", "Three", "Four", "Five"};
        Stream<String> stream1 = Arrays.stream(arr);
        Stream<String> stream2 = Arrays.stream(arr, 0, 2);
        Stream<String> stream2_1 = Stream.<String>builder().add("Four").build(); //요소 추가
        //스트림은 수정이 불가함
        Stream<String> stream3 = Arrays.asList(arr).stream();
        Stream<String> stream4 = Arrays.asList(arr).subList(0, 2).stream();

        stream1.forEach(num -> System.out.println("stream1 = " + num));
        stream2.forEach(num -> System.out.println("stream2 = " + num));
        stream2_1.forEach(num -> System.out.println("stream2_1 = " + num));
        stream3.forEach(num -> System.out.println("stream3 = " + num));
        stream4.forEach(num -> System.out.println("stream4 = " + num));

        //스트림으로 배열 생성
//        String[] array = stream1.toArray(String[]::new);

        IntStream intStream = IntStream.range(0, 2);
        intStream.forEach(num -> System.out.println("intStream = " + num));

    }
}
