package src.designpattern.facotry_method._02_after;

public class BlackShipFactory extends DefaultShipFactory{

	@Override
	public Ship createShip() {
		return new BlackShip();
	}
}
