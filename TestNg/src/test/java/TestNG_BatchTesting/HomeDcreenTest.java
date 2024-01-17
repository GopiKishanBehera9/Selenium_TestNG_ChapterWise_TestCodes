package TestNG_BatchTesting;
import org.testng.annotations.*;
public class HomeDcreenTest {

	//Test Methods
	//LaunchApplication
	//VerifyTitle
	//VerifyLogo
	@Test
	public void LaunchApllication() {
		System.out.println("Application Launched Passed.✓");	
	}
	@Test
	public void VerifyTitle() {
		System.out.println("VerifyTitle Passed.✓");
	}
	@Test
	public void VerifyLogo() {
		System.out.println("VerifyLogo Passed.✓");
	}
}
