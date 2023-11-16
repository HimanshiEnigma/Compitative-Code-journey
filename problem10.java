import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int ar[]=new int[n+1];
		    for(int i=0;i<n;i++)
		    {
		        int b=sc.nextInt();
		        ar[b]++;
		    }
		    int sum=0;
		    for(int i=0;i<n+1;i++)
		    {
		       if(ar[i]>sum)
		       sum=ar[i];
		    }
		    System.out.println(n-sum);
		}
	}
}
