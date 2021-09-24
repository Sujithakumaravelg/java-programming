import java.util.*;
public class GeneratePin {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String str[]=sc.nextLine().split(" ");
      int n=0;
      int o[]=new int[3],s[]=new int[3],t[]=new int[3],f[]=new int[3];
      int j=0,in;
      for(int i=0;i<str.length;i++){
          in=0;
          o[j]=Integer.parseInt(""+str[i].charAt(in));
          in++;
          s[j]=Integer.parseInt(""+str[i].charAt(in));
          in++;
          t[j]=Integer.parseInt(""+str[i].charAt(in));
          in++;
          f[j]=Integer.parseInt(""+str[i].charAt(in));
          j++;
      }
      Arrays.sort(o);
      Arrays.sort(s);
      Arrays.sort(t);
      Arrays.sort(f);
      System.out.println(o[0]+""+s[2]+""+t[0]+""+f[2]);
      
    }
}

/*
input: 5496 7413 2100

Output: 2406

explaination:

2:smallest(thousand of all inputs) ==> 5,7,2
4:greatest(hundreds of all inputs) ==> 4 4 1
0:smallest(tens of all inputs) ==> 9 1 0
6:greatest(ones of all inputs) ==> 6 3 0
*/
