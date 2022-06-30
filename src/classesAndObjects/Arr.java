package classesAndObjects;
import java.util.*;
public class Arr {

	public static void main(String[] args) {
//		ArrayList<String> li = new ArrayList<>();
//		li.add("jks");
//		li.add("zbc");
//		li.add("pks");
//		for(String s:li) {
//			System.out.println(s);
//		}
//		Iterator itr = li.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		String s = li.remove(0);
//		System.out.println(s);
//		System.out.println(li.contains(s));
//		Collections.sort(li);
//		for(String k: li) {
//			System.out.println(k);
//		}
//		Collections.sort(li, Collections.reverseOrder());
//		for(String k: li) {
//			System.out.println(k);
//		}
		LinkedList<String> li = new LinkedList<>();
		li.add("jks");
		li.add("zbc");
		li.add("pks");
		for(String s:li) {
			System.out.println(s);
		}
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(li);
//		Iterator itr1 = li.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
		ListIterator<String> itr2 = li.listIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}

}
