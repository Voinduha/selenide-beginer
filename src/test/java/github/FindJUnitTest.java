package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindJUnitTest {

    @Test
    void itCanFindJUnit5OnGitHub() {
        // открыть страничку гитхаб
        open("https://github.com/");
        // ввести в поле поиска JUnit5 и нажать Enter
        $("[data-test-selector=nav-search-input]").val("JUnit5").pressEnter();
        // нажимаем на линк от первого результата поиска
        $$(".repo-list li").first().$("a").click();
        // проверка: в заголовке встречается junit-team/junit5
        $("h1").shouldHave(text("junit-team / junit5"));

        // ARRANGE - подготовить (создаем данные) опциональная часть
        // ACT - действовать (совершаемое действие) видим, что мы проверяем
        // ASSERT - проверить (проверка/проверки) может быть несколько строчек кода

        // GIVEN
        // WHEN
        // THEN
    }
}
