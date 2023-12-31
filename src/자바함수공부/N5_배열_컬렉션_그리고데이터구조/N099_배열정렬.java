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
        Melon[] melons = new Melon[]{new Melon(30), new Melon(10), new Melon(20)};
        Arrays.sort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon melon1, Melon melon2){
                return Integer.compare(melon1.getWeight(), melon2.getWeight());
            }
        });
        for(Melon melon:melons){
            System.out.print(melon.getWeight()+" ");
        }

        //3. 2번의 람다표현식
        Arrays.sort(melons, (Melon melon1, Melon melon2)
                -> Integer.compare(melon1.getWeight(), melon2.getWeight()));

        //sort 메서드가 아닌 원소를 병렬로 정렬하는 paralelSort를 사용하여도 된다.
        //내림차순으로 정렬하고자 할때, sort(배열, Collections.reversOrder());을 사용
    }
}
