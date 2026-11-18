import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int para = 10000;
        int secenek;

        do {
            System.out.println("Bankanizda " + para + " TL var. Ne yapmak istersiniz?");
            System.out.println("1: Bakiye Goruntuleme");
            System.out.println("2: Para Yatirma");
            System.out.println("3: Para Cekme");
            System.out.println("4: Cikis");
            System.out.print("Seciminiz: ");

            secenek = sc.nextInt();

            if (secenek == 1) {
                System.out.println("Sayin Kullanicimiz, Bakiyeniz " + para + " TL'dir.");
            } 
            else if (secenek == 2) {
                System.out.print("Kac Turk Lirasi yatirmak istersiniz? ");
                int ekle = sc.nextInt();

                if (ekle <= 0) {
                    System.out.println("Hata: 0 veya negatif bir tutar yatiramazsiniz!");
                } else {
                    para = para + ekle;
                    System.out.println(ekle + " TL yatirildi. Yeni bakiyeniz: " + para + " TL");
                }
            } 
            else if (secenek == 3) {
                System.out.print("Kac Turk Lirasi cekmek istersiniz? ");
                int cek = sc.nextInt();

                if (cek <= 0) {
                    System.out.println("Hata: Gecersiz tutar girdiniz!");
                } else if (cek > para) {
                    System.out.println("Hata: Yetersiz bakiye! En fazla " + para + " TL cekebilirsiniz.");
                } else {
                    para = para - cek;
                    System.out.println(cek + " TL cekildi. Kalan bakiyeniz: " + para + " TL");
                }
            } 
            else if (secenek == 4) {
                System.out.println("Cikis yapiliyor... Bizi tercih ettiginiz icin tesekkurler!");
            } 
            else {
                System.out.println("Hatali secim! Lutfen 1 ile 4 arasinda bir sayi giriniz.");
            }

        } while (secenek != 4);
    }
}