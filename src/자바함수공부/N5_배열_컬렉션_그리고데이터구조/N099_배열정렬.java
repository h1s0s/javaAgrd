package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;
import java.util.Comparator;

public class N099_배열정렬 {
    public static void main(String[] args) {
        //1. jdk에 내장된 sort() 메소드 사용
        int[] integers = new int[]{5, 1, 3};

        for(int n:integers){
            System.out.print(n+" ");
        }
        Arrays.sort(integers);
        System.out.println();
        for(int n:integers){
            System.out.print(n+" ");
        }
        System.out.println();

        //2. 객체 배열을 정리해야 할 때
        N099_Melon[] melons = new N099_Melon[]{new N099_Melon(30), new N099_Melon(10), new N099_Melon(20)};
        Arrays.sort(melons, new Comparator<N099_Melon>() {
            @Override
            public int compare(N099_Melon melon1, N099_Melon melon2){
                return Integer.compare(melon1.getWeight(), melon2.getWeight());
            }
        });
        for(N099_Melon melon:melons){
            System.out.print(melon.getWeight()+" ");
        }

        //3. 2번의 람다표현식

        //4. paralleSort() 메서드

        //5. 4번의 람다표현식
    }
}
