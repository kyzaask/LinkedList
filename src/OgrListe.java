import java.util.Scanner;

public class OgrListe {
    OgrNode head = null;
    OgrNode tail = null;
    OgrNode temp = null;
    OgrNode temp2 = null;

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ort;
    String durum;

    Scanner scan = new Scanner(System.in);

    void ekle(){
        System.out.println("bilgisayar bölümüne kayıt olacak öğrenci bilgilerini giriniz:  ");
        System.out.print("numara    : "  ); numara=scan.nextInt();
        scan.nextLine();
        System.out.print("ad        : "  ); ad=scan.nextLine();
        System.out.print("soyad     : "  ); soyad=scan.nextLine();
        System.out.print("vize      : "  ); vize=scan.nextInt();
        System.out.print("final     : "); fin=scan.nextInt();

        OgrNode eleman = new OgrNode( numara,ad , soyad, vize, fin );


        if(head == null){
            head = eleman;
            tail = eleman;
            System.out.println("Bilgisayar bölümüne kayıt olacak öğrencilerin liste yapısı oluşturuldu" +
                    " ilk öğrenci eklendi");
        }else{
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numaralı öğrenci bölüme kayıt edildi ");

        }

    }

    void sil(){
        if(head == null){
            System.out.println("liste boş silinecek öğrenci yok.");
        }else{
            System.out.println("silmek istediğiniz öğrencinin numarasını giriniz.");
            numara= scan.nextInt();

            if(numara == head.numara && head.next == null){
                head = null;
                tail = null;
                System.out.println(numara + " numaralı öğrenci silindi, listede kayıtlı öğrenci kalmadı");
            }else if(numara == head.numara && head.next != null ){
                head = head.next;
                System.out.println(numara + " numaralı öğrenci silindi");
            }else {
                temp = head;
                temp2= head;
                while (temp.next != null){
                    if(numara == temp.numara){
                        temp2.next = temp.next;
                        System.out.println(numara + " numaralı öğrenci silindi");

                    }
                    temp2 = temp;
                    temp = temp.next;
                }if(numara == temp.numara) {
                    temp2.next = null;
                    tail = temp;
                    System.out.println(numara + " numaralı öğrenci silindi");
                }
            }

        }
    }

    void yazdir(){
        if(head == null){
            System.out.println("liste boş!!!!");
        }else{
            temp = head;
            while(temp != null){
                System.out.println(temp.numara + " numaralı öğrenci bilgileri ");
                System.out.println("***************************");
                System.out.println("ad       : " + temp.ad);
                System.out.println("soyad    : " + temp.soyad);
                System.out.println("vize     : " + temp.vize);
                System.out.println("final    : " + temp.fin);
                System.out.println("ortalama : " + temp.ort);
                System.out.println("durum    : " + temp.durum);
                System.out.println("***************************");

                temp = temp.next;

            }
        }
    }

    void enBasarılıOgrenci(){
        if(head == null){
            System.out.println("liste boş!!!!");
        }else{
            temp = head;
            double buyuk = temp.ort;
            while(temp != null){

                if( buyuk < temp.ort){
                    buyuk = temp.ort;

                    numara = temp.numara;
                    ad = temp.ad;
                    soyad = temp.soyad;
                    vize = temp.vize;
                    fin = temp.fin;
                    ort = temp.ort;
                    durum = temp.durum;
                }


                System.out.println("En başarılı öğrenci bilgileri");
                System.out.println("***************************");
                System.out.println("ad       : " + ad);
                System.out.println("soyad    : " + soyad);
                System.out.println("vize     : " + vize);
                System.out.println("final    : " + fin);
                System.out.println("ortalama : " + ort);
                System.out.println("durum    : " + durum);
                System.out.println("***************************");

                temp = temp.next;

            }
        }
    }






}
