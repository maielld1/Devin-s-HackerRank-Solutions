import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = scan.nextInt();
            double fives=0;
            double threes=0;
            String str="";
            if(n==3||n==5||n==6||n>=8){
                if(n%3==2){
                    fives=Math.floor(n/3)-1;
                    threes=1;
                }
                else if(n%3==1){
                    fives=Math.floor(n/3)-3;
                    threes=2;
                }
                else{
                    fives=n/3;
                }

                for(int i=0;i<fives;i++){
                    str=str.concat("555");
                }
                for(int j=0;j<threes;j++){
                    str=str.concat("33333");
                }

            }
            if(n==1||n==2||n==4||n==7){
                    str="-1";
                }
            System.out.println(str);

        }
    }
}
