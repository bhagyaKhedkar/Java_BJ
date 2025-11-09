package package2;
import java.lang.StringBuffer;
public class StringBuffer11 
{
	public static void main(String[] args) {
		
	
	StringBuffer sb = new StringBuffer("Java");
	sb.append("world");
	sb.replace(4, 9, "programming");
	System.out.println(sb);
	System.out.println(sb.indexOf("programming"));
	System.out.println(sb);
	System.out.println(sb.length());
	System.out.println(sb.deleteCharAt(0));
	System.out.println(sb.reverse());
	
	
	}
}

