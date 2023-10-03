package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class N118_프레디케이트와일치하는컬렉션내모든원소삭제 {
    public static void main(String[] args) {
        //컬렉션(ArrayList)을 사용해 주어진 프레디케이트(predicate)에 부합하는 원소를 삭제하는 방법들 소개

        //초기값 설정
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

        //1. 반복자로 삭제, Iterator로 삭제

        //2. Collection.removeIf()로 삭제
        melons.removeIf(t -> t.getWeight() < 3000);

        //3. stream으로 삭제
        List<Melon> filteredMelons = melons.stream()
                .filter(t -> t.getWeight() >= 3000)
                .collect((Collectors.toList()));

        //4. Collectors.partitioningBy()로 원소 분류
        Map<Boolean, List<Melon>> separatedMelons = melons.stream()
                .collect(Collectors.partitioningBy(
                        (Melon t) -> t.getWeight() >= 3000));
        List<Melon> weightLessThan3000 = separatedMelons.get(false); //key가 false인 애들 List로 모음
        List<Melon> weightGreaterThan3000 = separatedMelons.get(true);

        //모든 원소가 같은지 확인
        boolean allTheSame = Collections.frequency(melons, melons.get(0)) == melons.size();
    }

}
