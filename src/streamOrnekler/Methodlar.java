package streamOrnekler;

import java.util.List;

public class Methodlar {
    public static void ciftleriYazdir(List<Integer> liste){
        liste.stream().filter(x-> x%2 ==0).forEach(x-> System.out.println(x));
    }

    public static boolean tekMi(int x){
        return x % 2 != 0;
    }


    public static void yazdir(int x){
        System.out.print(x + " ");
    }
}
