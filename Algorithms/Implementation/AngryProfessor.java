/*
A Discrete Mathematics professor has a class of NN students. Frustrated with their lack of discipline, he decides to cancel class if fewer than KK students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.

Input Format

The first line of input contains TT, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, NN (students in the class) and KK (the cancelation threshold). 
The second line contains NN space-separated integers (a1,a2,…,aNa1,a2,…,aN) describing the arrival times for each student.

Note: Non-positive arrival times (ai≤0ai≤0) indicate the student arrived early or on time; positive arrival times (ai>0ai>0) indicate the student arrived aiai minutes late.

Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.*/

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
