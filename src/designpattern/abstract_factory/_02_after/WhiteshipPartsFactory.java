package src.designpattern.abstract_factory._02_after;

import src.designpattern.abstract_factory._01_before.WhiteAnchor;
import src.designpattern.abstract_factory._01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

	@Override
	public Anchor createAnchor() {
		return new WhiteAnchor();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheel();
	}
}
