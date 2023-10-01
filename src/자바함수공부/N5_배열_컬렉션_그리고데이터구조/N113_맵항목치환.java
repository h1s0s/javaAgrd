package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class N113_맵항목치환 {
    public static void main(String[] args) {
        //1. jdk 8의 replace()
        Map<Integer, N099_Melon> mapOfMelon = new HashMap<>();
        mapOfMelon.put(1, new N099_Melon(1000));
        mapOfMelon.put(2, new N099_Melon(2000));
        mapOfMelon.put(3, new N099_Melon(3000));
        N099_Melon melon = mapOfMelon.replace(2, new N099_Melon(4000)); //기존에 들어있던 2000 멜론을 변수에 담음
        System.out.println(melon.toString());

        //2. 2번째 아규먼트의 값이 일치할때, 치환하고 성공하면 True, 실패하면 Fasle
        boolean melon2 = mapOfMelon.replace(3, new N099_Melon(3000), new N099_Melon(5000));

        //3. 무게가 1000 이상인 것들을 1000으로 치환
        BiFunction<Integer, N099_Melon, N099_Melon> function = (k, v)
                -> v.getWeight() > 1000 ? new N099_Melon(1000) : v;
        mapOfMelon.replaceAll(function);

    }
}

