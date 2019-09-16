package beakjoon1;

import java.util.Scanner;

public class beakjoon2 {

	public static void main(String[] args) {
		
		int n;
	
		
	
		Scanner input= new Scanner(System.in);
		
		n=input.nextInt();
		
		int[ ] A = new int[n];
		
		for(int i=0;i<n;i++)
			A[i]=input.nextInt(); 
		
		for(int j=0;j<n-1;j++) 	
		{
			for(int i=0;i<n-1-j;i++)
				{   
				int big=0;
				int small=0;
			
				if(A[i]>A[i+1] )
					{big=A[i];
					small=A[i+1];
					A[i+1]=big;
					A[i]=small;
				
				}
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]);
		}	
		
		

	}
	

}
