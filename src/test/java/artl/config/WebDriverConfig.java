package artl.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local.properties"
})
public interface WebDriverConfig extends Config {



    @Key("browser.name")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browser.version")
    @DefaultValue("120.0")
    String getBrowserVersion();

    @Key("browser.size")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remote.url")
    String getRemoteUrl();
    @Key("base.url")
    String getBaseUrl();


}