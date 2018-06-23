import java.util.Scanner;
public class ElementEqualToIndex {
    public static void main(String args[])throws Exception {
        try{
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int arr[]=new int[n],j=0,rev[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
                if(arr[i]==i){
                    rev[j++]=arr[i];
                }
            }
            for(int i=0;i<j;i++){
                System.out.print(rev[i]+"\t");
            }
            if(j==0){
                System.out.println(-1);
            }
        }
        catch(Exception e){
            System.out.println("Enter valid value");
        }
    }
}
