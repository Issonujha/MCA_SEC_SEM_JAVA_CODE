package classesAndObjects;

public class ABCUse {

	public static void main(String[] args) throws CloneNotSupportedException {
		ABC ob1 = new ABC();
		ob1.display();
		ABC ob2 = new ABC(15, 20, "raja");
		ob2.display();
		ABC ob3 = new ABC(ob2);
		ob2.display();
		ABC ob4 = (ABC)ob3.clone();
		ob4.display();
	}

}
