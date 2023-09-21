package 자바함수공부.N1_문자열과수_수학;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N001_문자개수세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countDuplicateCaracters1(str));
        System.out.println(countDuplicateCaracters2(str));
    }

    public static Map<Character, Integer> countDuplicateCaracters1(String str){
        Map<Character, Integer> result = new HashMap<>();
         for (int i=0; i<str.length(); i++){
             char ch = str.charAt(i);
             result.compute(ch, (k,v) -> (v==null) ? 1 : ++v);//ch 키에 값 증가, 키에 값이 null이면 1, 아니면 ++
         }
        return result;
    }

    public static Map<Character, Long> countDuplicateCaracters2(String str){
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }


}
