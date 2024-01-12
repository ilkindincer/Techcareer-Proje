package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import Base.BaseTest;
import org.testng.Assert;

public class LoginPage extends BaseTest {
    @Step("Hesap butonu tıklanır")

    public void hesapButonuClick(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15870000922820__header\"]/header/div[1]/div/div/div/div[2]/a[2]")).click();
    }
    @Step("Kullunıcı oluştur butonu tıklanır")
    public void customerOlustur(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15870000922820__header\"]/header/div[1]/div/div/div/div[2]/a[2]")).click();
    }
    @Step("Email alanına metin girişi sağlanır")
    public void emailDoldur(String text){
        driver.findElement(By.id("CustomerEmail")).sendKeys(text);
    }
    @Step("Password alanına metin girişi sağlanır")
    public void passwordDoldur(String text){
        driver.findElement(By.id("CustomerPassword")).sendKeys(text);
    }
    @Step("Giriş yap butonu tıklanır")
    public void girisYap(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/input[3]")).click();
    }
    @Step("Parola unuttum butonu tıklanır")
    public void passwordUnuttum(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15870000922820__header\"]/header/div[1]/div/div/div/div[2]/a[2]")).click();
    }
    @Step("Kullanıcı girişi butonuna tıklanır")
    public void customerLogin(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div/div[3]/a")).click();
    }
    @Step("Şifremi unuttum için mail girişi sağlanır")
    public void recoverEmail(String text){
        driver.findElement(By.id("RecoverEmail")).sendKeys(text);
    }
    @Step("Şifreyi yenile butonu tıklanır")
    public void sifreYenile(){
        driver.findElement(By.xpath("//*[@id=\"recover-form\"]/div/div/form/div[2]/input")).click();
    }
    public void errorMessage3(String text){
        String value = driver.findElement(By.xpath("//*[@id=\"recover-form\"]/div/div/form/div[1]/div[1]/ul/li")).getText();
        Assert.assertEquals(value,text);
    }


}
