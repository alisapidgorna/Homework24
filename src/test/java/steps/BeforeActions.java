package steps;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.java.Before;
import utils.SeleniumDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BeforeActions {
    @Before
    public static void setUp(){
        SeleniumDriver.setUpDriver();

    }
}
