package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.HashMap;
import java.util.Map;

public class N110_기본값매핑 {
    public static void main(String[] args) {
        //map에서 주어진 키를 찾지 못했을때 반환하는 기본값을 매핑하는 방법
        Map<String, String> dbMap = new HashMap<>();
        dbMap.put("postgresql", "127.0.0.1:5432");
        dbMap.put("mysql", "192.168.0.50:3306");
        dbMap.put("cassandra", "192.168.1.5:9042");

        dbMap.get("derby"); //null

        //더비 DB가 맵에 없기 때문에 null임, 하지만 원하는 결과가 아님
        //아래 메소드를 사용하여 null값 방지
        dbMap.getOrDefault("derby", "69:89.31.226:27017");

    }
}
