package 개인공부;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 5, 10, 8, 12};

        for(int i = 0; i < arr.length; i++)
            for(int j = i + 1; j < arr.length; j++)
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
