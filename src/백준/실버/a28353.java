package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class a28353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int min_index=0, max_index=N-1, count=0;
        while(min_index < max_index){
            int temp = A[min_index] + A[max_index];
            if(temp>K){
                max_index--;
            } else if(temp<K){
                count++; min_index++; max_index--;
            } else if(temp==K){
                count++; max_index--; min_index++;
            }
        }
        System.out.println(count);
    }
}
