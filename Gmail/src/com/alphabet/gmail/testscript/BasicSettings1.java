package com.alphabet.gmail.testscript;

public class BasicSettings1 
	{
		static {
				//		chromeDriver
			String chromeKey = "webdriver.chrome.driver";
			String chromeDriverPath = "./drivers/chromedriver.exe";
			
			System.setProperty(chromeKey, chromeDriverPath);
			
				//		mozillaDriver
			String firefoxKey = "webdriver.gecko.driver";
			String firefoxDriverPath = "./drivers/geckodriver.exe";
			
			System.setProperty(firefoxKey, firefoxDriverPath);
			
				//		ieDriver
			String ieKey = "webdriver.ie.driver";
			String ieDriverPath = "./drivers/IEDriverServer.exe";
			
			System.setProperty(ieKey, ieDriverPath);
			
		}
		
		public static long mySleep(long seconds) {
			
			long millisecond = seconds * 1000 ;
			try {
				Thread.sleep(millisecond);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return seconds;
			
			
		}

}
