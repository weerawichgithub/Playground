package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

	private static Properties configFile;

	static{

		try {
			String File1 = Constants.CUSTOMER_FILE;
			FileInputStream input1 = new FileInputStream(File1);
			configFile = new Properties();

			String File2 = Constants.ADMIN_FILE;
			FileInputStream input2 = new FileInputStream(File2);

			configFile.load(input1);
			configFile.load(input2);

			input1.close();
			input2.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}

}
