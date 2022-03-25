package driver;

import pages.*;


public class PageInitializer extends Driver {

	public static commonPage commPage;
	public static customerPage custPage;

	public static void initialize() {
		custPage = new customerPage();
		commPage = new commonPage();
	}
}
