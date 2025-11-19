package web_automationexercise.utils;

import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        String description = result.getMethod().getDescription();
        if (description == null || description.isEmpty()) {
            description = "No description";
        }

        // Tạo ExtentTest cho test này
        ExtentManager.createTest(testName, description)
                .log(Status.INFO, "Test started: " + testName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentManager.getTest().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentManager.getTest().log(Status.FAIL, "Test failed");
        ExtentManager.getTest().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentManager.getTest().log(Status.SKIP, "Test skipped");
        if (result.getThrowable() != null) {
            ExtentManager.getTest().skip(result.getThrowable());
        }
    }

    @Override
    public void onStart(ITestContext context) {
        // Có thể log info level suite nếu muốn
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush report khi chạy xong toàn bộ suite
        ExtentManager.flush();
    }
}