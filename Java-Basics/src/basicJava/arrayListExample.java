package basicJava;

import java.util.ArrayList;

public class arrayListExample {
//can accept duplicate values
// ArrayList, LinkedList, Vector-> all these classes implements interface List
// Array has fixed size, ArrayList grow's dynamically
// you can access an insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>(); // dynamic size array
		a.add("Rahul");
		a.add("java");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("java");
		System.out.println(a);
		// a.removeAll(a);
		System.out.println(a.get(0));
		System.out.println(a.contains("Student"));
		System.out.println(a.indexOf("Student"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
