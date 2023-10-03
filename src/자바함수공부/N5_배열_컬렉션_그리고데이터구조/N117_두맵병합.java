package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N117_두맵병합 {
    public static void main(String[] args) {
        //두개의 맵이 있을 때 두맵의 원소를 모두 포함하는 하나의 맵으로 합치는 과정.
        //키가 충돌하면 두 번째 맵의 값을 최종 맵에 포함시킨다. 물론 디자인 결정을 다르게 내릴 수 있다
        Map<Integer, Melon> melons1 = new HashMap<>();
        Map<Integer, Melon> melons2 = new HashMap<>();
        melons1.put(1, new Melon("Apollo", 3000));
        melons1.put(2, new Melon("Jade Dew", 3500));
        melons1.put(3, new Melon("Cantaloupe", 1500));
        melons2.put(3, new Melon("Apollo", 3000));
        melons2.put(4, new Melon("Jade Dew", 3500));
        melons2.put(5, new Melon("Cantaloupe", 1500));

        Arrays.stream(new Map[]{mergeMaps(melons1, melons2)}).forEach(v -> System.out.println("v:"+v));

    }

    public static <K, V> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2){
        Map<K,V> map = new HashMap<>(map1);
        map2.forEach((key, value) -> map.merge(key, value, (v1, v2) -> v2));
        return map;
    }
}
