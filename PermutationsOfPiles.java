import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PermutationsOfPiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),k=s.nextInt(),c=0,sum;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=0;i<n;i++){
            sum=a[i];
            if(a[i]==k){
                c++;
                continue;
            }
            for(int j=i+1;j<n;j++){
                sum=sum+a[j];
                if(sum==k){
                    c++;
                    break;
                }
                else if(sum<k)
                    continue;
                else{
                    break;
                }
            }
        }
        System.out.println(c);
    }
}

/*Siddhant likes Permutations and Combinations.

Aware of his interests, his Math professor asks him a simple question.

He gives him a pile of currency notes. He is allowed to remove a finite number of notes from the top and bottom of the pile.

What is the number of ways in which he can remove the notes such that the final pile that is left has a total currency value = k, where k is a constant?

Input Format

The first line contains N the number of notes in the pile.

The second line contains k the constant value he is interested in (refer problem statement details as above).

The third line contains N space separated positive integers (A1 through An) : the values of the currency notes from top to bottom.

Constraints:

1<=N<=105

1<=k<=1010

1<=Ai<=105

Output Format

A single positive integer: the number of ways he can remove some notes from the top and bottom such that the sum of the remaining notes in the pile = k.

Sample Input

5
3
1 2 3 4 5

Sample Output

2

Explanation

He can attain a pile of total value = 3 in 2 ways:

1. He removes notes 1 and 2 from top of pile and 4 and 5 from bottom of pile. Thus he is left with {3}.

2. He does not remove any note from the top of pile and 3,4 and 5 from bottom of pile. Thus he is left with {1,2}.*/