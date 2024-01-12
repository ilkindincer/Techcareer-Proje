package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasketPage extends BaseTest {

    @Step("Tüm ürünler butonu tıklanır")
    public void tumUrunler(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15870000922820__header\"]/header/div[1]/div/div/div/nav/ul/li[2]")).click();
    }
    @Step("Aksesuar sayfası görüntülenir")
    public void aksesuarView(){
        driver.findElement(By.xpath("//*[@id=\"CollectionBlock--template--15870000824516__main-0\"]/a/div[2]/div/span")).click();
    }
    @Step("Ürün seçilir")
    public void urunSec(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15870000693444__main\"]/section/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[2]/a")).click();
    }
    @Step("Size seçilir")
    public void sizeSec(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement selectElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Product-SingleOptionSelector-0-6633250881732")));
        Select select = new Select(selectElement);
        select.selectByValue("9 Adet");
    }
    @Step("Adet seçilir")
    public void adetSec(){
        WebElement inputElement = driver.findElement(By.id("quantity--template--15870000693444__main"));
        inputElement.clear();
        inputElement.sendKeys("3");
    }
    @Step("Hemen al butonu tıklanır")
    public void hemenAl(){
        driver.findElement(By.xpath("//*[@id=\"product_form_6633250881732\"]/div[3]/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"cartTotal\"]")).click();
    }
    @Step("Bekleyip kontrol edilir")
    public void bekleTamamla(){
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkoutButton = wait2.until(ExpectedConditions.elementToBeClickable(By.className("cart__checkout")));
        checkoutButton.click();
    }
    @Step("Sayfa scroll edilir")
    public void scrollPage1(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 3500);");
    }
    @Step("Sayfa değiştirilir")
    public void sayfaGec(){
        driver.get("https://mimandmore.com/collections?page=3");
    }
    @Step("Tüm çaylar butonu tıklanır")
    public void tumCaylar(){
        driver.findElement(By.xpath("//*[@id=\"CollectionBlock--template--15870000824516__main-0\"]/a/div[2]/div/h3")).click();
    }
    @Step("Sayfa scroll edilir")
    public void scrollPage2(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 600);");
    }
    @Step("Ürün seçilir")
    public void urunCaySec(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15870000693444__main\"]/section/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/h3/a")).click();
    }
    @Step("Sayfa scroll edilir")
    public void scrollPage3(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200);");
    }
    @Step("Hemen al butonu tıklanır")
    public void hemenAl2(){
        driver.findElement(By.xpath("//*[@id=\"product_form_5969262018756\"]/div[3]/div[3]/div/dynamic-checkout/div/shopify-buy-it-now-button/button")).click();
    }
    @Step("Sayfa beklenir")
    public void sleep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step("Arama butonu tıklanır")
    public void aramaButonu(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15870000922820__header\"]/header/div[1]/div/div/div/div[2]/header-search-popdown/details/summary")).click();
    }
    @Step("Arama alanına metin girişi sağlanır")
    public void searchInput(){
        driver.findElement(By.id("SearchInput")).sendKeys("dkjnd" + Keys.ENTER);
    }
    @Step("Sayfa beklenir")
    public void sleep2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step("Hata mesajı görüntülenir")
    public void errorMessageFilter(String text){
        String value = driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15870000529604__main\"]/section/div[2]/div[2]/div/div/form/div/p/strong")).getText();
        Assert.assertEquals(value,text);
    }

}
