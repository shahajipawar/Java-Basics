package basicJava;

public class childClassDemo extends parentClassDemo {

	public void engine() {
		System.out.println("new Engine");
	}

	public void color() {
		System.out.println(color);
	}
	
	public void audioSystem()
	{
		System.out.println("New audio child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo obj = new childClassDemo();
		obj.color();
		obj.brackes();
		obj.audioSystem();  
		//function overriding - both method have same name, same parameter, same return type
	}

}
