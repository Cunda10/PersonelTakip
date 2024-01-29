package org.example;

public class PersonelListesi {
    public static void main(String[] args) {

        Personel personel1 = new Personel();
        Personel personel2 = new Personel();
        Personel personel3 = new Personel();

personel1.sicilNo = "200010";
personel1.Ad = "Ahmet";
personel1.Soyad = "Uyar";
personel1.Egitim ="lisans";
personel1.Departman ="Muhasebe";

personel2.sicilNo = "200011";
personel2.Ad = "Veli";
personel2.Soyad = "Düzgün";
personel2.Egitim = "Y.Lisans";
personel2.Departman = "Teknik Destek";


personel3.sicilNo = "200012";
personel3.Ad = "Mehmet";
personel3.Soyad = "Ünlü";
personel3.Egitim = "Lise";
personel3.Departman = "Güvenlik";


personel1.yazdir();
personel2.yazdir();
personel3.yazdir();



    }



}