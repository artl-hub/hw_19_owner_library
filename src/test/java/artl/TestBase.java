package artl;


import artl.config.WebDriverConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Objects;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.remote;
import static com.codeborne.selenide.Selenide.open;



public class TestBase {
    @BeforeAll
    public static void setUp() {
        System.setProperty("env", "local");

        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        Configuration.browser = webDriverConfig.getBrowser();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();
        Configuration.browserSize = webDriverConfig.getBrowserSize();
        Configuration.remote = webDriverConfig.getRemoteUrl();
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = webDriverConfig.getBaseUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();



    }

}