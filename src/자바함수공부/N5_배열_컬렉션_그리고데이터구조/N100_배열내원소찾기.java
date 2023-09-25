package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;

public class N100_배열내원소찾기 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 3, 7, 4, 1};
        //1. 배열을 순회하고 주어진 정수가 나오면 바로 반환하는 방법
        System.out.println(containsElement(numbers, 4));

        //2. Arrays.binarySearch() 메서드 사용
        //정렬된 배열에서만 동작하므로 먼저 배열을 정렬.
        //이 메서드는 주어진 키를 찾아 해당 인덱스, 없으면 음수를 반환함
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index>=0?"존재합니다":"존재하지않습니다");
    }

    public static Boolean containsElement(int[] arr, int toContain){
        for (int elem: arr){
            if (elem == toContain){
                return true;
            }
        }
        return false;
    }
}
