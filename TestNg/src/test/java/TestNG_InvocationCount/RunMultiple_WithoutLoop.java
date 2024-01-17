package TestNG_InvocationCount;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class RunMultiple_WithoutLoop {
	@Test(invocationCount=5)
	public void testMethod1(ITestContext context) {
		int currentInvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing:"+currentInvocation);
		System.out.println("Test Method1.....");
	}
	
	@Test(invocationCount=3)
	public void testMethod2(ITestContext context) {
		int currentInvocation = context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executing:"+currentInvocation);
		System.out.println("Test Method2.....");
	}

}
