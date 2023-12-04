package 개인공부;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 5, 10, 8, 12};
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // 피벗을 기준으로 분할된 부분 배열을 각각 재귀적으로 정렬합니다.
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = (low + high) / 2;
        int pivotValue = arr[pivot];
        int left = low;
        int right = high;

        while (left <= right) {
            while (arr[left] < pivotValue) {
                left++;
            }
            while (arr[right] > pivotValue) {
                right--;
            }
            if (left <= right) {
                // left와 right의 값 교환
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
