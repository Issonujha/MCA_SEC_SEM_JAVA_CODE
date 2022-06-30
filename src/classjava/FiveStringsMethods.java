package classjava;

public class FiveStringsMethods {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		StringBuffer s3 = new StringBuffer("Hello");
		StringBuilder s4 = new StringBuilder("Hello");
		char[] s5 = ("Hello").toCharArray();
		System.out.print(s1 + " " + s2 + " " + s3 + " " + s4 + " ");
		for(int i = 0; i<s5.length; i++) {
			System.out.print(s5[i]);
		}
	}

}
