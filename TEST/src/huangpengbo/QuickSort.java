package huangpengbo;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 34, 23, 45, 2, 65, 74, 241};
        QKSORT(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void QKSORT(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int one = i;
        int end = j;
        int standards = arr[i];
        while (i != j) {
            while (j > i && arr[j] >= standards) {
                j--;
            }
            while (j > i && arr[i] <= standards) {
                i++;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        //基准数归位
        int t = arr[i];
        arr[i] = arr[one];
        arr[one] = t;
        QKSORT(arr, one, j - 1);
        QKSORT(arr, j + 1, end);
    }
}
