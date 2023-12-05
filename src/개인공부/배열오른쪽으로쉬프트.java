package 개인공부;

public class 배열오른쪽으로쉬프트 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        solution(arr, 2);
        for(int a : arr){
            System.out.print(a);
        }
    }

    private static void solution(int[] A, int K){
        int n = A.length-1;

        while(K > 0){
            int tmp = A[n];
            for(int i=n-1; i>=0; i--){
                A[i+1] = A[i];
            }
            A[0] = tmp;
            K--;
        }

    }
}
