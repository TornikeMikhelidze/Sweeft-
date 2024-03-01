package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr={5,1,22,25,6,-1,8,10};
        int[]seq={1,6,10};
        System.out.println(isValidSequence(arr,seq));
    }

    public static boolean isValidSequence(int[] array, int[] sequence) {
        //to sequence carielia davabrunot true
        //radgan carieli simravle yvela simravlis qvesimravlea
        if (sequence.length == 0) {
            return true;
        }
        int i = 0, j = 0;
        //arrays da sequences ertdroulad
        //to erTnairi minshvnelobebi eqnebat gavzardot sequence-s indexi
        //gazrdili, davalebis mixedviT pirvelis shemdeg unda shegvxvdes meore,
        while (i < array.length && j < sequence.length) {

            if (array[i] == sequence[j]) {
                j++;
            }
            i++;
        }
        //tu j gaxdeba sequences.length is zoma nishnavs
        //rom yvela sequences wevri vipovet arrayshi tanmimdevrobit da davabrunebt trues,
        //winaaRmdeg shemtxvevasi false;
        return j == sequence.length;
    }



}