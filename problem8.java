/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int A[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        A[i]=sc.nextInt();
		    }
		    int B[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        B[i]=sc.nextInt();
		    }
		    int a=0,b=0,sumA=0,sumB=0;
		    for(int i=0;i<n;i++)
		    {
		        if(A[i]==0){
		            a=0;
		        }else{
		            a++;
		            sumA=Math.max(a,sumA);
		        }if(B[i]==0){
		            b=0;
		        }else{
		            b++;
		            sumB=Math.max(b,sumB);
		        }
		    }
		    if(sumA>sumB)
		    {
		        System.out.println("Om");
		    }
		    else if(sumA<sumB)
		    {
		        System.out.println("Addy");
		    }
		    else
		    {
		        System.out.println("Draw");
		    }
		}
	}
}
