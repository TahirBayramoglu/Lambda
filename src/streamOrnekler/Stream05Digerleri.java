package streamOrnekler;

import java.util.List;
import java.util.stream.*;

public class Stream05Digerleri {
        public static void main(String[] args) {

            System.out.println("TOPLAM:" + topla(4));
            System.out.println("TOPLAM:" + topla1(4));
            toplaYazdir(4);
            System.out.println("==========");
            tekSayilariToplaYazdir(1,7);
            System.out.println("Faktoriyel= " + faktoriyel(5));
            System.out.println("Faktaoriyel 2= " + faktoriyel2(10));
            System.out.println("Faktoriyel 3= " + faktoriyel3( 25));
        }
        //****************************************************************************************************
        // ÖRNEK25: 1'den belirtilen değere kadar olan tamsayıları toplayan ve sonucu döndüren metodu yazınız.
        //****************************************************************************************************
        public static int topla(int deger){
            return IntStream.range(1,  deger + 1).sum();
        }
        public static int topla1(int deger){
            return IntStream.rangeClosed(1,  deger).sum();
        }
        public static void toplaYazdir(int deger){
            IntStream.rangeClosed(1,deger).forEach(System.out::println);
        }

        //****************************************************************************************************
        // ÖRNEK26: Berlirtilen aralıktaki tek sayıların toplamını yazdıran metodu tanımlayınız.
        //****************************************************************************************************
        public static void tekSayilariToplaYazdir(int alt, int ust){
            System.out.println(IntStream.rangeClosed(alt,ust).filter(Methodlar::tekMi).sum());
        }

        //****************************************************************************************************
        // ÖRNEK27: Berlirtilen sayının faktoriyelini hesaplayan metodunu tanımlayınız.
        //****************************************************************************************************
        public static int faktoriyel(int n){
            return IntStream.rangeClosed(1,n).reduce(1,(x,y)->x*y);
        }

        public static Long faktoriyel2(int n) {
            return LongStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);

        }

        public static double faktoriyel3 (int n){
            return DoubleStream.iterate(1, t->t+1).limit(n).reduce(1,(x,y)->x*y);
        }

        //Bir double diziyi Stream nesnesine donusturerek bu dizi icersinde
       //bulunan sayilarin 50 den buyuk olanlarini ayri bir listeye kaydederek
      // yazdiran methodu tanimlayiniz

        public static List<Double> doubleDiziCevirList(){
            Double [] notlar = {88.5,52.3,88.9,100.0,99.6,42.0,10.0};

            Stream<Double> streamNotlar = Stream.of(notlar);
            return streamNotlar.filter(t-> t>50.0).collect(Collectors.toList());
        }
    }
