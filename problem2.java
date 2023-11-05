/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    String s=in.next();
		     for(int i=0;i<n;i+=2){
                char a=s.charAt(i);
                char b=s.charAt(i+1);
                if(a=='0' && b=='0') 
                    System.out.print("A");
                if(a=='0' && b=='1') 
                    System.out.print("T");
                if(a=='1' && b=='0') 
                    System.out.print("C");
                if(a=='1' && b=='1') 
                    System.out.print("G");
            }
            System.out.print("\n");
		}
	}
}
