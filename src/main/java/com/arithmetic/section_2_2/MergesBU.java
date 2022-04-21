package com.arithmetic.section_2_2;

import com.arithmetic.Example;

/**
 * @author Scandinavian
 * @Description 自底向上的归并排序
 * @date 2022/3/28 17:12
 */
public class MergesBU extends Example {
//    // 归并的辅助数组
//    private static Comparable[] aux;
//    // merge() 方法的代码
//    public static void sort(Comparable[] a){
//        // 进行lgN次归并
//        int N=a.length;
//        aux=new Comparable[N];
//
//        // sz子数组大小
//        for (int sz=1;sz<N;sz=sz+sz){
//            // lo子数组索引
//            for (int lo=0;lo<N-sz;lo+=sz+sz){
//                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] test={1,2,3,4,5,6};
//        int k=0;
//        for (int i=0;i<test.length;i++ ){
//            System.out.println(test[k++]);
//        }
//    }
public static void merge(int[] integers,int min,int mid,int max) {
    int i=min;
    int j=mid+1;
    int[] aux=new int[integers.length];
    for (int k = 0; k < integers.length; k++) {
        aux[k]=integers[k];
    }
    for(int k=min;k<=max;k++){
        if (i>mid) {
            integers[k]=aux[j++];
        }else if (j>max) {
            integers[k]=aux[i++];
        }else if (aux[i]<aux[j]) {
            integers[k]=aux[i++];
        }else {
            integers[k]=aux[j++];
        }
    }

}
    /**
     * 自底向上归并排序
     * 外层for循环控制子序列长度
     * 内层for循环控制子序列合并
     * 归并排序算法复杂度O(N²)
     * @param integers
     * @return
     */
    public static int[] sort(int[] integers) {
        for (int i = 1; i < integers.length; i=i+i) {
            for(int j=0;j<integers.length-i;j=j+2*i){
                merge(integers, j, j+i-1, Math.min(j+2*i-1, integers.length-1));
            }
        }
        return integers;
    }
    public static void main(String[] args) {
        int[] integers = sort(new int[]{3, 9, 5, 7, 1, 4, 8});
        for (int i : integers) {
            System.out.println(i);
        }
    }
}
