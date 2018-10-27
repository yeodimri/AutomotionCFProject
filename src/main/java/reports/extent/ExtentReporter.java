package reports.extent;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporter {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
	
	private static ExtentReporter INSTANCE;
	
	private ExtentReports extentReports;
	private ExtentTest extentTest;
	
	private ExtentReporter() {
		
		extentReports = new ExtentReports();
		
		File extentReportsFolder = new File("extent-reports");
		if (!extentReportsFolder.exists()) {
			extentReportsFolder.mkdirs();
		}
		
		extentReports.attachReporter(new ExtentHtmlReporter("extent-reports/report_" + dateFormat.format(new Date()) + ".html"));
	}
	
	private static ExtentReporter instance() {
		if (INSTANCE == null) {
			INSTANCE = new ExtentReporter();
		}
		return INSTANCE;
	}
	
	public static void startTest(String testName) {
		instance().extentTest = instance().extentReports.createTest(testName);
	}
	
	public static void report(String message) {
		instance().extentTest.info(message);
		instance().extentReports.flush();
	}
	
	public static void fail(String message) {
		instance().extentTest.fail(message);
		instance().extentReports.flush();
	}
	
	public static void fail(Throwable throwable) {
		instance().extentTest.fail(throwable);
		instance().extentReports.flush();
	}
	
	public static void pass(String message) {
		instance().extentTest.pass(message);
		instance().extentReports.flush();
	}
	
	public static void error(String message) {
		instance().extentTest.error(message);
		instance().extentReports.flush();
	}

	public static void skip(String message) {
		instance().extentTest.skip(message);
		instance().extentReports.flush();
	}
	
	public static void warning(String message) {
		instance().extentTest.warning(message);
		instance().extentReports.flush();
	}
}
