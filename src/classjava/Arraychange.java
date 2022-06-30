package classjava;

public class Arraychange {
	static void change(int a) {
		a =98;
	}
	static void change2(int[] arr) {
		arr[0] = 98;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 45;
		change(x);
		System.out.println("The value of running change is: " + x);
		int [] marks = {52, 73, 77, 89, 98, 94};
		change2(marks);
		System.out.println("Array is: " + marks[0]);
	}
}
