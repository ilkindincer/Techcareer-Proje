package Pages;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BaseTest {
    @Step("Hesap butonuna tıklanır")

    public void hesapButonu(){
        driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15870000922820__header\"]/header/div[1]/div/div/div/div[2]/a[2]")).click();
    }
    @Step("Hesap oluştur butonuna tıklanır")
    public void hesapOlustur(){
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/a")).click();
    }
    @Step("Fistname alanına metin girişi sağlanır")
    public void firstName(String text){
        driver.findElement(By.id("FirstName")).sendKeys(text);
    }
    @Step("Lastname alanına metin girişi sağlanır")
    public void lastName(String text){
        driver.findElement(By.id("LastName")).sendKeys(text);
    }
    @Step("Email alanına metin girişi sağlanır")
    public void email(String text){
        driver.findElement(By.id("Email")).sendKeys(text);
    }
    @Step("Password alanına metin girişi sağlanır")
    public void createPassword(String text){
        driver.findElement(By.id("CreatePassword")).sendKeys(text);
    }
    @Step("Gönder butonuna tıklanır")
    public void gonder(){
        driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[2]/input")).click();
    }
    @Step("Hata mesajı görüntülenir")
    public void errorMessage(String text){
        String value = driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[1]/div[1]/div/ul/li/text()")).getText();
        Assert.assertEquals(value,text);
    }
    @Step("Minimum parola hata mesajı görüntülenir")
    public void errorMessageMinimum(String text){
        String value = driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[1]/div[1]/div/ul/li")).getText();
        Assert.assertEquals(value,text);

    }


}
