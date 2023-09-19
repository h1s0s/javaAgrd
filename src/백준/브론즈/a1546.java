package 백준.브론즈;

import java.util.Scanner;

public class a1546 {
    public static void main(String[] args) {
        //평균구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        int sum = 0;
        int max = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] > max) max = A[i];
            sum += A[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
