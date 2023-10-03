package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;
import java.util.List;

public class N120_리스트로컬렉션필터링 {
    public static void main(String[] args) {
        //Collection.toArray() 메서드를 사용해 컬렉션을 배열로 변환할 수 있다.
        List<String> names = Arrays.asList("ana", "mario", "vio");
        Object[] namesArrayAsObjects = names.toArray();
        String[] namesArraysAsStrings = names.toArray(new String[names.size()]);
        System.out.println(new String[0]);

    }
}
