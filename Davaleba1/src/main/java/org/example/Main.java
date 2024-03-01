package org.example;

public class Main {
    //shemowmeba
    public static void main(String[] args) {
        try {
            String str1 = "5+4-1+5";//13
            String str2 = "1+5+10+20-1";//35
            System.out.println(evaluateExpression(str1));
            System.out.println(evaluateExpression(str2));
        }catch (NumberFormatException exception){
            //daichers exeptions magalitad tu stringi aris "20a+10"
            System.out.println(exception.getMessage());
        }
    }

    //davaleba
    public static int evaluateExpression(String expression){
        //movatavsebt ricxvebs stringebis masivshi
        String []numArr=expression.split("[+-]");
        int index=1;//numArr -is indexi
        //sum- gaxdeba priveli ricxvi
        int num=Integer.parseInt(numArr[0]);
        //gadavirbent mtlian strings da, shevasruebt shesabamis operaciebs
        for (Character i:expression.toCharArray()) {
            if(i=='+'){
                num+=Integer.parseInt(numArr[index]);
                index++;
            }
            else if(i=='-'){
                num-=Integer.parseInt(numArr[index]);
                index++;
            }
        }
        return num;
    }
}