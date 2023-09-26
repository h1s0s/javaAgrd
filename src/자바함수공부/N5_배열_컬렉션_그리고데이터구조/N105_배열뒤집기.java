package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;
import java.util.stream.IntStream;

public class N105_배열뒤집기 {
    public static void main(String[] args) {
        int[] integers = {-1, 2, 3, 1, 4, 5, 3, 2, 22};

        //1. 배열 자체를 수정하는 방법
        for(int leftHead = 0, rightHead = integers.length -1;
        leftHead < rightHead; leftHead++, rightHead--){
            int elem = integers[leftHead];
            integers[leftHead] = integers[rightHead];
            integers[rightHead] = elem;
        }

        Arrays.stream(integers).forEach(num -> System.out.println("integers = "+num));

        //2. 함수형 방법
        int[] reversed = IntStream.rangeClosed(1, integers.length)
                .map(i -> integers[integers.length - i]).toArray();

        Arrays.stream(reversed).forEach(num -> System.out.println("reversed = "+num));
    }
}
