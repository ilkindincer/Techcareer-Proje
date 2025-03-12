# Techcareer-Proje

## Proje Açıklaması
Bu proje, [Techcareer](https://www.techcareer.net/) platformu üzerinden verilen bir ödevin uygulanmasıdır. Projenin amacı, belirli test senaryolarını otomatikleştirmek ve performans testleri gerçekleştirmektir.

Bu projede, [ Mim and More](https://mimandmore.com/) sitesinin testleri gerçekleştirilmiştir. Test kapsamı şunları içermektedir:

Fonksiyonel Testler
	•	Ana sayfanın düzgün yüklenmesi
	•	Navigasyon menüsünün çalışması
	•	Ürün sayfalarının açılabilirliği
	•	Sepete ürün ekleme ve kaldırma işlemleri
	•	Ödeme adımlarının kontrolü

UI (Arayüz) Testleri
	•	Sayfanın farklı ekran boyutlarında duyarlı (responsive) çalışması
	•	Butonların ve formların düzgün hizalanması

Performans Testleri
	•	Sayfa yükleme hızının ölçümü
	•	Kullanıcı trafiğine karşı sistemin dayanıklılığı (Locust ile yük testi)

API Testleri
	•	Backend API uç noktalarının testi
	•	HTTP yanıt kodlarının doğruluğu

Test Sonuçları:
Test sonuçları mochawesome-report ve locust-load-test-report klasörlerinde detaylı olarak bulunmaktadır.

## İçerik
- **Test Senaryoları:** `test-senaryolari` klasöründe detaylı test senaryoları bulunmaktadır.
- **Otomasyon Testleri:** `test` klasöründe otomasyon testlerine ait kodlar yer almaktadır.
- **Performans Testleri:** `load-test-proje` klasöründe Locust ile gerçekleştirilen yük testleri ve `load-test-locust-report` klasöründe ilgili raporlar bulunmaktadır.
- **Raporlar:** `mochawesome-report` klasöründe otomasyon testlerine ait raporlar mevcuttur.

Gerekli Bağımlılıkları Yükleyin:
	•	Node.js ve npm yüklü olduğundan emin olun. 
 •	Python ve Locust yüklü olmalıdır.
