package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.HashMap;
import java.util.Map;

public class N112_맵에서삭제 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "postgresql");
        map.put(2, "mysql");
        map.put(3, "derby");

        //키를 이용해 삭제할때는 map.remobe(key)를 사용하면 된다.
        //이 메서드는 키에 해당하는 항목을 성공적으로 삭제하면 그 값을, 그렇지 않으면 null을 반환한다.

        //JDK8부터는 remove() 플래그 메서드가 추가되어
        boolean r1 = map.remove(2, "mysql");
        //키와 값이 일치할때에만 항목을 지우게 true, false를 반환

        //Map을 순회하며 삭제하는 방법.
        map.entrySet().removeIf(e -> e.getValue().equals("mysql"));

    }
}
