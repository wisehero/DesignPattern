package src.designpattern.state;

public class MyProgram {
    public static void main(String[] args) {
        final ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch(); // "FROM TO LIGHT TO DARK"
        modeSwitch.onSwitch(); // "FROM TO DARK TO LIGHT"
        modeSwitch.onSwitch(); // "FROM LIGHT TO DARK"
        modeSwitch.onSwitch(); // "FROM DARK TO LIGHT"
    }
}
