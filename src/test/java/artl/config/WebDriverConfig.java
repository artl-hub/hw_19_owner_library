package artl.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:/*${host}*/local.properties")
public interface WebDriverConfig extends Config {

    @Key("base.url")
    @DefaultValue("https://github.com/")
    String getBaseUrl();

    @Key("browser.name")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browser.version")
    @DefaultValue("120.0")
    String getBrowserVersion();

    @Key("browser.size")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remote.Url")
    URL getRemoteUrl();

}