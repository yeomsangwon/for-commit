package beakjoon1;//z

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A,B,C, m,s;
		
		Scanner input=new Scanner(System.in);
		
		A=input.nextInt();
		B=input.nextInt();
		C=input.nextInt();
		
		m=A*B*C;
		int []k=new int[10] ;
		while(m!=0) {
			s=m%10;
			m=m/10;
			k[s]+=1;
			
		}
		for(int i=0; i<10;i++)
		{
			System.out.println(k[i]);
		}
		
		
	
		
	
	}
}