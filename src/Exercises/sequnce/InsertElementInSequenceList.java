package Exercises.sequnce;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Question:
 * 已知一个顺序表 L, 其中的元素递增有序排列，设计一个算法，插入一个元素 x (x 为 int 型) 后
 * 保持该顺序表依然递增有序排列（假设插入操作总能成功）。
 * Solution:
 * step 1: 从大到小逐个扫描元素，找到当第一个比 x 大的元素时，将 x 插在逐个元素之前即可。
 * step 2: 将插入位置及其以后的元素向后移动一个位置
 * Key point:
 * 由于数组是静态的，长度在初始化之后不可该改变，因此元素往后移动有两种思路
 * 1. 新建一个数组，长度为当前数组的长度 +1，复制原始数组到新的数组之后元素后移
 * 2. 将原始数组转换成 ArrayList, 用 ArrayList.add(index, element) 来添加元素
 */
public class InsertElementInSequenceList {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 9, 10, 13, 17, 21};
        int x = 12;
        int index = findElem(arr, 12);

//        int[] result = insertElem1(arr, index, x);
        int[] result = insertElem2(arr, index, x);

        System.out.println("程序执行结果：" + Arrays.toString(result));
    }

    // 返回一个比 x 大的元素的位置
    public static int findElem(int[] arr, int x) {
        int i;
        for (i = 0; i < arr.length; ++i) {
            if (arr[i] > x) {
                return i;
            }
        }
        return i;
    }

    /**
     * Solution 1
     *
     * @param arr   初始数组
     * @param index 插入元素位置下标
     * @param x     插入元素值
     * @return 插入后的结果
     */
    public static int[] insertElem1(int[] arr, int index, int x) {
        int[] result = new int[arr.length + 1];

        // 复制原数组到新的数组
        System.arraycopy(arr, 0, result, 0, arr.length);

        for (int i = result.length - 1; i >= index; i--) {
            result[i] = result[i - 1];   // 逐步将元素后移
        }
        result[index] = x;
        return result;
    }

    /**
     * 将原始数组转换成 ArrayList, 用 ArrayList.add(index, element) 来添加元素
     * @param arr 初始数组
     * @param index 插入元素位置下标
     * @param x 插入元素值
     * @return
     */
    public static int[] insertElem2(int[] arr, int index, int x) {
        // 利用 Arrays 类的 stream 方法将 int[] 数组转为 List<Integer>
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.add(index, x);
        // 将 List<Integer> 转回 int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
