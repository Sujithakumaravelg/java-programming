import java.util.Scanner;
public class ArraySum{
    public static void main(String arg[])throws Exception {
        try{
            Scanner s = new Scanner(System.in);
            int  N= s.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<N;i++){
                int a=s.nextInt();
                arr[i]=a;
            }
            int K=s.nextInt();
            int Sum=0;
            for(int i=0;i<K;i++){
                Sum=Sum+arr[i];
                
            }
            System.out.println(Sum);
		   
        } 
        catch(Exception e){
            System.out.println("enter valid number");
        }
    }
}
