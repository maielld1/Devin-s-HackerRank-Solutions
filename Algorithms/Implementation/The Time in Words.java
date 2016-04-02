/*
Given the time in numerals we may convert it into words, as shown below:

5:005:015:105:305:405:455:475:28→ five o' clock→ one minute past five→ ten minutes past five→ half past five→ twenty minutes to six→ quarter to six→ thirteen minutes to six→ twenty eight minutes past five
5:00→ five o' clock5:01→ one minute past five5:10→ ten minutes past five5:30→ half past five5:40→ twenty minutes to six5:45→ quarter to six5:47→ thirteen minutes to six5:28→ twenty eight minutes past five
Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
HH, representing the hours
MM, representing the minutes

Constraints
1≤H<121≤H<12
0≤M<600≤M<60
Output Format

Display the time in words.

Sample Input

5  
47  
Sample Output

thirteen minutes to six
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String minutes = "";
        String hours = "";
        String[] numArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        if(m>30){
            hours = numArray[h];
            if(m==45){
                minutes = "quarter to";
            }
            else{
                m=60-m;
                if(m<20){
                    minutes=numArray[m-1] + " minutes to";
                }
                else{
                    minutes="twenty ";
                    if(m>20){
                        minutes+=numArray[(m%20)-1] + " ";
                    }
                    minutes+="minutes to";
                }
            }
        }
        else if(m<30){
            hours = numArray[h-1];
            if(m==15){
                minutes="quarter past";
            }
            else if(m==0){
                hours = numArray[h-1];
                System.out.println(hours + " o' clock");
                return;
            }
            else{
                if(m<20){
                    minutes=numArray[m-1] + " minutes past";
                }
                else{
                    minutes="twenty ";
                    if(m>20){
                        minutes+=numArray[(m%20)-1] + " ";
                    }
                    minutes+="minutes past";
                }
            }
        }
        else{
            hours = numArray[h-1];
            minutes = "half past";
        }
        System.out.println(minutes +  " " + hours);
    }
}
