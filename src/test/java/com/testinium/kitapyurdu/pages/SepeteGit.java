package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SepeteGit {

    public void sepeteGit(){
        Methods methods = new Methods();
        methods.click(By.xpath("//*[@id=\"cart\"]/div[1]"));
        methods.waitBySecond(3);
        methods.click(By.id("js-cart"));    //Sepetime Gidildi;



        methods.sendKeys(By.cssSelector(".js-cart-update-product>:first-child"),"2");
        methods.clearValue(By.cssSelector(".js-cart-update-product>:first-child"));
        methods.sendKeys(By.cssSelector(".js-cart-update-product>:first-child"),"2");
        System.out.println("ürün arttırıldı");
        methods.waitBySecond(5);
        System.out.println("Satınala tıklanacak");
        methods.click(By.cssSelector(".buttons>div"));
        System.out.println("Satın al tıklandı");

        methods.click(By.cssSelector("#shipping-tabs>a:nth-child(2)"));

        methods.scrollWithAction(By.cssSelector("#address-tax-id"));
        System.out.println("kaydırma yaptı");

        methods.sendKeys(By.id("address-firstname-companyname"),"Fatih");

        System.out.println("isim yazdı");
        methods.sendKeys(By.id("address-lastname-title"),"Yildiz");

        System.out.println("soy isim yazdı");
        methods.selectByText(By.id("address-zone-id"),"Adana");
        methods.waitBySecond(1);
        System.out.println("şehir seçti");
        methods.selectByText(By.cssSelector("#address-county-id"),"CEYHAN");

        System.out.println("İlçe seçti");
        methods.sendKeys(By.id("district"),"ulus Mah");

        System.out.println("mahalle seçti");
        methods.sendKeys(By.id("address-address-text"),"193 sk no 19 kat 1");

        System.out.println("adres yazdı");
        methods.sendKeys(By.id("address-postcode"),"1970");
        methods.waitBySecond(1);
        System.out.println("posta kodu");
        methods.sendKeys(By.id("address-telephone"),"3226134322");

        System.out.println("telefon");
        methods.sendKeys(By.id("address-mobile-telephone"),"5531285139");

        System.out.println("mobile phone");
        methods.sendKeys(By.id("address-tax-id"),"18364084734");

        System.out.println("T:C");
        methods.click(By.id("button-checkout-continue"));
        Assert.assertTrue(methods.odemeCheck(By.id("free-shipping-products")));
        methods.click(By.id("button-checkout-continue"));
        Assert.assertTrue(methods.odemeCheck(By.id("form-credit-card")));
        methods.waitBySecond(3);




        methods.sendKeys(By.id("credit-card-owner"),"fatih yıldız");
        methods.sendKeys(By.id("credit_card_number_1"),"2301");
        methods.sendKeys(By.id("credit_card_number_2"),"2301");
        methods.sendKeys(By.id("credit_card_number_3"),"2057");
        methods.sendKeys(By.id("credit_card_number_4"),"0794");
        methods.selectByText(By.id("credit-card-expire-date-month"),"05");
        methods.selectByText(By.id("credit-card-expire-date-year"),"2029");
        methods.sendKeys(By.id("credit-card-security-code"),"938");


        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySecond(1);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));

        methods.click(By.cssSelector("#logo>a"));
        System.out.println("logoya tıklandı");
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]"));
        methods.click(By.cssSelector(".menu.top.login>ul>li>div>ul>:nth-child(4)>a"));
        methods.waitBySecond(4);


    }

}
