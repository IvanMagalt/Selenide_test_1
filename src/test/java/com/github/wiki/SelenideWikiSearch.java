package com.github.wiki;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SelenideWikiSearch {
    @Test
    void WikiSoft() {
        // Откройте страницу Selenide в Github
        Selenide.open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

    }
}
