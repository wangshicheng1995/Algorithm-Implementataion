package Tools;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 9, 10, 13, 17, 21};
        int[] result = new int[arr.length + 1];

        System.arraycopy(arr, 0, result, 0, arr.length);

        System.out.println("数组的长度为：" + result.length);
        System.out.println(Arrays.toString(result));
    }
}
