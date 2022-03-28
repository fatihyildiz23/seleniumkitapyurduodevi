package com.testinium.kitapyurdu.tests;

import com.testinium.kitapyurdu.driver.KitapYurduBaseTest;
import com.testinium.kitapyurdu.pages.LoginPage;
import com.testinium.kitapyurdu.pages.ProductPage;
import com.testinium.kitapyurdu.pages.SepeteGit;
import org.junit.Test;

public class SepeteGitTest extends KitapYurduBaseTest {
    @Test
   public void sepeteGitTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        SepeteGit sepeteGit = new SepeteGit();
        loginPage.Login();
        productPage.selectProduct();
        sepeteGit.sepeteGit();
    }
}
