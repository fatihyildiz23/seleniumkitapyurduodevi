package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductPage {

    protected String idAttribute;
    Methods methods;
    WebElement webElement;

    public String getIdAttribute() {
        return idAttribute;
    }

    public void setIdAttribute(String idAttribute) {
        this.idAttribute = idAttribute;
    }

    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
        WebElement WebElement;
    }

    public void selectProduct() {

        String s = "2";
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        System.out.println("oyuncak yazdı");

        methods.scrollWithAction(By.id("faceted-search-group-5"));

        System.out.println("kaydırma yaptı");

        // methods.click(By.xpath("//*[@id=\"product-133053\"]/div[2]/div[3]/a[5]"));

        methods.click(By.cssSelector("#product-table>:nth-child(4)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));
        methods.click(By.cssSelector("#product-table>:nth-child(5)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));
        methods.click(By.cssSelector("#product-table>:nth-child(6)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));
        //setIdAttribute(methods.getId(By.cssSelector("#product-table>:nth-child(6)")));
        String id =methods.getId(By.cssSelector("#product-table>:nth-child(6)"));
        //idAttribute=methods.getId(By.cssSelector("#product-table>:nth-child(6)"));
        //ProductPage productPage = new ProductPage();
        //productPage.setIdAttribute(methods.getId(By.cssSelector("#product-table>:nth-child(6)")));
        //this.idAttribute=methods.getId(By.cssSelector("#product-table>:nth-child(6)"));
        System.out.println(getIdAttribute());
        methods.click(By.cssSelector("#product-table>:nth-child(7)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));


        // String id ;
        //methods.click(By.cssSelector(".product-list>div[class='product-cr']>div[class='grid_2.alpha.omega.relative']>div[class='hover-menu']>a[class='add-to-favorites']>i"));

        System.out.println("favoriye eklemdı");
        methods.scrollWithAction(By.cssSelector(".heading"));
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));

        //------------------------------------------

        methods.turnBack();
        methods.click(By.cssSelector(".lvl1catalog"));


        methods.scrollWithAction(By.id("point-carousel-tab-title-952"));

        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        System.out.println("Oylama kısmına geçti");
        methods.selectByText(By.cssSelector(".product-filter-header>div[class=sort]>select"),"Yüksek Oylama");
        System.out.println("tıkladı");
        methods.waitBySecond(1);

        methods.waitBySecond(1);

        methods.click(By.cssSelector(".lvl2.js-bookCr>ul>li:nth-child(3)"));
        methods.waitBySecond(1);
        methods.click(By.cssSelector(".open-menu-ct.bookAllCategories>div>ul:nth-child(3)>li:nth-child(14)>a"));

        methods.click(By.cssSelector(".product-grid.jcarousel-skin-opencart>li:nth-child(1)"));
        methods.scrollWithAction(By.cssSelector(".info-text"));

        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));

        methods.scrollWithAction(By.cssSelector(".heading"));
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));

        methods.scrollWithAction(By.cssSelector(".product-list>:nth-child(3)"));

        methods.click(By.cssSelector("#"+id+">div:nth-child(2)>div[class='hover-menu']>a:nth-child(3)>i"));
        methods.waitBySecond(1);

        /*methods.click(By.xpath("//*[@id=\"cart\"]/div[1]"));
        methods.waitBySecond(3);
        methods.click(By.id("js-cart"));    //Sepetime Gidildi;


         */

        //methods.sendKeys(By.cssSelector(".js-cart-update-product>:first-child"),"2");
           /* methods.clearValue(By.cssSelector(".js-cart-update-product>:first-child"));
            methods.sendKeys(By.cssSelector(".js-cart-update-product>:first-child"),"2");
            methods.waitBySecond(2);
        methods.click(By.cssSelector(".to-wishlist>a"));
        methods.waitBySecond(5);

            */
        //methods.favoriCheck(By.cssSelector(".product-filter"));
        //logger.info("favori ekleme işlemi kontrol edildi");
        //System.out.println("favori ekleme işlemi kontrol edildi");

        //id = methods.getText(By.cssSelector(".hover-menu>a[class='add-to-favorites']"));
        //System.out.println(id);
        //List<WebElement> listOfElements = methods.findElements(By.cssSelector(".add-to-favorites>i"));
        //System.out.println(listOfElements.get(3));
        // methods.click(By.cssSelector("listOfElements(3)"));
        // System.out.println("başarılı");
  /*  for(int i =1 ; i<=4; i++){
        methods.click(By.cssSelector(String.valueOf(listOfElements.get(i))));

    }

   */


        // methods.click(By.cssSelector(String.valueOf(listOfElements.get(1))));
    }
}
