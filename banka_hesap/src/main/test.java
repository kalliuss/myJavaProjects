package main;

import bankasistemi.BankaMusterisi;

public class test {
    public static void main(String[] args) {
        BankaMusterisi isbank = new BankaMusterisi("Tahir", "Bilgili", 1500.0);
        isbank.paraYatir(500);
        isbank.paraCek(300);
        isbank.hesapOzet();

    }
}
