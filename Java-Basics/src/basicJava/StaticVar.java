package basicJava;

public class StaticVar {

	String name; // instance variable , Bob
	String address; // instance variable
	//static String city = "Bangalore"; //class variable, static-> copy is shared by all the objects
	static String city;
	static int i;
	
	static
	{
		city = "Bangalore";
		i = 0;	
	}
	StaticVar(String name, String address) // local variables
	{
		this.name = name; // assign local variable to instance variable, Bob
		this.address = address;
		i++;
		this.city = city;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(address+""+city);
	}
	
	// class methods, no object is required to call them, class can call them directly without an object
	public static void getCity()  
	{
		System.out.println(city);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj = new StaticVar("Bob", "Marathhelli");
		StaticVar obj2 = new StaticVar("Ram", "Jayanagar");
		obj.getAddress();
		obj2.getAddress();
		// crate instance = create object
		StaticVar.getCity(); // calling static methods
		StaticVar.i = 4; // Calling static variable
		obj.address="xyz"; // calling non-static variable thorugh object
	}
}
