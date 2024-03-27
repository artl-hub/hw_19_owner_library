package artl.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubTest extends TestBase {
    @Test
    @Tag("git_test")
    @DisplayName("Check title of main page")
    public void GithubTitleTest() {
        open(baseUrl);
        assertThat(title()).contains("GitHub: Let’s build from here · GitHub");

    }
}





