package org.example;

import Pages.RegisterPage;
import org.testng.annotations.Test;
import Base.BaseTest;

public class RegisterTest extends BaseTest {
    RegisterPage registerPage = new RegisterPage();

    @Test(description = "Hesap oluştur")
    public void Test1 () {
        registerPage.hesapButonu();
        registerPage.hesapOlustur();
        registerPage.firstName("Test");
        registerPage.lastName("Deneme");
        registerPage.email("testdeneme@gmail.com");
        registerPage.createPassword("testdeneme345");
        registerPage.gonder();
    }
    @Test(description = "Sistemde mevcut olan hesap oluştur kontrolü")
    public void Test7(){
        registerPage.hesapButonu();
        registerPage.hesapOlustur();
        registerPage.firstName("deneme");
        registerPage.lastName("test");
        registerPage.email("testdeneme@gmail.com");
        registerPage.createPassword("test12");
        registerPage.gonder();
        registerPage.errorMessage("Bu e-posta adresi zaten bir hesapla ilişkili. Bu hesap sizinse parolanızı sıfırlayabilirsiniz");
    }
    @Test(description = "Parola minimum karakter hata kontrolü")
    public void Test8(){
        registerPage.hesapButonu();
        registerPage.hesapOlustur();
        registerPage.firstName("deneme1");
        registerPage.lastName("test");
        registerPage.email("testdeneme@gmail.com");
        registerPage.createPassword("test");
        registerPage.gonder();
        registerPage.errorMessageMinimum("Parola çok kısa (minimum değer 5 karakterdir)");
    }
}





