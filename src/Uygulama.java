import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {
        int secim = -1;
        OgrListe bilBolum = new OgrListe();
        Scanner input = new Scanner(System.in);

        while (secim !=0) {
            System.out.println();
            System.out.println("bilgisayar bölümü öğrenci kayıt uygulaması");
            System.out.println("1- yeni kayıt ");
            System.out.println("2- kayıt sil");
            System.out.println("3- kayıtları listele ");
            System.out.println("4- en başarılı öğrenci bilgileri ");
            System.out.println("5- çıkış ");
            System.out.print("seçiminiz : ");

            secim = input.nextInt();
            switch (secim) {
                case 1:
                    bilBolum.ekle();
                    break;
                case 2:
                    bilBolum.sil();
                    break;
                case 3:
                    bilBolum.yazdir();
                    break;
                case 4:
                    bilBolum.enBasarılıOgrenci();
                    break;
                case 5:
                    System.out.println("programı sonlandırdınız.....");
                    break;
                default:
                    System.out.println("hatalı değer girdiniz");
            }
        }
    }
}
