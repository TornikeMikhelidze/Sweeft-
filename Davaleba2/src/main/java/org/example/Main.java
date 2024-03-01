package org.example;
import java.util.*;

public class Main {
    //shemowmeba
    public static void main(String[] args) {
       List<String>strings=new ArrayList<>();
       strings.add("abbcc");
       strings.add("abc");
       strings.add("abcabc");
       strings.add("cabcbb");
       System.out.println(numberOfHappyStrings(strings));
    }

    //davaleba
    public static int numberOfHappyStrings(List<String>strings){
        boolean isHappy;
        int counter=0;
        for (int i = 0; i <strings.size() ; i++) {
            isHappy=true;
            for (int j = 0; j <strings.get(i).length()-1 ; j++) {
                //vamowmebt nebismyeri mezobeli simbolo to ertnairia
                if(strings.get(i).charAt(j)==strings.get(i).charAt(j+1)){
                    //tu yvela mezobeli gansxvavebuli ar aris, stringi ar yofila bedniery
                    isHappy=false;
                    break;
                }
            }
            //Tu isHappy -true darcha, nishnavs rom stringi bednieria
            if(isHappy)counter++;
        }
        return counter;
    }
}