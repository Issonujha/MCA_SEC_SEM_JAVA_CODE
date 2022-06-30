package classjava;

import java.util.Scanner;
public class RemoveAllWhiteSpaces {
	public static String ReplaceWhiteSpaces(String s) {
		String rep = s.replace(" ", "");
//		System.out.println(rep);
		return rep;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
		String ab = ReplaceWhiteSpaces(str);
		System.out.println(ab);
	}

}
