package TestNGListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
	public void onStart(ITestContext Result) {
		System.out.println("On Start method invoked...");
	}
	
	
	public void onFinish(ITestContext Result) {
		System.out.println("On Finish method invoked....");
	}
	
	
	//When test case get failed, this method is called.
	public void onTestFailure(ITestResult Result) {
		System.out.println("Name of test method failed: "+ Result.getName());
	}
	
	//When Test case get skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Name of test method Skipped: "+ Result.getName());
	}
	
	//When test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		System.out.println("Name of test method Started: "+ Result.getName());
	}
	
	//When test case get passed, this method is called
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Name of test method successfully executed: "+ Result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println();
	}

}
