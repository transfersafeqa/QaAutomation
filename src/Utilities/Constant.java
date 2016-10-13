package Utilities;

/**
 * Created by rsangroula on 6/22/2015.
 */
public class Constant {







    public static final String prod = "https://www.guaranteedrate.com";

    public static final String Stage = "https://www.gr-stage.com/";

    public static final String dev = "https://www.gr-dev.com";

    public static final String Path_TestData = "src\\testData\\";

    public static final String File_TestData = "TestData.xlsx";

    public static final String USERNAME = System.getenv("Rsangroula");
    public static final String ACCESS_KEY = System.getenv("af34f3e8-2f83-43c2-b893-d988695ccac4");
    public static final String connectURL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



}

