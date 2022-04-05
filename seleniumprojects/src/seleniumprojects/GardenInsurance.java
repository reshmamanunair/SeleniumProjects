package seleniumprojects;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//the ignore annotation has a higher priority than individual @test method annotations.when @ignore is 
@Ignore
public class GardenInsurance {
	@Test
	public void WebLoginGarden() {
		System.out.println("garden insurance web login");
	}
	@Test
	public void MobileLoginGarden() {
		System.out.println("garden insurance mobile login");
	}
	@Test
	public void MobileLogoutGarden() {
		System.out.println("garden insurance mobile logout");
	}
	@Test
	public void APILoginGarden() {
		System.out.println("garden insurance APIlogin");
	}
}
