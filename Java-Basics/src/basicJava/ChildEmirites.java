package basicJava;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirites c = new ChildEmirites();
		c.engine();
		c.safetyGuidelines1();
		c.bodyColor();
		
		//cannot instantiate abtract class, cannot create an object for the abtract class
		//ParentAirCraft pa = new ParentAirCraft();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
