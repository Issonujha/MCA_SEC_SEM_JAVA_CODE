package classjava;
import java.util.*;
public class FindingVowels {
	   public static void main(String args[]) {
		   HashSet<Character> s1 = new HashSet<>();
	      String str = new String("aeibddaeiud");
	      
	      for(int i=0; i<str.length(); i++) {
	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//	            System.out.print(str.charAt(i));
	            s1.add(str.charAt(i));
	         }
	      }
	      String s2 = s1.toString();
	      String s3 = "";
	      for(int i = 0; i<s2.length(); i++) {
	    	  if(s2.charAt(i)=='[' || s2.charAt(i)==']' || s2.charAt(i)==',' || s2.charAt(i)==' ') {
	    		  //Not do anything
	    	  }
	    	  else {
	    		  s3 += s2.charAt(i);
	    	  }
	      }
	    System.out.println(s3);
	 }
}