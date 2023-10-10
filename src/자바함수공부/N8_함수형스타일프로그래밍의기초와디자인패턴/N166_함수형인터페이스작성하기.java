package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴;

import java.util.ArrayList;
import java.util.List;

public class N166_함수형인터페이스작성하기 {
    public static void main(String[] args) {
        /*
        * 리스트를 필터링 해주는 함수형 인터페이스 Filter를 만들어보자.
        * 이러한 방식을 전략 디자인 패턴이라고 부른다.
        * 같은 목적의 알고리즘군을 정의하고 각 알고리즘을 캡슐화하여 상호 교환이 가능하게 한다.
        * */
        //1. 품종에 따라 멜론 필터링
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Balian", 3000, "hi"));
        List<Melon> bailans = Filters.filterByType(melons, "Bailan");
    }



}

