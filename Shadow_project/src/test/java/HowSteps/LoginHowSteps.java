package HowSteps;
import net.thucydides.core.annotations.Steps;

import pages.Loginpage;

public class LoginHowSteps 
{
	@Steps 
	Loginpage loginpage;
	
	public void mobileCapabilities()
    {
		loginpage.setMobileCapabilities();
    }

	
	
	
	
}
