package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import javafx.geometry.Bounds;

import java.util.Comparator;
import java.util.Map;

public class N125_튜플 {
    public static void main(String[] args) {
        /*
        기본적으로 튜플은 여러 부분으로 이뤄진 데이터 구조다.
        보통 둘 또는 세부분으로 이뤄진다. 일반적으로 세 부분보다 많아야하면
        전용 클래스를 만드는 편이 낫다.
        튜플은 불변이며 결과를 여러개 반환해야 하는 메서드에 쓰인다.
        예를 들어 배열의 최솟값과 최댓값을 반환하는 메서드를 가정해보자.
        일반적으로 메서드는 둘을 함꼐 반환할 수 없으므로 튜플을 사용하면 편리하다.
        자바에서는 내장 튜플을 제공하지 않는다.
        그래도 Map의 항목을 나타내는 Map.Entry<K, V>는 지원한다.
        JDK 9부터는 Map 인터페이스에 entry(K k, V v)라는 메서드가 추가되면서
        주어진 키와 값을 포함하는 수정 불가능한 Map.Entry를 반환할 수 있게 됐다.
         */

        Melon[] melons = {
                new Melon("CrenShaw", 2200),
                new Melon("Gac", 1200)
        };
        Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);
//        Map.Entry<Melon, Melon> minmax = Bounds.array/\
    }

//    public static <T> Map.Entry<T, T> array(
//            T[] arr, Comparator<? super T> c) {
//        T min = arr[0];
//        T max = arr[0];
//        for (T elem: arr) {
//            if (c.compare(min, elem) > 0){
//                min = elem;
//            } else if (c.compare(max, elem) < 0){
//                max = elem;
//            }
//        }
//        return entry(min, max);
//    }
}
