/*
You are given two strings, AA and BB. Find if there is a substring that appears in both AA and BB.

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer TT, the number of test cases.

Then there will be TT descriptions of the test cases. Each description contains two lines. The first line contains the string AA and the second line contains the string BB.

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.
1<=T<=101<=T<=10
1<=|A|,|B|<=1051<=|A|,|B|<=105
Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
Explanation

For the 1st test case, the letter o is common between both strings, hence the answer YES. (Furthermore, the letter l is also common, but you only need to find one common substring.) 
For the 2nd test case, hi and world do not have a common substring, hence the answer NO.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =  new Scanner(System.in);
        int test=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<test;i++){
            char[] a = scan.nextLine().toCharArray();
            char[] b = scan.nextLine().toCharArray();
            int min = Math.min(a.length,b.length);
            boolean yesorno;
            if(min==a.length){
                yesorno=containsSub(a,b);
            }
            else{
                yesorno=containsSub(b,a);
            }
            
            System.out.println(yesorno?"YES":"NO");
        }
    }
    public static boolean containsSub(char[] x, char[] y){
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0;i<x.length;i++){
            while(i<x.length-1&&x[i]==x[i+1]){
                i++;
            }
            if(new String(x).indexOf(y[i])!=-1){
                return true;
            }
        }
        return false;
    }
}
