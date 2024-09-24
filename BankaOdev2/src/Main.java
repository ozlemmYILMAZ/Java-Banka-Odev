import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        Banka banka = new Banka();
//        banka.bankaName = "Java Bank";
//        System.out.println("Banka Adı: " + banka.bankaName);
//
//
//        ArrayList<Musteri> musteriler = new ArrayList<>();
//
//
//        Kredi kredi1 = new Kredi();
//        kredi1.krediTutari = 10000;
//        kredi1.faizOrani = 0.05;
//        kredi1.vade = 12;
//
//        Musteri musteri1 = new Musteri();
//        musteri1.musteriAdi = "Ali";
//        musteri1.musteriSoyadi = "Veli";
//        musteri1.kredi = kredi1;  // Müşteriye kredi atanıyor
//
//
//        Kredi kredi2 = new Kredi();
//        kredi2.krediTutari = 15000;
//        kredi2.faizOrani = 0.04;
//        kredi2.vade = 24;
//
//        Musteri musteri2 = new Musteri();
//        musteri2.musteriAdi = "Ayşe";
//        musteri2.musteriSoyadi = "Yılmaz";
//        musteri2.kredi = kredi2;
//
//
//        musteriler.add(musteri1);
//        musteriler.add(musteri2);
//
//
//        MusteriTemsilcisi temsilci = new MusteriTemsilcisi();
//        temsilci.temsilciAdi = "Ahmet";
//
//
//        double toplamOdeme1 = musteri1.kredi.krediTutari +
//                (musteri1.kredi.krediTutari * musteri1.kredi.faizOrani * musteri1.kredi.vade);//kredi ödeme hesaplama
//
//        System.out.println("\nMüşteri: " + musteri1.musteriAdi + " " + musteri1.musteriSoyadi);
//        System.out.println("Kredi Tutarı: " + musteri1.kredi.krediTutari);
//        System.out.println("Faiz Oranı: " + musteri1.kredi.faizOrani);
//        System.out.println("Vade: " + musteri1.kredi.vade);
//        System.out.println("Toplam Ödenecek Tutar: " + toplamOdeme1);
//
//
//
//
//        double toplamOdeme2 = musteri2.kredi.krediTutari +
//                (musteri2.kredi.krediTutari * musteri2.kredi.faizOrani * musteri2.kredi.vade);
//        System.out.println("\nMüşteri: " + musteri2.musteriAdi + " " + musteri2.musteriSoyadi);
//        System.out.println("Kredi Tutarı: " + musteri2.kredi.krediTutari);
//        System.out.println("Faiz Oranı: " + musteri2.kredi.faizOrani);
//        System.out.println("Vade: " + musteri2.kredi.vade);
//        System.out.println("Toplam Ödenecek Tutar: " + toplamOdeme2);
//    }

        Musteri musteri = create(1, "kerem", "topuz");

        System.out.println(musteri.musteriAdi);
        for (int i = 0; i < createMusteriList().size(); i++) {
            System.out.println(createMusteriList().get(i).musteriAdi);


        }
        for (Musteri musteri1 : createMusteriList()) {
            System.out.println(musteri1.musteriAdi);
        }


        List<Musteri> musteriList = createMusteriList();
    }


    private static List<Musteri> createMusteriList() {
        List<Musteri> musteriList = new ArrayList<>();
        Musteri musteri = create(1, "kerem", "topuz");
        musteriList.add(musteri);
        Musteri musteri1 = create(1, "kerem", "topuz");
        musteriList.add(musteri1);
        return musteriList;
    }


    private static Musteri create(int musteriId, String musteriAdi, String musteriSoyadi) {

        Musteri musteri = new Musteri();
        musteri.musteriId = musteriId;
        musteri.musteriAdi = musteriAdi;
        musteri.musteriSoyadi = musteriSoyadi;


        return musteri;
    }
}

