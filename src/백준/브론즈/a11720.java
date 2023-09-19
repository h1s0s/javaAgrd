package 백준.브론즈;

import java.util.Scanner;

public class a11720 {
    //숫자의 합 구하기
    //N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램 작성

    //숫자의 길이 수가 1<=N<=100임, int나 long으로는 담을 수 없음
    //String으로 받고, char[]로 변환하여 문제 해결
    //문자1의 아스키코드 값은 49 '1'-48 또는, '1' - '0'과 같이 연산
    public static void main(String[] args) {
        //1. N값, 문자열 숫자 sNum 입력받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();

        //2. sNum을 char[]형 변수 cNum에 변환하여 저장하기
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        //*3. 아스키 코드를 숫자로 변환하여 합산, - '0'이나 -48을 하면 숫자로 변환됨, 잘 알아두기
        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0';
//            sum += cNum[i] - 48;
        }

        System.out.println(sum);
    }
}
