package artl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubTest extends TestBase {
    @Test
    @DisplayName("Check title of main page")
    public void GithubTitleTest() {
        assertThat(title()).contains("GitHub: Let’s build from here · GitHub");
    }

}



