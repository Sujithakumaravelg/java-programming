import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  Find_no_of_char_present_in_all_the_given_str{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),count,c=0;
        String str[]=new String[n],op="";
        for(int i=0;i<n;i++){
            str[i]=s.next();
        }
        for (int i=0; i<str[0].length(); i++) { 
            int j;
            for (j=0; j<i; j++)  
                if (str[0].charAt(i) == str[0].charAt(j)) 
                    break; 
       
            if (j == i) 
                op+=str[0].charAt(i); 
        }
        for(int i=0;i<op.length();i++){
            char ch=op.charAt(i);
            count=1;
            for(int j=1;j<str.length;j++){
                for(int k=0;k<str[j].length();k++){
                    if(str[j].charAt(k)==ch){
                        count++;
                        break;
                    }
                }
            }
            if(count==n){
                c++;
            }
        }
        System.out.println(c);
    }
}

/*
John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lowercase latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a 'gem-element' if it occurs at least once in each of the rocks.

Given the list of rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of N, the number of rocks. Each of the next N lines contain rocks' composition. Each composition consists of lowercase letters of English alphabet.

Output Format

Print the number of gem-elements that are common in these rocks.

Constraints

1 ≤ N ≤ 100

Each composition consists of only small latin letters ('a'-'z').

1 ≤ Length of each composition ≤ 100

Sample Input

3

abcdde

baccd

eeabg

Sample Output

2

Explanation

Only "a", "b" are the two kind of gem-elements, since these are the only characters that occur in each of the rocks' composition.
*/