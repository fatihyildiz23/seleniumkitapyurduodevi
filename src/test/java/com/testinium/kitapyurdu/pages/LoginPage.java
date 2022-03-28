package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods = new Methods();
    Logger logger = LogManager.getLogger(Methods.class);

    public void Login() {

        methods.click(By.cssSelector(".menu-top-button.login>a"));
        logger.info("Giriş Yap Butonu Test Edildi");
        System.out.println("Giriş yapıldı");

        methods.sendKeys(By.id("login-email"),"fatihyildiz2301@gmail.com");
        methods.sendKeys(By.id("login-password"),"23012301");
        System.out.println("kullanıcı adı ve şifre girildi");

        methods.click(By.xpath("/html/body/div[7]/div[1]"));
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        System.out.println("giriş başarılı");


        Assert.assertTrue(methods.loginCheck(By.cssSelector(".attention")));

        logger.info("LOgin check başarılı");
        System.out.println("login check hatasiz");



    }

}
