package com.selenium.GenericFunc;

public class ScreenFunctions extends GenericFunctionsEx1 {
	
	public static void loginFunction() throws Exception {
		launchBrowser(map1.get("browsername"));
		logStatus("Launch Browser", true);
		launchApplication(map1.get("url"));
		inputUsername("//input[@id='idp-discovery-username']", map1.get("username"));
		logStatus("Input username", true);
		usernameClick("//input[@id='idp-discovery-submit']");
		inputpassword("//input[@id='okta-signin-password']", map1.get("password"));
		logStatus("Input password", true);
		PasswordClick("//input[@id='okta-signin-submit']");
		inputMFA("//input[@name='answer']", map1.get("mfa"));
		logStatus("Input MFA", true);
		mfaVerify("//input[@type='submit']");

	}

}
