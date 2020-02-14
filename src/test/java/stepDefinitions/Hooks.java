package stepDefinitions;

import cucumber.api.java.Before;
import io.netty.handler.logging.LogLevel;
import testUI.Configuration;

import static testUI.UIOpen.open;

public class Hooks {
    @Before
    public void setUp() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.testUILogLevel = LogLevel.DEBUG;
        Configuration.androidAppPath = "src/test/resources/groceries-app.apk";
        open();
    }
}
