package classesAndObjects;
//dynamic binding and static binding
public class ABC implements Cloneable{
	int id;
	int age;
	String name;
	ABC() {				//
		id = 201;
		age = 23;
		name = "jks";
	}
	
	ABC(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	ABC(ABC ob) {
		id = ob.id;
		age = ob.age;
		name = ob.name;
	}
	public void display() {
		System.out.println(id +" "+ age+" "+name);
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
