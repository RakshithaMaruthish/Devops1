package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class New1 implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("exe started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC skipped");
	}

}
