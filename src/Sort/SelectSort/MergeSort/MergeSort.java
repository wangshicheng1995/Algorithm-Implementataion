package Sort.SelectSort.MergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27};
    }

    public static void sort(int A[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(A, low, mid);  // 归并排序前半段
            sort(A, mid +1, high);  // 归并排序后半段

        }

    }

    public static void merge() {

    }
}
