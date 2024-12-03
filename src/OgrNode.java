//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OgrNode {
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ort;
    String durum;

    OgrNode next;

    public OgrNode(int numara,String ad, String soyad, int vize, int fin) {
        this.ad = ad;
        this.fin = fin;
        this.next = next;
        this.numara = numara;
        this.soyad = soyad;
        this.vize = vize;

        ort = vize * 0.4 + fin * 0.6;

        if(ort>=50){
            durum = "geçti";
        }else {
            durum = "Kaldı";

        }
        next = null;

    }
}