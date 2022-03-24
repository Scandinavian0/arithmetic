package com.arithmetic.section_2_1.question;

import java.util.*;

/**
 * @Description: 希尔排序的最坏情况。用 1 到 100 构造一个含有 100 个元素的数组并用希尔排序和递增序列 1 4 13 40 对其排序，使比较的次数尽可能多
 * @Date: 2022/3/22
 * @Author: Everglow
 */
public class Exercise19_shell {
    public static void shell(Comparable[] list, int[] times) {
        Arrays.sort(times);
        List newTimes = Arrays.asList(times);
        Collections.reverse(newTimes);

        for (int time : times) {

        }
    }

    public static int[] creatList(int start, int end) {
        int forTime = end - start + 1;
        int[] creatList = new int[forTime];
        Random random = new Random();
        boolean sign=false;
        Set set=new HashSet(forTime);
        while (true){
            if (set.size()>=forTime){
                break;
            }
            set.add(random.nextInt(forTime));
        }
        System.out.println(set);
        Iterator it = set.iterator();
        int i=0;
        while (it.hasNext()){
            creatList[i]=(int)it.next();
            i++;
        }

        return creatList;
    }

    public static void main(String[] args) {
        int[] list=creatList(1,100);
        for (int i:list){
//            System.out.println(i);
        }

    }
}
