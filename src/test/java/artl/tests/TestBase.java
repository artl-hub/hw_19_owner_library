package artl.tests;


import artl.config.WebDriverConfig;

import artl.helpers.Attach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;




public class TestBase {
    @BeforeAll
    public static void setUp() {

        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        Configuration.browser = webDriverConfig.getBrowser();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();
        Configuration.browserSize = webDriverConfig.getBrowserSize();
        Configuration.remote = webDriverConfig.getRemoteUrl();
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = webDriverConfig.getBaseUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

        @AfterEach
        void addAttachments() {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
            Selenide.closeWebDriver();



    }

}