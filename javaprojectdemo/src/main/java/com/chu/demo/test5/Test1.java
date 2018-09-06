package com.chu.demo.test5;

import java.io.FileNotFoundException;

public class Test1 {

    public static void main(String[] args) throws FileNotFoundException {
    	Integer[] in = {0,2,878,44,23,12};
    	insertSort(in);
    }
    
    public static void insertSort(Integer[] in) {
        int tem = 0;
        for (int i = 0; i < in .length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if ( in [j + 1] < in [j]) {
                    tem = in [j + 1]; 
                    in [j + 1] = in [j]; 
                    in [j] = tem; 
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < in .length; i++) {
            System.out.print( in [i]);
            if (i < in .length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
