package com.beat.jdbc;

import java.util.List;

/**
 * Created by beatkirito on 2016/3/14.
 */
public class JdbcTest {

    public static void main(String[] args) {

//        int[] a = {3,2,5,6,9,1,7,4,10};
//        bubbleSort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + " ");
//        }
//
//        Math.sqrt(2);
        boolean[] bs = new boolean[10];
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }

    }

    static void bubbleSort(int[] a) {

        boolean flag = true;
        for(int i = 0; i < a.length - 1; i++) {
            flag = false;
            for (int j = a.length - 2; j >= i; j--) {
                if(a[j] > a[j+1]) {
                    a[j] ^= a[j+1];
                    a[j+1] ^= a[j];
                    a[j] ^= a[j+1];
                    flag = true;
                }
            }
        }
    }

    public void fun() {

        List<String>[] lss = new List[10];
    }
}
