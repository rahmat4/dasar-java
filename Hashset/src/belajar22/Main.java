package belajar22;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet show = new HashSet<>();

        show.add("rahmat");
        show.add("X TKJ2");
        show.add(10);
        show.add(34.6);
        show.add('y');
        System.out.println(show);
        show.remove("rahmat");
        System.out.println(show);
        show.remove(10);
        System.out.println(show);

        System.out.println("\n------------------------\n");
        HashSet<Integer> show1 = new HashSet<>();
        show1.add(1);
        show1.add(2);
        show1.add(3);
        show1.add(4);
        show1.add(5);
        show1.add(3);
        show1.add(4);
        show1.add(5);
        // sifat Hashset jika ada data yang sama maka akan di abaikan
        System.out.println(show1);
    }
}