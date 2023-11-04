import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		for(int i=0;i<t;i++)
		{
		    int n=in.nextInt();
		    int x=in.nextInt();
		    int arr[]=new int[n];
		    int arr1[]=new int[n];
		    
		    int total=0;
		    
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=in.nextInt();
		    }
		    for(int k=0;k<n;k++)
		    {
		        arr1[k]=in.nextInt();
		    }
		    for(int l=0;l<n;l++)
		    {
		        if(arr[l]>=x)
		        {
		            total+=arr1[l];
		        }
		    }
		    System.out.println(total);
		}
	}
}
