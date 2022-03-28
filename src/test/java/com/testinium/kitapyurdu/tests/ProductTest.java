package com.testinium.kitapyurdu.tests;

import com.testinium.kitapyurdu.driver.KitapYurduBaseTest;
import com.testinium.kitapyurdu.pages.LoginPage;
import com.testinium.kitapyurdu.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends KitapYurduBaseTest {
    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.Login();
        productPage.selectProduct();

    }
}
