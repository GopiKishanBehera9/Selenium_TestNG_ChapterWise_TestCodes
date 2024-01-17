package TestNg_Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompany {

	@Test
	@Parameters({"SoftwareCompany Name"})
	public void testCase2(String name) {
		System.out.println(name);
	}
}
