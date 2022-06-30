package classjava;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "New";
		s2 = s2 + " " + s1;
		int count = 0;
		for(int i = 0; i<s2.length(); i++) {
			if(s2.charAt(i)==' ') {
				break;
			}
			count++;
		}
		s1 = s2.substring(0, count);
		
		s2 = s2.substring(count+1, s2.length());
		System.out.println("s1 =" +" "+ s1);
		System.out.println("s2 =" +" "+ s2);
	}

}
