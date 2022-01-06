package test.class2_快排;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 7, 5, 7, 3, 5, 1, 2};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        int left_left = left;
        int right_right = right;
        int flag = arr[left];
        while (left != right) {
            while (arr[right]>=flag&&right>left){
                right--;
            }
            while (arr[left]<=flag&&right>left){
                left++;
            }
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            int numTemp = arr[left];
            arr[left]=arr[left_left];
            arr[left_left]=numTemp;

        }
    }

}
