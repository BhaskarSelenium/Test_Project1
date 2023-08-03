package com.selenium.GenericFunc;

public class ScreenFunctions extends GenericFunctionsEx1 {
	
	public static void loginFunction() throws Exception {
		launchBrowser(map1.get("browsername"));
		logStatus("Launch Browser", true);
		launchApplication(map1.get("url"));
		inputText("//input[@id='idp-discovery-username']", map1.get("username"));
		logStatus("Input username", true);
		clickFunc("//input[@id='idp-discovery-submit']");
		inputText("//input[@id='okta-signin-password']", map1.get("password"));
		logStatus("Input password", true);
		clickFunc("//input[@id='okta-signin-submit']");
		inputText("//input[@name='answer']", map1.get("mfa"));
		logStatus("Input MFA", true);
		clickFunc("//input[@type='submit']");

	}

}
