package web_automationexercise.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // Khởi tạo ExtentReports (singleton)
    public synchronized static ExtentReports getExtentReports() {
        if (extent == null) {
            // Đường dẫn file report
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";

            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setReportName("Automation Test Report");
            spark.config().setDocumentTitle("Extent Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            //  system info
            extent.setSystemInfo("Tester", "Quyen Nguyen");
        }
        return extent;
    }

    // Tạo test mới và set vào ThreadLocal
    public synchronized static ExtentTest createTest(String name, String description) {
        ExtentTest extentTest = getExtentReports().createTest(name, description);
        test.set(extentTest);
        return extentTest;
    }

    // Lấy ExtentTest hiện tại của thread
    public static ExtentTest getTest() {
        return test.get();
    }

    // Flush report
    public synchronized static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}