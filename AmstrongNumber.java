import java.util.Scanner;
public class AmstrongNumber{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int num=s.nextInt(),m,sum=0,p,i;
            p=num;
            for(i=0;num>0;i++){
                m=num%10;
                sum=sum+m*m*m;
                num=num/10;
            }
            if(sum==p)
                System.out.println("yes");
            else
                System.out.println("no");
        } 
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
