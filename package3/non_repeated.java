package package3;

import java.util.Arrays;

public class non_repeated {

	      public static void main(String args[])
	        { 
	           String s = "Hello";
	           //string data retrieving methods 
	           System.out.println(s.length());
	           System.out.println(s.charAt(0));
	           System.out.println(s.indexOf('l'));
	           System.out.println(s.indexOf("llo"));
	           System.out.println(s.lastIndexOf("l"));
	           System.out.println(s.lastIndexOf("He"));
	           System.out.println(s.contains("ell"));
	           System.out.println(s.isBlank());
	           System.out.println(s.isEmpty());
	           
	         //string modification methods
	         String s1 = "world";
	         System.out.println(s.concat(s1));
	         System.out.println(s+s1);
	         System.out.println(s.substring(1));
	         System.out.println(s.substring(0, 3));
	         System.out.println(s.replace('H', 'h'));
	         System.out.println(s.replace("el", "El"));
	         System.out.println(s.replaceAll("llo","LLO"));
	         System.out.println(s.replaceFirst("el", "EL"));
	         System.out.println(s.toLowerCase());
	         System.out.println(s.toUpperCase());
	         String s3="abc-def-ghi";
	         String [] s2 = s3.split("-");
	         System.out.println(Arrays.toString(s2));
	         String s5="   hii   -hii  ";
	         System.out.println(s5.trim());
	           
	         //String comparison methods
	         String s4="hello";
	         System.out.println(s.equals(s4));
	         System.out.println(s.equalsIgnoreCase(s4));
	         System.out.println(s4.compareTo(s));
	         System.out.println(s.compareToIgnoreCase(s4));
	           
	         //string utility methods
	         System.out.println(String.valueOf(s));
	         char [] s6=s.toCharArray();
	         System.out.println(Arrays.toString(s6));
	         byte [] b=s.getBytes();
	         System.out.println(Arrays.toString(b));
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	        }
	    }
	

