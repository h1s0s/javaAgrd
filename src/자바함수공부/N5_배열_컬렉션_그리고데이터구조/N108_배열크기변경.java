package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;

public class N108_배열크기변경 {
    public static void main(String[] args) {
        //자바에서 배열의 크기는 고정이기 때문에 필요한 크기만큼의 배열을 새로 생성해
        //배열의 값을 전부 새 배열을 복사하는 수 밖에 없지만, Arrays를 활용하면 된다
        int[] arr = {1, 2, 3};
        add(arr, 1);
    }

    public static int[] add(int[] arr, int item){
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = item;
        return newArr;
    }

    public static int[] remove(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length-1);
        return newArr;
    }

    public static int[] resize(int[] arr, int length){
        int[] newArr = Arrays.copyOf(arr, arr.length + length);
        return newArr;
    }
}
