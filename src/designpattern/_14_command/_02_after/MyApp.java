package src.designpattern._14_command._02_after;

import src.designpattern._14_command._01_before.Game;

public class MyApp {

	private Command command;

	public MyApp(Command command) {
		this.command = command;
	}

	public static void main(String[] args) {
		MyApp myApp = new MyApp(new GameStartCommand(new Game()));
	}
}
