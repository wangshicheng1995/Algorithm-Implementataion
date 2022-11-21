package Sort.SelectSort;

import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27, 49};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int R[], int n) {
        int i, j, k;
        int temp;
        for (i = 0; i < n; ++i) {
            k = i;
            // 循环算法的关键，从无序序列中挑出一个最小的关键字
            for (j = i + 1; j < n; ++j) {
                if (R[k] > R[j]) {
                    k = j;
                }
            }

            // 最小关键字与无序序列第一个关键字交换
            temp = R[i];
            R[i] = R[k];
            R[k] = temp;
        }
    }
}
