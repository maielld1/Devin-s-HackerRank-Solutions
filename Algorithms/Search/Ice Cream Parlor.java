/*
Sunny and Johnny together have MM dollars they want to spend on ice cream. The parlor offers NN flavors, and they want to choose two flavors so that they end up spending the whole amount.

You are given the cost of these flavors. The cost of the iithth flavor is denoted by ccii. You have to display the indices of the two flavors whose sum is MM.

Input Format

The first line of the input contains TT; TT test cases follow. 
Each test case follows the format detailed below: The first line contains MM. The second line contains NN. The third line contains NN space-separated integers denoting the price of each flavor. Here, the iithth integer denotes ccii.

Output Format

Output two integers, each of which is a valid index of a flavor. The lower index must be printed first. Indices are indexed from 11 to NN.

Constraints

1≤T≤501≤T≤50 
2≤M≤100002≤M≤10000 
2≤N≤100002≤N≤10000 
1≤c1≤cii ≤10000,where i∈[1,N]≤10000,where i∈[1,N] 
The prices of any two items may be the same and each test case has a unique solution.

Sample Input

2
4
5
1 4 5 3 2
4
4
2 2 4 3
Sample Output

1 4
1 2
Explanation

The sample input has two test cases. 
For the 1st, the amount M = 4 and there are 5 flavors at the store. The flavors indexed at 1 and 4 sum up to 4. 
For the 2nd test case, the amount M = 4 and the flavors indexed at 1 and 2 sum up to 4.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            int M = scan.nextInt();
            int n = scan.nextInt();
            int[] c=new int[n];
            for(int j=0;j<n;j++){
                c[j]=scan.nextInt();
            }
            int c1 = 0;
            int c2 = 0;
            boolean flag = false;
            for(int m=0;m<n;m++){
                for(int k =1;k<n;k++){
                    if(c[m]+c[k]==M&&m!=k){
                        c1 = m+1;
                        c2 = k+1;
                        flag = true;
                        break;
                    }
                } 
                if(flag==true){
                    break;
                }
            }
            System.out.println(c1<c2?(c1+" "+c2):(c2+" "+c1));
        }
    }
}
