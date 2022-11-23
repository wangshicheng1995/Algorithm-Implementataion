package Exercises.linkedList;

import java.util.Collections;
import java.util.LinkedList;

/**
 * A 和 B 是两个单链表（带表头结点），其中元素递增有序。设计一个算法，将 A 和 B 归并成一个按元素值非递减有序的链表 C,
 * C 由 A 和 B 中的结点组成。
 */
public class TwoSortedLinkedListMerge {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        Collections.addAll(a, 2, 4, 6, 8);

        LinkedList<Integer> b = new LinkedList<>();
        Collections.addAll(b, 3, 5, 7, 9);

        LinkedList<Integer> c = new LinkedList<>();
        Collections.addAll(b, 1);

        LinkedList<Integer> result = merge(a, b, c);
        for (Integer integer : result) {
            System.out.println(integer);
        }

    }

    public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
        // p 来记录 a 的最小值
        int p = a.get(0);
        // q 来记录 b 的最小值
        int q = b.get(0);
        // r 记录 c 的最后一个下标
        int r = c.size() -1;
        return null;
    }
}
