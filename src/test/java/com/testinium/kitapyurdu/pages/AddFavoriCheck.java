package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddFavoriCheck {
    public void favoriCheck(){
        Methods methods = new Methods();

        methods.favoriCheck(By.cssSelector(".product-filter"));


    }
}
