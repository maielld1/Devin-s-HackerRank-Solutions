/*
Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.

There are nn chapters in Lisa's workbook, numbered from 11 to nn.
The ii-th chapter has titi problems, numbered from 11 to titi.
Each page can hold up to kk problems. There are no empty pages or unnecessary spaces, so only the last page of a chapter may contain fewer than kk problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at 11.
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. Given the details for Lisa's workbook, can you count its number of special problems?

Note: See the diagram in the Explanation section for more details.

Input Format

The first line contains two integers nn and kk — the number of chapters and the maximum number of problems per page respectively. 
The second line contains nn integers t1,t2,…,tnt1,t2,…,tn, where titi denotes the number of problems in the ii-th chapter.

Constraints

1≤n,k,ti≤1001≤n,k,ti≤100
Output Format

Print the number of special problems in Lisa's workbook.

Sample Input

5 3  
4 2 6 1 10
Sample Output

4
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] prob = new int[n];
        int page=1;
        int special=0;
        for(int i=0;i<n;i++){
            prob[i]=scan.nextInt();
            int updateProblem=0;
            while(prob[i]>k){
                for(int j=0;j<k;j++){
                    updateProblem++;
                    //System.out.print(updateProblem);
                    if(page==updateProblem){
                        special++;
                    }
                }
                page++;
                prob[i]=prob[i]-k;
            }
            for(int j=0;j<prob[i];j++){
                updateProblem++;
                if(page==updateProblem){
                    special++;
                }
            }  
            page++;
        }
        System.out.println(special);
    }
}
