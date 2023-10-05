package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class N121_리스트원소치환 {
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apllo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

        //3000그램보다 적게 나가는 멜론을 같은 품종의 3000그램으로 바꾸고 싶을 때
        //1. for문
        for (int i = 0; i < melons.size(); i++) {
            if (melons.get(i).getWeight() < 3000) {
                melons.set(i, new Melon(melons.get(i).getType(), 3000));
            }
        }

        //2. 자바8 함수형 스타일
        UnaryOperator<Melon> operator = t -> (t.getWeight() < 3000) ? new Melon(t.getType(), 3000) : t;
        melons.replaceAll(operator);
    }
}
