package classjava;

public class AnnagramOfTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Keep";
		String s2 = "Peek";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		Boolean b = Annagram(s1, s2);
		System.out.println(b);
	}
	public static boolean Annagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i = 0; i<s1.length(); i++) {
			char a = s1.charAt(i);
			int count = 0;
			for(int j = 0; j<s2.length(); j++) {
				if(s2.charAt(j)!=a) {
					count++;
					if(count==s2.length() && j == s2.length()-1) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
