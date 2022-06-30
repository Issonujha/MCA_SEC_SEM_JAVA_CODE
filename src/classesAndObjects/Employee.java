package classesAndObjects;

public class Employee {
	private int id;
	private int salary;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
	public void printDetails() {
		System.out.println("My id is " + id);
		System.out.println("My name is " + name);
	}
	public int getSalary() {
		return salary;
	}
	
}
