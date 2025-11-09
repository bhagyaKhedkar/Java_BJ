package practicepackage;

public class stringbuild_buffer
{
	public static void main(String[] args) {
		
	
	StringBuffer sb1 = new StringBuffer();
	StringBuffer sb2 = new StringBuffer("Akshay");
	StringBuffer sb3 = new StringBuffer(50);
	
	sb1 = sb1.append("Akshay");
	System.out.println(sb1);
	System.out.println(sb1.insert(6, " jagirdar"));
	System.out.println(sb1.capacity());
	System.out.println(sb1.reverse());
	System.out.println(sb1.reverse());
	System.out.println(sb1.delete(7, 15));
	System.out.println(sb1.charAt(4));
	System.out.println(sb1.length());
	System.out.println(sb1.indexOf("Akshay"));
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb2));
	System.out.println(sb1.toString());
	System.out.println(sb1.compareTo(sb2));
}
}