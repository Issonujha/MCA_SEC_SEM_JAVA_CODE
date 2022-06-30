package classjava;

public class StringVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aeoibddaeoiud";
		String s2 = "";
		for(int i = 0; i<s1.length(); i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' ||s1.charAt(i)=='i' ||s1.charAt(i)=='o' || s1.charAt(i)=='u') {
				String c = "" + s1.charAt(i);
//				System.out.println(s2.contains(c));
				if(!s2.contains(c)) {
					//nothing
					s2 += s1.charAt(i);
				}
				
			}
		}
		System.out.print(s2);
	}

}
