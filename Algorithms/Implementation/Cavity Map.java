/*
You are given a square map of size n×nn×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, nn, denoting the size of the map. Each of the following nn lines contains nn positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 
1≤n≤1001≤n≤100
Output Format

Output nn lines, denoting the resulting map. Each cavity should be replaced with character X.

Sample Input

4
1112
1912
1892
1234
Sample Output

1112
1X12
18X2
1234
Explanation

The two cells with the depth of 9 fulfill all the conditions of the Cavity definition and have been replaced by X.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int dim = scan.nextInt();
        char[][] map = new char[dim][dim];
        scan.nextLine();
        for(int i = 0; i < dim; i++){
            String rowOfNumbers = scan.nextLine();
            for(int j = 0; j < dim; j++){
                
                map[i][j] = rowOfNumbers.charAt(j);
            }
        }
        cavityMap(map);
    }
    public static void cavityMap(char[][] cavity){
        for(int l = 0; l < cavity.length; l++){
            for(int m = 0; m < cavity[l].length; m++){
                if(l!=0&&l!=cavity.length-1&&m!=0&&m!=cavity[l].length-1&&cavity[l][m]>cavity[l-1][m]&&cavity[l][m]>cavity[l+1][m]&&cavity[l][m]>cavity[l][m-1]&&cavity[l][m]>cavity[l][m+1]){
                   cavity[l][m]='X'; 
                }
                System.out.print(cavity[l][m]);
            }
            System.out.println();
        }
    }
}
