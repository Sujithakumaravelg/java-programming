import java.util.*;
class MultiplicationOfMatrixAndItsTranspose{
	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
	    int m=s.nextInt(),n=s.nextInt();
	    int a[][]=new int[4][4],a1[][]=new int[4][4];
	    int c1[][]=new int[4][4];
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	            a[i][j]=m;
	            m+=n;
	        }
	    }
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	            a1[i][j]=a[j][i];
	        }
	    }
		int sum=0;
	    for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				sum=0;
				for(int k=0;k<4;k++){
					sum+=(a[i][k]*a1[k][j]);
					System.out.println(i+" "+j+" "+sum);
				}
				c1[i][j]=sum;
			}
		}
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	            System.out.print(c1[i][j]+" ");
	        }
	        System.out.println();
	    }

	}
}