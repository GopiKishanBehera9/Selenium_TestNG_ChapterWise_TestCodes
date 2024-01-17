package TestNg_Parameters;
import org.testng.annotations.*;
public class AutoMobileClass {
	@Test
	@Parameters({"Automobile Name"})
	public void testCase1(String name) {
		System.out.println(name);
	}
	
	

}
