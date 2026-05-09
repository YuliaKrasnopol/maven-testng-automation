package com.demoqa.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticFormTest extends TestBase{
   @Test(dataProviderClass = DataProvider.class,dataProvider = "addNewStudentFormWithCsv")
    public void createStudentAccount(String name, String lastName, String email, String phone){
        new PracticFormTest(driver)
                .enterPersonalData(name, lastName, email, phone)
                .selectGender("Male")
                .enterData("16 sept 1980")
                .addSubject(new String[]{"Math","Chemistry"})
                .selectHobby(new String[]{"Sport","Reading"})
                .uploadFile("")
                .inputState("NSR")
                .input("Delphi")
                .submit()
                .verifySuccessRegistration("");
    }
}
