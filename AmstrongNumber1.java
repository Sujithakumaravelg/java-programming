import java.util.Scanner;
public class AmstrongNumber{
    public static void main(String arg[])throws Exception {
        try{
            //int n,p,rem;
            int flag;
            int sum=0;
            Scanner s=new Scanner(System.in);
            int num1 =s.nextInt(),num2 = s.nextInt(),rem;
            for(int i=num1;i<=num2;i++){
                flag=i;
                int n=i;
                while(n>0){
                    rem=n%10;
                    sum=sum+rem*rem*rem;
                    n=n/10;
                }
                if(flag==sum)
                    System.out.printf("%d ",i);
                sum=0;
            }
        } 
        catch(Exception e){
            System.out.println("enter valid value");
        }
    }
}
