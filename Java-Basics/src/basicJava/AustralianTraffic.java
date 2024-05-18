package basicJava;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		// Created object of class AustralianTraffic to implements the method present in
		// CentralTraffic interface
		a.redStop();
		a.flashYellow();
		a.greenGo();

		AustralianTraffic aa = new AustralianTraffic(); // object to access local methos
		aa.walkSymbol();
		ContinentalTraffic cc = new AustralianTraffic(); // object to access methods from another interface
		cc.trainSymbol();
	}

	public void walkSymbol() { // this method cannot be called by above object "a"
		// TODO Auto-generated method stub
		System.out.println("walkSymbol class method");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow Implementation");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol Implementation");

	}
}
