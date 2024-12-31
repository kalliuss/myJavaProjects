# Banka Hesap Yönetim Sistemi

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
