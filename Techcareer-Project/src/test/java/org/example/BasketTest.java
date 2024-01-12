package org.example;

import Pages.BasketPage;
import org.testng.annotations.Test;
import Base.BaseTest;

public class BasketTest extends BaseTest {
    BasketPage basketPage = new BasketPage();

    @Test(description = "Sepete ürün ekle")
    public void Test4() {
        basketPage.tumUrunler();
        basketPage.aksesuarView();
        basketPage.urunSec();
        basketPage.sizeSec();
        basketPage.adetSec();
        basketPage.hemenAl();
        basketPage.bekleTamamla();
    }
    @Test(description = "Farklı sayfalardan sepete ürün ekle")
    public void Test5() {
        basketPage.tumUrunler();
        basketPage.scrollPage1();
        basketPage.sayfaGec();
        basketPage.tumCaylar();
        basketPage.scrollPage2();
        basketPage.urunCaySec();
        basketPage.scrollPage3();
        basketPage.hemenAl2();
        basketPage.sleep();
    }
    @Test(description = "Arama butonu hata mesajı kontrolü")
    public void Test6() {
        basketPage.aramaButonu();
        basketPage.searchInput();
        basketPage.errorMessageFilter("Bu arama için uygun filtre bulunamamaktadır.");
        basketPage.sleep2();
    }
}





