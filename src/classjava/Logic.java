package classjava;

public class Logic {
	static int logic(int x, int y) {
		int z;
		if(y<5) {
			z = x*y;
		}
		else {
			z = x*5;
		}
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		int c = logic(a, b);
		System.out.println(c);
	}

}
