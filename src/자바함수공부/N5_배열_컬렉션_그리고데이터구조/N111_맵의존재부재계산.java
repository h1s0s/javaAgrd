package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class N111_맵의존재부재계산 {
    public static void main(String[] args) throws UnknownHostException {
        //Map의 항목을 바로 가져다 쓸 수 없을 때가 있다.

        //예제1. computeIfPresent()
        Map<String, String> map1 = new HashMap<>();
        map1.put("postgresql", "127.0.0.1");
        map1.put("mysql", "192.168.0.50");

        //MySQL의 JDBC URL을 만들고 싶다고 하면,
        //맵에 mysql 키가 있으면 대응하는 값을 가져와
        //JDBC URL인 jdbc:mysql://192.168.0.50//유저id
        //를 계산한다. 반면 맵에 mysql키가 없으면 null이다.
        //덧붙여 계산 결과가 null이면 맵에서 항목을 삭제하고 싶다.
        BiFunction<String, String, String> jdbcUrl
                = (k, v) -> "jdbc" + k + "://" + v + "/customers_db";

        String mySqlJdbcUrl = map1.computeIfPresent("mysql", jdbcUrl);
        String oracleJdbcUrl = map1.computeIfPresent("oracle", jdbcUrl); //key값이 없으면 null
        System.out.println(mySqlJdbcUrl); //jdbcmysql://192.168.0.50/customers_db
        System.out.println(oracleJdbcUrl); //null

        //예제2. computeIfAbsent()
        //몽고DB의 JDBC의 URL을 만들고 싶다고 하자.
        //맵에 mongodb 키가 있으면 다른 계산 없이 대응하는 값을 반환하고
        //맵에 키가 없으면 이 키와 현재 IP로 값을 계산해 맵에 추가한다.
        //계산 결과가 null이면 맵은 바뀌지 않는다

        String address = InetAddress.getLocalHost().getHostAddress();
        Function<String, String> jdbcUrl2 = k -> k + "://" + address + "/customers_db";

        String mongodbJdbcUrl = map1.computeIfAbsent("mongodb", jdbcUrl2);

        //맵에 몽고db가 없으니 계산해서 map에 추가되었다.

        //예제3. compute()

        //예제4. merge()

        //예제5. putIfAbsent()

    }
}
