package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;

public class N104_배열의최솟값과최댓값_평균 {
    public static void main(String[] args) {
        int[] integers = {2, 3, 4, 1, -4, 6, 2};

        //1. if문을 활용한 사용자 정의 메소드 사용 방식
        int maxInt1 = max(integers);

        //2. 함수형 방식
        int maxInt2 = Arrays.stream(integers).max().getAsInt();

        //3. 객체의 최댓값, 최솟값 구하기
    }

    public static int max(int[] arr){
        int max = arr[0];

        //1. if문 방식
        for (int elem: arr){
            if (elem > max){
                max = elem;
            }
        }

        return max;
    }
}
