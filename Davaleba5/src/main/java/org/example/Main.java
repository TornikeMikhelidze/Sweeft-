package org.example;

public class Main {
    public static void main(String[] args) {
        int[]arr1={6,2,2,3,4,1};
        int k1=8;//4
        int[]arr2={5,1,1,1,3};
        int k2=5;//3
        int[]arr3={5,6,1,3,3,1,9};
        int k3=2;//2
        int[]arr4={1,2,2,5,10,20};
        int k4=20;//5
        System.out.println(lenOfLongSubarr(arr1,k1));
        System.out.println(lenOfLongSubarr(arr2,k2));
        System.out.println(lenOfLongSubarr(arr3,k3));
        System.out.println(lenOfLongSubarr(arr4,k4));

    }

    //davaleba
    //miuxedavad imisa rom funqciis saxeli realurad sxva amocanas warmoadgens
    //viyeneb radgan davalebashi ase aris mititebuli
    //mag: arr=[1,2,3,4,5] subarr!=[1,4]...
    //da chven gviwevs gavitvaliswinot [1,4] shemtxvevac

    //amocanashi dashvebulia rom minimum 1 mainc sum=k
    public static int lenOfLongSubarr(int[] arr, int k) {
        int n = arr.length;
        //vqmnit or ganzomilebian masivs sadac i aris ramden elements viyenebt
        // sadac i uri striconi warmoadgens 1 dan i  elements, xolo (tu i=4 nishnavs 1 dan 4 indexamde
        // elementebs sheicavs
        //da j warmoadgens ra iqneba maqsimaluri raodenoba 1-dan i , romelta jamic tolia j-s
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                //amowmebs i j wevri tu sheidzleba iyos sum-shi
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i - 1]] + 1);
                } else {
                    //to ij elementy didia sum -ze gamovricxavt
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][k];
    }
}
