package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestJUnitContributor {

    @Test
    void unknownGuyIsTheBestContributor() {
        // открыть страницу репозитория JUnit
        open("https://github.com/junit-team/junit5");
        // подвести мышку к первому элементу в области Contributors
        $(".Layout-sidebar").find(byText("Contributors"))
        .closest("div").$("ul li").hover();
        // check: в появившесмся окошке (оверлей) текст ...

    }
}
