package 백준.실버;

import java.util.Scanner;

public class a2018 {
    //투포인터 문제
    public static void main(String[] args) {
        //연속된 자연수의 합 구하기

        //문제 어떠한 자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1<= N <= 10,000,000)을
        //몇개의 연속된 자연수의 합으로 나타내는 가짓수를 알고싶다. 이때 사용하는 자연수는 N이어야 한다.
        //예를들어 15면, 15, 7+8, 4+5+6, 1+2+3+4+5 출력값은 4

        //투포인터의 시간 복잡도는 O(n)

        //투 포인터 이동원칙
        //1. sum > N : sum = sum - start_index; start index++; 스타트인덱스 ++
        //2. sum < N : end_index++; sum = sum + end_index;, 엔드 인덱스를 ++
        //3. sum == N : end_index++; sum = sum + end_index; count++; 합이 N인 애를 찾음, count++

        /*
            N=15, count=1 sum = 1
         */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1, sum = 1, start_index = 1, end_index = 1;

        while(end_index != N){
            if(sum > N){
                sum -= start_index; start_index++;
            } else if (sum < N) {
                end_index++; sum += end_index;
            } else if (sum == N){
                end_index++; sum += end_index; count++;
            }
        }

        System.out.println(count);
    }
}
