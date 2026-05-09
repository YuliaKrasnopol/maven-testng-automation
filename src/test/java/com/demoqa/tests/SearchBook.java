package com.demoqa.tests;

import com.demoqa.bookStore.ProfilePage;
import com.demoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBook extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();

        }
        @Test
    public void searchBookPositiveTest(){
            new ProfilePage(driver).typeKeyInSearchInput("git")
                    .verifyNameOfBook("Git");

    }
}
