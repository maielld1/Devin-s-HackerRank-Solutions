/*
Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, KK, making it unreadable by his enemies. Given a string, SS, and a number, KK, encrypt SS and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format

The first line contains an integer, NN, which is the length of the unencrypted string. 
The second line contains the unencrypted string, SS. 
The third line contains the integer encryption key, KK, which is the number of letters to rotate.

Constraints 
1≤N≤1001≤N≤100 
0≤K≤1000≤K≤100 
SS is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.

Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb
Explanation

Each unencrypted letter is replaced with the letter occurring KK spaces after it when listed alphabetically. Think of the alphabet as being both case-sensitive and circular; if KK rotates past the end of the alphabet, it loops back to the beginning (i.e.: the letter after zz is aa, and the letter after ZZ is AA).

Selected Examples: 
mm (ASCII 109) becomes oo (ASCII 111). 
ii (ASCII 105) becomes kk (ASCII 107). 
−− remains the same, as symbols are not encoded. 
OO (ASCII 79) becomes QQ (ASCII 81). 
zz (ASCII 122) becomes bb (ASCII 98); because zz is the last letter of the alphabet, aa (ASCII 97) is the next letter after it in lower-case rotation.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        while(k>25){
                k=k-26;
            }
        
        for(int i=0;i<s.length();i++){
            int ascii=(int)s.charAt(i);
            if((ascii<65||(ascii>90&&ascii<97)||ascii>122)){
                System.out.print(s.charAt(i));
            }
            else if(ascii>64&&ascii<91){
                if(ascii+k>90){
                   int upper=k-(90-ascii);
                   System.out.print(Character.toString((char)(64+upper))); 
                }
                else{
                    System.out.print(Character.toString((char)(ascii+k)));
                }
            }
            else if(ascii>96&&ascii<123){
                if(ascii+k>122){
                    int lower=k-(122-ascii);
                    System.out.print(Character.toString((char)(96+lower))); 
                }
                else{
                    System.out.print(Character.toString((char)(ascii+k)));
                } 
            }
            
        }
    }
}
