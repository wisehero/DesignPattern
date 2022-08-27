package src.designpattern._03_abstract_factory._01_before;

import src.designpattern._02_facotry_method._02_after.DefaultShipFactory;
import src.designpattern._02_facotry_method._02_after.Ship;
import src.designpattern._02_facotry_method._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {
		Ship ship = new WhiteShip();
		ship.setAnchor(new WhiteAnchor());
		ship.setWheel(new WhiteWheel());
		return ship;
	}
}
