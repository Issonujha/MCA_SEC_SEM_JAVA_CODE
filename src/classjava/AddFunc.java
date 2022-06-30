package classjava;

public class AddFunc {
	static int add(int...a) { //variable arguments VarArg
		int r = 0;
		for(int i:a) {
			r = r+i;
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum is " + add(55, 66, 77));
		System.out.println("Sum is " + add(55, 66, 77, 88, 99, 44));
	}
}
