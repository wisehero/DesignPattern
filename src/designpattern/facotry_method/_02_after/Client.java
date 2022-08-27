package src.designpattern.facotry_method._02_after;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		client.print(new WhiteShipFactory(), "whiteship", "test@gmail.com");
		client.print(new BlackShipFactory(), "blackship", "test@gmail.com");
	}

	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}
}
