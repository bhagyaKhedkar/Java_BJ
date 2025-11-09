package practicepackage;
import java.io.*;
import java.io.FileNotFoundException;

public class PracticeException 
{
	double div(int a , int b) throws FileNotFoundException
	{
		PrintWriter p = new PrintWriter("abc.txt");
		p.write("hello");
		System.out.println("hi ");
		int c = a/b;
		return c;
		
	}
	
	
	public static void main(String[] args) 
	{
		PracticeException pe = new PracticeException();
		long l = 1000;
		byte b = byte(l);
		//double rem = pe.div(12,0);
		//System.out.println(rem);
		
		//throw new FileNotFoundException();
		}
}
