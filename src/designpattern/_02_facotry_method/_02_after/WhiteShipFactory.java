package src.designpattern._02_facotry_method._02_after;

public class WhiteShipFactory extends DefaultShipFactory {
	@Override
	public Ship createShip() {
		return new WhiteShip();
	}
}
