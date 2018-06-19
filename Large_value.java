import java.util.Scanner;

public class Large_value{

	public static void main(String[] args) {
		int Num,i,j,temp,rev,temp1;
		Scanner s=new Scanner(System.in);
		Num=s.nextInt();
		int[] array=new int[Num];
		for(i=0;i<Num;i++)
		{
			array[i]=s.nextInt();
		}
		for(i=0;i<Num;i++)
		{
			for(j=i+1;j<Num;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		i=0;
		j=Num-1;
		while(j>i)
		{
			temp1=array[i];
			array[i]=array[j];
			array[j]=temp1;
			i++;
			j--;
		}
		String str="";
		for(i=0;i<Num;i++)
		{
			str=str+array[i];
		}
		int num=Integer.parseInt(str);
		System.out.println(str);

	}

}
