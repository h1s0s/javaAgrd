package 개인공부;

import java.util.HashSet;
import java.util.Set;

public class 중복없는배열 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9};

        Set<Integer> set = new HashSet<>();
        for(int value:originalArray){
            set.add(value);
        }
        for(int value:set){
            System.out.print(value);;
        }

    }
}
