import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    int n = in.nextInt();
		    String s = in.next();
		    boolean alice = true;
		    boolean bob = false;
		    int aCount = 0;
		    int bCount = 0;
		    for(int j=0;j<n;j++){
		        char ch =  s.charAt(j);
		        if(alice && ch == 'A'){
		            aCount++;
		        }
		        else if(bob && ch == 'B'){
		            bCount++;
		        }
		        else if(alice && ch == 'B'){
		            alice = false;
		            bob = true;
		        }
		        else if(bob && ch == 'A'){
		            bob = false;
		            alice = true;
		        }
		    }
		    System.out.println(aCount + " " + bCount);
		}
	}
}
