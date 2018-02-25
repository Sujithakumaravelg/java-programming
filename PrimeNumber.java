import java.util.Scanner;
public class PrimeNumber{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int num=s.nextInt();
	          int i,m=0,flag=0;      
            m=num/2;      
            if(num==0||num==1) 
                System.out.println("no");      
            else{  
                for(i=2;i<=m;i++){      
                    if(num%i==0){      
                        System.out.println("no");      
                        flag=1;      
                        break;      
                    }      
                }      
                if(flag==0)  
                    System.out.println("yes"); 
            }
        } 
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
