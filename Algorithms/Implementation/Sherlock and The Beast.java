/*
Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus; however, he also gives him a clue—a number, NN. Sherlock determines the key to removing the virus is to find the largest Decent Number having NN digits.

A Decent Number has the following properties:

Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
If there are more than one such number, we pick the largest one.
Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!

Constraints
1≤T≤201≤T≤20
1≤N≤1000001≤N≤100000

Input Format

The first line is an integer, TT, denoting the number of test cases.

The TT subsequent lines each contain an integer, NN, detailing the number of digits in the number.

Output Format

Print the largest Decent Number having NN digits; if no such number exists, tell Sherlock by printing -1.*/

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
