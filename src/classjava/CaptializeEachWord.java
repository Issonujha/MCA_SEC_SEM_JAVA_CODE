package classjava;

public class CaptializeEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer b = new StringBuffer();
//		System.out.println(b.capacity());
//		b.append("Hello we are here");
//		System.out.println(b);
//		System.out.println(b.capacity());
//		System.out.println(b.length());
//		System.out.println(b.reverse());
//		b.insert(5, "Hello");
//		b.delete(1, 3);
//		b.replace(1, 3, "Hello");
//		System.out.println(b.substring(1));
//		System.out.println(b.charAt(5));
//		StringBuffer b1 = new StringBuffer(5);
//		b1.ensureCapacity(8);
//		b1.append("Hell");
//		System.out.println(b1);
		int count = 1;
		String str ="hello we are here";
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		String s[] = new String[count];
		s = str.split(" ");
		for(int i = 0; i<s.length; i++) {
			String a= s[i].substring(0,1);
			String remaining = s[i].substring(1, s[i].length());
			a = a.toUpperCase();
			s[i] = a + remaining;
		}
		for(int i = 0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
