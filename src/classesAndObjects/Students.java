package classesAndObjects;
import java.util.*;
public class Students implements Comparable<Students>{
	String name;
	int age;
	int Id;
	Students(String name, int age, int Id) {
		this.name = name;
		this.age = age;
		this.Id = Id;
	}
	
	public static void main(String args[]) {
		ArrayList<Students> student = new ArrayList();
		Students s1 = new Students("abc", 20, 2);
		Students s2 = new Students("zbc", 20, 2);
		Students s3 = new Students("cbc", 20, 2);
		Students s4 = new Students("dbc", 20, 2);
		Students s5 = new Students("ebc", 20, 2);
		Students s6 = new Students("fbc", 20, 2);
		Students s7 = new Students("aac", 20, 2);
		Students s8 = new Students("jbc", 20, 2);
		Students s9 = new Students("lmc", 20, 2);
		Students s10 = new Students("abbc", 20, 2);
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		student.add(s6);
		student.add(s7);
		student.add(s8);
		student.add(s9);
		student.add(s10);
		System.out.println("Students Details: ");
		for(Students s: student) {
			System.out.println(s.name + " " + s.age + " " + s.Id);
		}
		Collections.sort(student);
		for(Students s: student) {
			System.out.println(s.name + " " + s.age + " " + s.Id);
		}
	}
	public int compareTo(Students p) {
		return name.compareTo(p.name);
	}
	
}
