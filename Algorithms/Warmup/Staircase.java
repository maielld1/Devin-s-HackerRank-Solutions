import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            String ret="";
            for(int j=n-i-1;j>0;j--){
                ret=ret+" ";
            }
            for(int k=n-ret.length();k>0;k--){
                ret=ret+"#";
            }
            System.out.println(ret);
        }
    }
}
