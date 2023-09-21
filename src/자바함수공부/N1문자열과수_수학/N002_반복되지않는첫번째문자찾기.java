package 자바함수공부.N1문자열과수_수학;

import java.util.LinkedHashMap;
import java.util.Map;

public class N002_반복되지않는첫번째문자찾기 {
    public static void main(String[] args) {

    }
    public static char firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            chars.compute(ch, (k, v) -> (v==null) ? 1 : ++v);
        }
        //순회해서 글자 갯수 카운트 한다음, value 1인거 찾아서 리턴
        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE; //char데이터 타입 최솟값 상수임, 0을 리턴함
    }
}
