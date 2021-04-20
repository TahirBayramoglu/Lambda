package streamOrnekler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03Integer {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(-2);
        liste.add(4);
        liste.add(12);
        liste.add(15);
        liste.add(-1);
        liste.add(500);
        liste.add(-15);
        System.out.println("EN BUYUK DEGER : " + buyukBul(liste));
        System.out.println("EN BUYUK DEGER : " + enBuyukBul(liste));
        System.out.println("EN BUYUK DEGER : " + enBuyukBul2(liste));
        System.out.println("EN KUCUK DEGER : " + kucukBul(liste));
        System.out.println("DEGERLER CARPIMI : " + carpimBul(liste));
        System.out.println("Listedeki 9 lar : " + dokuzSay(liste));
        System.out.println("NEGATIF SAYI LISTESI : " + negatifSayiListesi(liste));
        negatifSayilariYazdir(liste);
        List<Integer> negatifler = negatifSayiListesi(liste);
        System.out.println("\n Tek Sayilarin Sirali Karesi : " + tekKareSiraliListele(liste) );
    }

    public static int buyukBul(List<Integer> liste) {
        return liste.stream().reduce(0, (x, y) -> x > y ? x : y);
    }

    public static int enBuyukBul(List<Integer> liste) {
        return liste.stream().reduce(0, Math::max);
    }

    public static int enBuyukBul2(List<Integer> liste) {
        return liste.stream().sorted().reduce(0, (x, y) -> y);

    }

    public static int kucukBul(List<Integer> liste) {
        return liste.stream().sorted().reduce(0, (x, y) -> x < y ? x : y);
    }

    public static int carpimBul(List<Integer> liste) {
        return liste.stream().sorted().reduce(0, (x, y) -> x * y);
    }

    //Liste icerisinde kac tane 9 sayisi bulunmaktadir.
    //bunu bulan bir method bulalim
    public static int dokuzSay(List<Integer> liste) {
        return (int) liste.stream().filter(x -> x == 9).count();
    }

    //Listedeki negatif sayilari ayri bir liste olarak dönduren metodu yazalim.
    public static List<Integer> negatifSayiListesi(List<Integer> liste) {

        return liste.stream().filter(x-> x<0).collect(Collectors.toList());

    }
    // Liste formatinda olmadan yazdirma method negatifleri
    public static void negatifSayilariYazdir(List<Integer> liste){
        liste.stream().filter(x-> x<0).forEach(System.out::println);
    }

    //Listedeki tek elemanlarin karelerini sirali olarak ve tekrarsiz
    //bir sekilde listeye keydeden methodu yaziniz.
    public static List<Integer> tekKareSiraliListele(List<Integer> liste){
        return liste.
                stream().
                distinct().
                filter(Methodlar::tekMi).
                map(x-> x*x).
                distinct().
                sorted().           //sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }

}
