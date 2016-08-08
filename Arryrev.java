package Logical;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args)
	{
		int n,i,k,j,m;
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the k value:");
		k=sc.nextInt();
		int h=k;
		System.out.println("Enter teh elements:");
		int[] arr=new int[n];
		for(i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			}
		for(i=0;i<n;i++)
		{
			if(k>0)
			{
				for(j=0;j<h;j++){
			m=n-k;
		System.out.print(arr[m]+" ");
		k--;
			} 
			}
		}
			for(i=0;i<n-h;i++)
			{
				System.out.print(arr[i]+" ");
			}
		
	}

}
