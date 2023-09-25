package 자바함수공부.N1_문자열과수_수학;

public class N003_글자와단어뒤집기 {
    private static final String str = "HAPPY NEW YEARS";
    public static void main(String[] args) {
        System.out.println(reversedWords1(str));

    }

    private static String reversedWords1(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word: words){
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() -1; i >= 0; i--){
                reverseWord. append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(" ");
        }

        return reversedString.toString();
    }
}
