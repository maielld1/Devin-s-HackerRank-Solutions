import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan  = new Scanner(System.in);
        int test = scan.nextInt();
        
        
        for(int i=0;i<test;i++){
            int size = scan.nextInt();
            int min = scan.nextInt();
            int count=0;          
            for(int j=0;j<size;j++){
                if(scan.nextInt()<=0){
                    count++;
                }
            }
            if(count>=min){
                System.out.println("NO");
            }
            else{
                System.out.println("YES"); 
            }
        }
        
    }
}
