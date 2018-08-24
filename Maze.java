import java.util.*;
//import java.util.ArrayList;
public class Maze{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        int n1=Maze.findCost(a,n);
        System.out.println(n1);
    }
    static int findCost(int[][] a,int n){
        int source=00;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                   arr.add((i*10)+j); 
                }
            }
        }
        int arr1[]=new int[arr.size()],j=0;
        for(int i:arr){
            arr1[j]=i;
            j++;
        }
     LinkedList<Integer> al=new LinkedList<Integer>();  
        int temp=source;
        //Set<Integer> path = new HashSet<Integer>();
        for(int i=1;i<arr1.length;i++){
            if(source+10==arr1[i]||source+1==arr1[i]){
                temp=source;
                source=arr1[i];
                
            }
            
           al.add(source);
        }
        System.out.println(al);
        return al.size();
    }
}
