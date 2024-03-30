package artl.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubTest extends TestBase {
    @Test
    @Tag("git_test")
    @DisplayName("Check title of github main page")
    public void GithubTitleTest() {
//        open("");
//        assertThat(title()).contains("GitHub: Let’s build from here · GitHub");

        step ("Open main page", () -> {
            open("");
        }) ;

        step ("Header is correct", () -> {
            assertThat(title()).contains("GitHub: Let’s build from here · GitHub");
        }) ;


    }
}





