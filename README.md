https://academy.patika.dev/tr/courses/java101

eğitimi doğrultusunda yaptığım projeler burada yer almaktadır.

kdv = kdv ile tutar hesaplama projesi

ucgen = iki kenarı verilen dik üçgenin hipotenüsünü bulma, alan ve çevre hesaplama

exam = ders notlarını hesaplayan ve genel not ortalamasını da hesaplayıp kaldı / geçti geri dönütü verme

taxi = Taksi metre hesaplama cart curt

daire_alan = Verilen yarı çap'a göre daire alan hesaplama ve yine yarıçap ve verilen açıya göre daire dilimi hesaplama

kitle_indeks = Vücut Kitle İndeksini hesaplama aracı (kullanıcıdan kilo ve boy girişi alıyorsunuz.)

manav = Kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program


- banka_hesap:

    Banka hesap sistemi  adı altında terminal üzerinden çalışabilen temel sevieyede proje

    Amacı: Müşterinin bankaya kaydını yapıp; 
    hesap bilgilerinin kontrolünü sağlama
    para çekme ve yatırma
    birikim durumunu öğrenme
    hesap özet alma gibi işlemleri bulunuyor.

    İçerisinde bulunan konular: 
    - değişkenler
    - değişken dönüşümleri
    - sınıflar 
    - paket kullanımı 
    - yöntemler (metot oluşturma ) 
    - erişim düzenleyicileri
    - kapsülleme
    - değişkeleri dönüştürme
    - sınıf 
    - nesne 
    - kurucu
    - operatörler
    - if / else

- StudentManagementSystem

    Öğrenci bilgi sistemi olarak geçmektedir.

    Amacı: Kullanıcıdan veriler alıp onları kurucu metot aracılığıyla yeni bir öğrenci olarak ekleyip vize final notlarına göre öğrenci durumunu sorgulama hakkında bilgiler almak.

        İçerisinde bulunan konular: 
    - değişkenler
    - değişken dönüşümleri
    - sınıflar 
    - paket kullanımı 
    - yöntemler (metot oluşturma ) 
    - erişim düzenleyicileri
    - kapsülleme
    - değişkeleri dönüştürme
    - sınıf 
    - nesne 
    - kurucu
    - operatörler
    - if / else
    - 
- hesap_makinesi
  
  Ufak çaplı switch case çalışması adına yapılmış bir projedir.

- login_panel

  Ufak çaplı sadece şifre yanlış ise sıfırlanabilen bir login paneli ![image](https://github.com/user-attachments/assets/bdadb52b-f67e-408e-b6b9-38c66a182c2b)

  # - Student_Management_Syst_V2

## Proje Açıklaması
Bu proje, Java dili kullanılarak geliştirilmiş temel bir **Öğrenci Yönetim Sistemi** uygulamasıdır. Proje, öğrencilerin bilgilerini, ders notlarını ve başarı durumlarını yönetmek için oluşturulmuştur. Yazılımda kullanılan yapılar ve yöntemler, Java'nın temel ve orta seviye konularını kapsar ve uygulamalı bir öğrenim amacıyla tasarlanmıştır.

## Projenin Özellikleri
- **Öğrenci Bilgi Yönetimi:**
  - Öğrenci ekleme, listeleme, silme ve arama.
- **Not Yönetimi:**
  - Öğrencilere not ekleme ve tüm notlarını görüntüleme.
- **Başarı Analizi:**
  - Öğrencilerin ortalamalarını hesaplama.
  - En başarılı öğrenciyi bulma.
  - Öğrencinin geçip geçmediğini belirleme.
- **Dinamik Kullanıcı Etkileşimi:**
  - Kullanıcıdan alınan girişlerle dinamik menü seçenekleri.
- **Kapsülleme ve Nesne Yönelimli Programlama:**
  - Öğrenci bilgileri ve yönetimi, Java sınıfları ve yöntemleri aracılığıyla düzenlenmiştir.
  - Kapsülleme (encapsulation) ve erişim düzenleyiciler (private, public) kullanılarak güvenli veri yönetimi sağlanmıştır.

## Projenin Teknik Detayları
- **Kullanılan Yapılar ve Kavramlar:**
  - Sınıflar, nesneler, kurucular (constructors).
  - Diziler ve `ArrayList` veri yapısı.
  - Döngüler (`for`, `while`) ve karar yapıları (`if-else`).
- **Java Temelleri:**
  - Değişkenler, veri tipleri, erişim düzenleyiciler ve kapsülleme.
- **Metotlar ve Kullanımı:**
  - Getter ve setter metotları.
  - Kullanıcıdan alınan girişleri yönetme (`Scanner`).
- **Kullanıcı Etkileşimi:**
  - Konsol üzerinden dinamik bir menüyle kullanıcı etkileşimi sağlandı.

# Banka Hesap Yönetim Sistemi (bank_system)

## Proje Açıklaması
Bu proje, Java kullanılarak geliştirilmiş temel bir **Banka Hesap Yönetim Sistemi** uygulamasıdır. Proje, birden fazla hesabı yönetmek, hesaplar üzerinde çeşitli işlemler yapmak ve işlem geçmişini görüntülemek için tasarlanmıştır. Kullanıcı dostu bir menü sistemi ile çalışır ve Java'nın temel ve orta seviye konularını uygulamalı bir şekilde içerir.

---

## Özellikler

### **Hesap İşlemleri**
- **Para Yatırma:** Kullanıcı seçili hesaba para yatırabilir.
- **Para Çekme:** Kullanıcı bakiyesi doğrultusunda para çekebilir.
- **Bakiye Sorgulama:** Kullanıcı mevcut hesabının bakiyesini görüntüleyebilir.

### **Birden Fazla Hesap Yönetimi**
- **Hesap Seçimi:** Kullanıcı, birden fazla hesap arasından işlem yapmak istediği hesabı seçebilir.
- **Yeni Hesap Ekleme:** Kullanıcı sisteme yeni bir hesap ekleyebilir.
- **Hesap Silme:** Kullanıcı mevcut bir hesabı sistemden silebilir.

### **İşlem Geçmişi**
- Yapılan tüm işlemler bir kayıt sistemine kaydedilir ve kullanıcı işlem geçmişini görüntüleyebilir.

### **Dinamik Kullanıcı Etkileşimi**
- Kullanıcı, menü üzerinden işlemlerini seçer ve işlem tamamlandığında menü tekrar gösterilir.
- Geçersiz girişlerde hata mesajları ile kullanıcı yönlendirilir.

---

## Teknik Detaylar

### **Kullanılan Konular**
1. **Değişkenler ve Veri Tipleri:** Hesap bilgileri ve bakiyeler için.
2. **Sınıflar, Yöntemler ve Nesneler:** `Account` sınıfı ile hesap işlemlerinin düzenlenmesi.
3. **Erişim Düzenleyiciler ve Kapsülleme:** Verilerin güvenli bir şekilde saklanması.
4. **Döngüler ve Yineleyiciler:** Menü sistemi ve hesap listesi için.
5. **Switch-Case Yapısı:** Menü işlemlerinin kullanıcı seçimlerine göre yönlendirilmesi.
6. **Diziler ve Liste Yapısı:** `ArrayList` ile birden fazla hesap saklanması.
7. **String Yöntemleri:** Hesap numarası ve kullanıcı bilgileriyle çalışma.
8. **Dinamik Veri Yönetimi:** Hesap ekleme, silme ve işlem geçmişi kayıtları.

### **Kullanıcı Arayüzü**
- Proje, konsol tabanlı bir kullanıcı arayüzü ile çalışmaktadır.
- Basit ve sezgisel menü sistemi kullanıcı işlemlerini kolaylaştırır.

---

## Kullanım

1. Program başlatıldığında kullanıcıya mevcut hesaplar listelenir ve işlem yapmak için bir hesap seçmesi istenir.
2. Kullanıcı seçili hesap üzerinde aşağıdaki işlemleri gerçekleştirebilir:
   - Para yatırma
   - Para çekme
   - Bakiye sorgulama
   - İşlem geçmişini görüntüleme
   - Yeni bir hesap ekleme
   - Mevcut bir hesabı silme
3. Kullanıcı işlem yapmak istediği hesabı değiştirebilir ya da programdan çıkış yapabilir.

---

## Menü Yapısı
```
==== Banka Hesap Yönetim Sistemi ====
1. Para Yatır
2. Para Çek
3. Bakiye Sorgula
4. Hesap Değiştir
5. Çıkış
6. İşlem Geçmişini Görüntüle
7. Yeni Hesap Ekle
8. Hesap Sil
```

---

## Örnek Çalışma Akışı

### **Başlangıç:**
```
==== Hesaplar ====
1. 123456 - Ahmet Yılmaz
2. 654321 - Ayşe Demir
3. 111222 - Mehmet Çelik
İşlem yapmak istediğiniz hesabın numarasını seçin (1-3): 1
Ahmet Yılmaz adlı hesabı seçtiniz.
```

### **İşlem Örneği:**
```
==== Banka Hesap Yönetim Sistemi ====
1. Para Yatır
2. Para Çek
3. Bakiye Sorgula
4. Hesap Değiştir
5. Çıkış
6. İşlem Geçmişini Görüntüle
7. Yeni Hesap Ekle
8. Hesap Sil
Bir seçim yapın: 1
Ne kadar yatırmak istiyorsunuz? 500
500.0 TL başarıyla yatırıldı.
```

### **İşlem Geçmişi:**
```
==== Banka Hesap Yönetim Sistemi ====
6. İşlem Geçmişini Görüntüle

İşlem Geçmişi:
- 500.0 TL yatırıldı.
- Bakiyeye bakıldı: 1500.0 TL
```

---


