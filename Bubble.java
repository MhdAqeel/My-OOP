import java.util.Scanner;
public class Bubble
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lenth of your array: ");
		int len = sc.nextInt();
		int num []=new int[len];
		
		for(int i=0; i<len; i++)
		{
			System.out.print("Enter the number: ");
			num[i]=sc.nextInt();
		}
		for(int y=0; y<len; y++)
		{
			for(int j=0; j<len-1; j++)
			{
				if (num [j]>num [j+1])
				{
					int temp=0;
					temp=num [j];
					num [j]=num [j+1];
					num[j+1]=temp;
				}					
			}
		}
		for(int x=0; x<len; x++)
		{
			System.out.print(num [x]+" ");
		}
		
	}
}