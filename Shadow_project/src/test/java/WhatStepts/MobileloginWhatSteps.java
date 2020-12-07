package WhatStepts;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import HowSteps.LoginHowSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Steps;

public class MobileloginWhatSteps 
{
	
	@Steps
    LoginHowSteps loginhowsteps;
	@Given("user set the capabilities and launch the application in Mobile")
    public void mobileCapabilities()
    {
		loginhowsteps.mobileCapabilities();
    }

}
