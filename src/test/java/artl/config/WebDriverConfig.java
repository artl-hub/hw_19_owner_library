package artl.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties",
        "system:properties"
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