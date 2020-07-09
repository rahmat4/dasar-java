package belajar23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList hewan = new ArrayList<>();

        hewan.add("kucing");
        hewan.add("ayam");
        hewan.add("burung");
        hewan.add("angsa");
        hewan.add("kambing");
        hewan.add("sapi");
        hewan.add("jerapoa");
        hewan.add("singa");

        Iterator iterator = hewan.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n--------------------------\n");

        ArrayList angka = new ArrayList<>();

        angka.add(1234);
        angka.add(1256);
        angka.add(3456);
        angka.add(6790);
        angka.add(5621);
        angka.add(4590);

        ListIterator<Integer> list = angka.listIterator();

        while(list.hasNext()){
            // memodifikasi nilai
            int elemen = list.next();
            list.set(elemen + 1000);
        }

        Iterator iterator1 = angka.iterator();

        while(iterator1.hasNext()){
            Object elemen = iterator1.next();
            System.out.println(elemen);
        }

        System.out.println("\n--------------------------\n");
        
        while(list.hasPrevious()){
            Object elemen = list.previous();
            System.out.println(elemen);
        }
    }
}