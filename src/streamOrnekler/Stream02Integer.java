package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream02Integer {

    public static void main(String[] args){
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(15);
        System.out.println("TOPLAM" + tekKupToplami(liste));

    }

    public static void teKareYazdir(List <Integer> l){
        l.stream().filter(Methodlar::tekMi).distinct().map(x->x*x).forEach(Methodlar::yazdir);

    }

    public static Integer tekKupToplami(List<Integer> l){
       //return l.stream().filter(Stream01Integer::tekMi).map(x-> x*x*x).reduce(0,(x,y)-> (x+y));
      // return l.stream().filter(Stream01Integer::tekMi).map(x-> x*x*x).reduce(Math::addExact );
        return l.stream().filter(Methodlar::tekMi).map(x-> x*x*x).reduce(0,Integer::sum);

    }

}
