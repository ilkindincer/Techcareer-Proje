package org.example;

import Pages.LoginPage;
import org.testng.annotations.Test;
import Base.BaseTest;

public class LoginTest extends BaseTest{
    LoginPage loginPage = new LoginPage();

    @Test(description = "Giriş kontrolü")
    public void Test2 () {
        loginPage.hesapButonuClick();
        loginPage.customerOlustur();
        loginPage.emailDoldur("amazon.test.project@gmail.com");
        loginPage.passwordDoldur("testdeneme345");
        loginPage.girisYap();
    }

    @Test(description = "Şifremi unuttum kontrolü")
    public void Test3() {
        loginPage.hesapButonuClick();
        loginPage.passwordUnuttum();
        loginPage.customerLogin();
        loginPage.recoverEmail("test@test.com");
        loginPage.sifreYenile();
    }
    @Test(description = "Şifremi unuttum kayıtlı olmayan kullanıcı kontrolü")
    public void Test9() {
        loginPage.hesapButonuClick();
        loginPage.passwordUnuttum();
        loginPage.customerLogin();
        loginPage.recoverEmail("qa@qa.com");
        loginPage.sifreYenile();
        loginPage.errorMessage3("Bu e-postayla hesap bulunamadı.");

    }
}





