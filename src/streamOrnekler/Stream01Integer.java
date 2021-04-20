package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

import static streamOrnekler.Methodlar.ciftleriYazdir;

public class Stream01Integer {

    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(2);
        rakamlar.add(4);
        rakamlar.add(-1000);
        rakamlar.add(4);

        rakamlar.stream().filter(t-> t%2 !=0).forEach(System.out::println);
        System.out.println("===============================");
        rakamlar.stream().filter(t-> t%2 ==0).forEach(System.out::println);
        System.out.println("===============================");
        rakamlar.stream().filter(t-> t%2 ==0).forEach(Methodlar::yazdir);
        System.out.println("===============================");
        rakamlar.stream().filter(Methodlar::tekMi).forEach(Methodlar::yazdir);
        System.out.println("===============================");
        System.out.println("\n ======== Ciftleri Yazdir(Method)======");
        ciftleriYazdir(rakamlar);

    }


}
