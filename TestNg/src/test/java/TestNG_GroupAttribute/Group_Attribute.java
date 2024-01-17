package TestNG_GroupAttribute;
import org.testng.annotations.*;
public class Group_Attribute {

	@Test(groups="software company")
	public void infosys() {
		System.out.println("Infosys");
	}
	
	@Test(groups="software company")
	public void wipro() {
		System.out.println("wipro");
	}
	
	@Test(groups="automobile")
	public void Maruti() {
		System.out.println("Maruti");
	}
	
	@Test(groups="automobile")
	public void tata() {
		System.out.println("tata");
	}
}
