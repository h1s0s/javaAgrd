package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;

public class N106_배열채우기와할당 {
    public static void main(String[] args) {
        //정해진 값으로 배열을 채워야 할 때
        int[] arr = new int[10];

        Arrays.fill(arr, 1);
        Arrays.stream(arr).forEach(num -> System.out.println("1arr="+num));

        //모든 인덱스에 값 더하기
        Arrays.setAll(arr, t -> {
            if (t == 0) {
                return arr[t];
            } else {
                return arr[t - 1] + 1;
            }
        });
        Arrays.stream(arr).forEach(num -> System.out.println("2arr="+num));

        //조건 병렬 수행
        Arrays.parallelSetAll(arr, t -> {
            if (arr[t] % 2 ==0){
                return arr[t] * arr[t];
            } else {
                return arr[t] - 1;
            }
        });
        Arrays.stream(arr).forEach(num -> System.out.println("3arr="+num));

    }
}
