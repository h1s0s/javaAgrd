package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;

public class N101_두배열의동등혹은불일치검사 {
    public static void main(String[] args) {
        int[] integers1 = {3, 4, 5, 6, 1, 5};
        int[] integers2 = {3, 4, 5, 6, 1, 5};
        int[] integers3 = {3, 4, 5, 6, 1, 3};

        System.out.println(Arrays.equals(integers1, integers2));
        System.out.println(Arrays.equals(integers1, integers3));
    }
}
