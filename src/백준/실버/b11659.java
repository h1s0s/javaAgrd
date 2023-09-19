package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11659 {

    public static void main(String[] args) throws IOException {
        //구간 합 구하기
        //1번째 줄에 수의 개수 N(1 <= N <= 100000) 합을 구해야하는 횟수 M, N의 갯수
        //3번째 줄부터는 M개의 줄에 합을 구해야하는 구간 i와 j가 주어진다.

        //구간 합이라는 개념을 적용하는 기본적인 문제
        //구간합은 a~b까지의 합 특정 수의 나열에서 특정 구간의 합

        //1. N개의 수를 입력받음과 동시에 합 배열을 생성합니다.
        //2. 구간 i~j가 주어지면 합을 구하는 공식으로 정답을 출력합니다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //bufferedReader이 스캐너보다 연산이 빠름

        //들어오는 데이터가 10만개라고 하면 데이터가 길게 들어오기 때문에 int형으로 받기가 힘듦
        //일반적으로 스트링토크나이저를 이용해 토큰으로 값을 분리해 사용함.

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());//입력 받음

        for(int i=1; i<=suNo; i++){ //1부터 시작하는 이유는 0번째 인덱스를 뺐음
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());//입력받은거 꺼냄
        }
        for(int q=0; q<quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());//입력 받음
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

    }
}
