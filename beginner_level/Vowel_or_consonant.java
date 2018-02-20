import java.util.Scanner;
public class Vowel_or_not{
    public static void main(String arg[]){
        
             Scanner s=new Scanner(System.in);
             int vow=0;
             char ch=s.next().charAt(0);
             char v[]={'a','e','i','o','u','A','E','I','O','U'};
             for(int i=0;i<=9;i++){
                 if(ch==v[i])
                    vow=1;
                    
            }
             if(vow==1)
                  System.out.println("Vowel");
             else
                  System.out.println("Consonant");
             
    }
}
