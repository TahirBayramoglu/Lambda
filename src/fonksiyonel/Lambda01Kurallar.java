package fonksiyonel;

import java.util.Arrays;
import java.util.List;

public class Lambda01Kurallar {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
        liste.forEach(x -> System.out.println(x));


        System.out.print("======================== \n");
        // Listenin elemanlarini iki artirarak yazalim
        liste.forEach(t -> System.out.println(t + 2 + " "));

        System.out.println("\n Eger satir sayisi 1´den fazla ise {} kullanmaliyiz..");
        liste.forEach(t -> {
            int miktar = 2;
            System.out.println(t + miktar + " ");

        });

        System.out.print("Veri tipi kullanilirsa Explicit \n");
        liste.forEach((Integer x) -> System.out.print(x * 2 + " "));

        System.out.println("\n Bir dis degiskem kullanalim \n");
        int deger = 6;
        liste.forEach(t -> System.out.println(t + deger));

        //Metot Referansi =====> Class adi :: Metot adi
        System.out.println("Method referans kullanimi");
        liste.forEach(System.out::println);
        System.out.println("Method referans kullanimi");
        liste.forEach(Lambda01Kurallar::yazdir);

    }


        public static void yazdir(int x){
            System.out.print(x + " ");
        }

    }
