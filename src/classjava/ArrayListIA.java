package classjava;
import java.util.*;
public class ArrayListIA {
	public static ArrayList appendList(int element, ArrayList<Integer> list) {
		list.add(element);
		return list;
	}
	public static void display(ArrayList<Integer> list) {
		for(int element:list) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public static int search(int find, ArrayList<Integer> list) {
		int index = 0;
		for(int element:list) {
			index++;
			if(find==element) {
				return index;
			}
		}
		return Integer.MIN_VALUE;
	}
	public static void Insert(int pos, int element, ArrayList<Integer> list) {
		if(pos>list.size()) {
			System.out.println("Element can't be added");
			return;
		}
		list.add(pos, element);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Append an Element: Select 1");
		System.out.println("Display List: Select 2");
		System.out.println("Find an Element: Select 3");
		System.out.println("Insert At perticular position: Select 4");
		int choice = s.nextInt();
		
		while(choice>0) {
			switch(choice) {
				case 1:
					System.out.print("Enter the Element: ");
					int element = s.nextInt();
					list = appendList(element, list);
					break;
				case 2:
					System.out.print("Lists are: ");
					display(list);
					break;
				case 3:
					System.out.println("What to find in list");
					int find = s.nextInt();
					int index = search(find, list);
					System.out.println("Element at Index: " + index);
					break;
				case 4:
					System.out.print("Enter the position: ");
					int pos = s.nextInt();
					System.out.print("Enter the element to be Inserted: ");
					int insert = s.nextInt();
					Insert(pos, insert, list);
				default :
					System.out.println("Exit from that");
					break;
			}
			System.out.println("Append an Element: Select 1");
			System.out.println("Display List: Select 2");
			System.out.println("Find an Element: Select 3");
			System.out.println("Insert At perticular position: Select 4");
			choice = s.nextInt();
			if(choice==-1) {
				break;
			}
		}
		
	}

}
