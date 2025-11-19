package web_automationexercise.commons;

import java.io.File;

public class GlobalConstants {
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 30;
    public static final String URL = "https://automationexercise.com/";
    public static final String OS_NAME = System.getProperty("os.name");
    public static final String JAVA_VERSION = System.getProperty("java.version");
    public static final String RELATIVE_PROJECT_PATH = System.getProperty("user.dir");
    public static final String DATA_TEST_PATH = RELATIVE_PROJECT_PATH + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator;
}
