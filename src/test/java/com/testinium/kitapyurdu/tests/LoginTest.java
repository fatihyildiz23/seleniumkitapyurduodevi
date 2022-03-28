package com.testinium.kitapyurdu.tests;

import com.testinium.kitapyurdu.driver.KitapYurduBaseTest;
import com.testinium.kitapyurdu.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends KitapYurduBaseTest {

@Test
     public void loginTest(){
     LoginPage loginPage = new LoginPage();
     loginPage.Login();


}
}
