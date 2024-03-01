package org.example;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[]arr1={6,2,2,3,4,1};
        int k1=8;//4
        int[]arr2={5,1,1,1,3};
        int k2=5;//3
        int[]arr3={5,6,1,3,3,9};
        int k3=2;//0
        int[]arr4={1,2,2,5,10,20};
        int k4=20;//5
        System.out.println(lenOfLongSubarr(arr1,k1));
        System.out.println(lenOfLongSubarr(arr2,k2));
        System.out.println(lenOfLongSubarr(arr3,k3));
        System.out.println(lenOfLongSubarr(arr4,k4));

    }

    public static int lenOfLongSubarr(int[]array,int k) {
        List<Integer> list = Arrays.stream(array).boxed().sorted().toList();
        int left = 0;//gamoiyeneba sum is gasazrdelad
        int right = 0;//shesamcireblad sanam k ze  metia
        int maxLength=0;
        int sum =0;
        int n = list.size();
        while (right < n) {
            sum+=list.get(right);
            while (sum>k) {
                sum-=list.get(left);
                left++;
            }

            //gavigebT romels qonda udidesi sigr romlis jamic k-s udris
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
        }
        return maxLength;
    }

}
