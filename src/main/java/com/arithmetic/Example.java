package com.arithmetic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Description: 排序模版
 * @Date: 2022/3/21
 * @Author: Everglow
 */
public abstract class Example {
//    private static boolean  ;

    public  static  void sort(Comparable[] a){};

    public  static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    private static Comparable[] aux; // 归并所需的辅助函数

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid)                    a[k] = aux[j++];
            else if (j > hi)                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }
    }

    static void show(Comparable[] a){
    protected static void show(Comparable[] a){
        for (int i=0;i<a.length;i++){
            StdOut.print(a[i]+"");
        }
        StdOut.print();
    }

    public static boolean isSorted(Comparable[] a){
        // 测试数组是否有序
        for (int i=1;i<a.length;i++){
            if (less(a[i],a[i-1])) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(args[0]);
        String[] a= StdIn.readAllStrings();
        sort(a);
        System.out.println(a);
//        assert isSorted(a);
        show(a);

        System.out.println(args[0]);
    }

}
