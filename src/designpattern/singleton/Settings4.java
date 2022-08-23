package src.designpattern.singleton;

public class Settings4 {

	private Settings4() {
	}

	public static Settings4 getInstance() {
		return Settings4Holder.INSTANCE;
	}

	private static class Settings4Holder {
		private static final Settings4 INSTANCE = new Settings4();
	}
}
