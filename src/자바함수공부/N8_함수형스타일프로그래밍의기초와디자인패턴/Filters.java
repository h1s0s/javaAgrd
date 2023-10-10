package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    public static List<Melon> filterByType(
            List<Melon> melons, String type
    ) {
        List<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon != null && type.equalsIgnoreCase(melon.getType())) {
                result.add(melon);
            }
        }

        return result;
    }

    public static List<Melon> filterByWeight(
            List<Melon> melons, int weight
    ){
        List<Melon> result = new ArrayList<>();

        for (Melon melon: melons){
            if (melon != null && melon.getWeight() == weight){
                result.add(melon);
            }
        }
        return result;
    }

    public static List<Melon> filterByTypeAndWeight(
            List<Melon> melons, String type, int weight
    ) {
        List<Melon> result = new ArrayList<>();
        for (Melon melon: melons) {
            if (melon != null && type.equalsIgnoreCase(melon.getType())//equlasIgnoreCase() <- 대소문자 무시
            && melon.getWeight() == weight) {
                result.add(melon);
            }
        }

        return result;
    }
}
