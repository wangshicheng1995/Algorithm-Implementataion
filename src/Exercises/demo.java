package Exercises;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        //原数组,初始存储5个值

        int[] array = new int[10];

        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        //输入插入位置的下标
        System.out.println("请输入插入位置的下标，有效位置0---" + (array.length - 1));

        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();

        //输入插入的值
        System.out.println("请输入需要插入元素的值");
        int num = scan.nextInt();


        //倒序
        for (int i = array.length - 1; i > index; --i) {
            //把插入位置之后的值，逐个后移
            array[i] = array[i - 1];
        }

        //添加插入的值
        array[index] = num;

        //遍历插入之后的数组
        for (int i = 0; i < array.length; ++i) {
            System.out.print(" " + array[i]);
        }
    }
}
