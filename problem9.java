import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    int p = c/a;
		    int q = d/b;
		    
		    if (c<a || d<b || (c%a!=0 || d%b!=0))
		    System.out.println("NO");
		    else if (p==q || p+1==q || q+1==p)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
