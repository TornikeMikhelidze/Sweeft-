package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]nums1={1,4,5,6,6,6,7,8,8,8,8,9,3,4};
        int[]nums2={1,5,8,20,8,8,8,20};
        //1,5,8
        int[] arr=findInterSection(nums1,nums2);
        for (int i:arr) {
            System.out.println(i);
        }
        System.out.println();
        int[]numbers1={1,2,3,3,4,5};
        int[]numbers2={3,4,4,5,6,7};
        //3,4,5
        int[] ar1=findInterSection(numbers1,numbers2);
        for (int i:ar1) {
            System.out.println(i);
        }

    }
    //davaleba
    public static int[] findInterSection(int[]nums1,int[]nums2){
        //hashsetshi ar sheinaxeba ertnairi elementeby
       HashSet<Integer>result=new HashSet<>();
        for (Integer i:nums1) {
            for (Integer j:nums2) {
                if(i==j)result.add(i);//nums1 da nums2 saerto elementebs gadavyrit HashsetShi
            }
        }
        int index=0;
        int[]arr=new int[result.size()];
        for (Integer i:result) {
            arr[index]=i;
            index++;
        }
        return arr;
    }
}