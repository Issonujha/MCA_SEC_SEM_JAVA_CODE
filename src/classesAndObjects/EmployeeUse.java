package classesAndObjects;

public class EmployeeUse {

	public static void main(String[] args) {
		System.out.println("This is our custom class");
		Employee ssg = new Employee();
		Employee bs = new Employee();
//		ssg.id  = 12;
//		ssg.salary = 34;
//		ssg.name = "Sonu";
//		bs.id = 10;
//		bs.salary = 12;
//		bs.name = "our";
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setName("Sonu");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
//		emp1.setName("k");
//		System.out.println(emp1.getName());
//		emp1.setId(10);
//		System.out.println(emp1.getId());
//		ssg.printDetails();
//		bs.printDetails();
//		
//		int salary = bs.getSalary();
//		System.out.println(salary);
	}

}
