package com.arithmetic.section_2_1.question;

import java.util.Arrays;

/**
 * @Description: 编写一个check()方法，调用sort()对任意数组排序，如果排序成功且数组中的所有对象均没有被修改则返回为true
 * @Date: 2022/3/22
 * @Author: Everglow
 */
public class Q16 {
    public static boolean check(Comparable[] list) {
        Comparable[] newList = list.clone();
        Arrays.sort(list);
        for (int i=0;i<list.length;i++){
            if (newList[i].compareTo(list[i])==-1){
                System.out.println(newList[i]);
                System.out.println(i);
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String[] list={"a","b","d","c"};
        System.out.println(check(list));
    }
}
