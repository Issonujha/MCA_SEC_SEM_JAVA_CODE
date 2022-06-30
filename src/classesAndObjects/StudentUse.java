package classesAndObjects;

public class StudentUse {

	public static void main(String[] args) {
		Student s2 = new MCA(2, 9.5, "sohan", 504);
		s2.display();
	}

}
abstract class Student {
	int rollNo;
	double CGPA;
	String name;
	public Student(int rollNo, double CGPA, String name) {
		this.rollNo = rollNo;
		this.CGPA = CGPA;
		this.name = name;
	}
	public abstract void display();
}
class MCA extends Student {
	public MCA(int rollNo, double CGPA, String name, int labNo) {
		super(rollNo, CGPA, name);
		this.labNo = labNo;
	}
	int labNo;
	public void display() {
		System.out.println("Roll No: " + rollNo + " CGPA: " + CGPA + " name: " + name + " labNo " + labNo);
	}
}