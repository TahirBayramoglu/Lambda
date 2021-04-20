package streamOrnekler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream04String {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();

        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jacksson");
        liste.add("amanda");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("alonzo");
        liste.add("Alfonso");
        liste.add("Tucker");
        liste.add("Christ");

        aIleBaslayanlar(liste);
        System.out.println("====================");
        buyukHarfeCevir(liste);
        System.out.println("====================");
        System.out.println("Tum elemanlar belirtilen degerden kucuk: " + uzunlukKucukMu(liste, 7));
        System.out.println("====================");
        System.out.println("Baslayan Yok mu:" + baslamayanHarfVarMi(liste, "M"));
        System.out.println("Herhangi Biten Harf Var Mi: " +herhangiBitenVarMi(liste,"c"));
        System.out.println("====================");
        aileOYazdir(liste);
        System.out.println("====================");
        listeleYazdir(liste);
        System.out.println("====================");
        yazdir(liste);

    }

    //Listedeki bas harfi A ile baslayan isimleri yazdiran methodu tanimlayalim.

    public static void aIleBaslayanlar(List<String> liste) {

        liste.stream().filter(h -> h.startsWith("A")).forEach(System.out::println);
    }

    public static void buyukHarfeCevir(List<String> liste) {
        liste.stream().map(h -> h.toUpperCase()).forEach(System.out::println);
    }
    //Listedeki tum elemanlari uzunluklarina göre siralayan
    // ve kucuk harfe ceviren ve yazdiran metodu tanimlayalim...

    public static void uzulugaGöreSiralaVeKucult(List<String> liste) {
        liste.stream().
                sorted(Comparator.comparing(t -> t.length())).
                map(t -> t.toLowerCase()).
                forEach(System.out::println);
    }

    //Listedeki tum elemnamlari uzunluklari belirtilen uzunluktan kucuk mu
    //diye kontrol eden metodu tanimlayalim.

    public static boolean uzunlukKucukMu(List<String> liste, int uzunluk) {
        return liste.stream().allMatch(t -> t.length() < uzunluk);

    }

    //Listedeki TUM elemanlarin belirtilen harf ile baslamadigini kontrol edn methodu yaziniz.

    public static boolean baslamayanHarfVarMi(List<String> liste, String harf){
        return liste.stream().noneMatch(t-> t.startsWith("harf"));
    }

    //Listedeki herhangi eleman belirtilen bir harf ile bitiyor mu diye kontrol eden methodu yaziniz.

    public static boolean herhangiBitenVarMi(List<String> liste, String harf){
        return liste.stream().anyMatch(t-> t.endsWith(harf));
    }

    // A ile baslayip O ile biten elemanlari yazdiran methodu tanimlayiniz.
    public static void aileOYazdir(List<String> liste){
        liste.stream().
                filter(x -> x.startsWith("A") && x.endsWith("o")).
                forEach(System.out::println);
    }

    //Asagidaki formata göre listedeki her bir elemanin uzunlugunu yazdiran methodu yaziniz.
    //Ali: 3       MArk: 4       Amnda: 6  vb

    public static void listeleYazdir (List<String> liste){
        liste.stream().sorted(Comparator.comparing(String::length)).
                map(t-> t + " : " + t.length() + "\t").
                forEach(System.out::print);
    }

    public static void yazdir(List<String> liste){
        liste.stream().
                map(String::toLowerCase).
                filter(t-> t.startsWith("a")).
                forEach(System.out::println);
    }
}
