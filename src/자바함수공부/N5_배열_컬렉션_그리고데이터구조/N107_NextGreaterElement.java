package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;

public class N107_NextGreaterElement {
    public static void main(String[] args) {
        //어떤 배열과 그 배열의 원소 e가 있을 때, e보다 큰 다음(오른편) 원소를 가져오기
        int[] integers = {1,2,3,4,12,2,1,4};
        //integers의 NGE는 1:2 2:3 3:4 4:12 12:-1 2:4 1:4 4:-1
        //-1은 오른편에 현재 원소보다 큰 원소가 없다는 뜻
        int nge;
        int n = integers.length;
        for (int i = 0; i < n; i++){
            nge = -1;
            for (int j = i + 1; j < n; j++){
                if (integers[i] < integers[j]){
                    nge = integers[j];
                    break;
                }
            }
            System.out.println(integers[i]+":"+nge);
        }
        Arrays.stream(integers).forEach(num -> System.out.println("integers="+num));
    }
}
