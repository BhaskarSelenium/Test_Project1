package com.selenium.TCS;

import com.selenium.GenericFunc.GenericFunctionsEx1;

public class TC_001 extends GenericFunctionsEx1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		launchApplication("https://cwb-qa.temenoscloudna.com/apps/KonyOLB/#_frmLogin");
		inputUsername("//input[@id='idp-discovery-username']","01227134");
		//rememberMe("//label[text()='Remember me']");
		windowHandle1("//input[@id='frmLogin_btnLocateUs']");
		
	}

}
