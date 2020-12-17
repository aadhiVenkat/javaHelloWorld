package javaHelloWorld;

import java.util.Scanner;

public class RotateMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for N*N Matrix");
		int N=sc.nextInt();
		int k=1;
		int[][] Matrix=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				Matrix[i][j]=k++;
			}
		}
		//swaping diagnol
		for(int i=0;i<=N;i++)
		{
			for(int j=i;j<N;j++)
			{
				if(i==j)
					continue;
				else
					Matrix[i][j]=Matrix[i][j]+Matrix[j][i]-(Matrix[j][i]=Matrix[i][j]);							
			}			
		}
		//Transponent Matrix
		for(int i=0;i<=N-1;i++)
		{
			for(int j=0,k1=N-1;j<N/2 && k1>=N/2;j++,k1--)
			{
				Matrix[i][j]=Matrix[i][j]+Matrix[i][k1]-(Matrix[i][k1]=Matrix[i][j]);							
			}			
		}
		
		//Matrix Display
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
