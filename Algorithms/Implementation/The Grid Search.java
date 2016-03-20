/*
Given a 2D array of digits, try to find the occurrence of a given 2D pattern of digits. For example, consider the following 2D matrix:

1234567890  
0987654321  
1111111111  
1111111111  
2222222222  
Assume we need to look for the following 2D pattern:

876543  
111111  
111111
If we scan through the original array, we observe that the 2D pattern begins at the second row and the third column of the larger grid (the 88 in the second row and third column of the larger grid is the top-left corner of the pattern we are searching for).

So, a 2D pattern of PP digits is said to be present in a larger grid GG, if the latter contains a contiguous, rectangular 2D grid of digits matching with the pattern PP, similar to the example shown above.

Input Format 
The first line contains an integer, TT, which is the number of test cases. TT test cases follow, each having a structure as described below: 
The first line contains two space-separated integers, RR and CC, indicating the number of rows and columns in the grid GG, respectively. 
This is followed by RR lines, each with a string of CC digits, which represent the grid GG. 
The following line contains two space-separated integers, rr and cc, indicating the number of rows and columns in the pattern grid PP. 
This is followed by rr lines, each with a string of cc digits, which represent the pattern PP.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i=0;i<test;i++){
            int Rows = scan.nextInt();
            int Cols = scan.nextInt();
            int[][] Grid = new int[Rows][Cols];
            scan.nextLine();
            for(int j = 0; j < Rows; j++){
                String rowOfNumbers = scan.nextLine();
                for(int k = 0; k < Cols; k++){
                    Grid[j][k] = Character.getNumericValue(rowOfNumbers.charAt(k));
                }
            }
            int r = scan.nextInt();
            int c = scan.nextInt();
            int[][] Pattern = new int[r][c];
            scan.nextLine();
            for(int l=0;l<r;l++){
                String rowOfNums = scan.nextLine();
                for(int m=0;m<c;m++){
                    Pattern[l][m]=Character.getNumericValue(rowOfNums.charAt(m));
                }
            }
            System.out.println(findPattern(Grid, Pattern));
        }
        
    }
    public static String findPattern(int[][] grid, int[][] pattern){
        // R, C, r, & c are the same letters used in the problem
        for(int R = 0; R < grid.length - pattern.length + 1; R++){
            for(int C = 0; C < grid[0].length - pattern[0].length + 1; C++){
                outerLoop:
                for(int r = 0; r < pattern.length; r++){
                    for(int c = 0; c < pattern[0].length; c++){
                        if(grid[R + r][C + c] != pattern[r][c]){
                            break outerLoop;
                        }
                    }
                    if(r == pattern.length - 1){
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }
}
