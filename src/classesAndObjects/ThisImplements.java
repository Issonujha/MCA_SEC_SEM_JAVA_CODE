package classesAndObjects;

public class ThisImplements {

	public static void main(String[] args) {
		a new1 = new a(1, 7);
		new1.display();
	}

}
class a {
	int a;
	int b;
	public a(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void display() {
		System.out.println(a + " " + b);
	}
}