package Exercises;

import java.util.Arrays;

/**
 * Question:
 * 删除顺序表中下标为 p (0 <= p <= length -1) 的元素，成功返回 1，否则返回 0
 * 并将被删除元素复制给 e
 * Solution:
 * 指定删除位置后的元素左移 1 位即可
 */
public class deleteElementInSequenceList {

    static int[] arr = {4, 5, 7, 9, 10, 13, 17, 21};
    static int e = 0;
    static int[] newArr;

    public static void main(String[] args) {
        int p = 1;
        int result = deleteElem(arr, p);
        System.out.println(result == 0 ? "删除失败" : "删除成功");
        System.out.println("被删除的值为：" + e);
        System.out.println("删除后的数组元素为：" + Arrays.toString(newArr));
    }

    public static int deleteElem(int[] arr, int p) {
        if (p < 0 || p > arr.length - 1) {
            return 0;
        }
        e = arr[p];

        //元素左移
        for (int i = p; p < arr.length - 1; ++i) {
            // 当 i = 数组长度 -1 时， i + 1 会超出数组下标，因此这里先将数组最后一位赋 0，在复制到新数组时控制复制的长度为原长度- 1
            if (i == arr.length - 1) {
                arr[i] = 0;
                newArr = new int[arr.length - 1];
                System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
                break;
            }
            arr[i] = arr[i + 1];
        }
        return 1;
    }
}
