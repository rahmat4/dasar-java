package belajar24;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList buah = new LinkedList<>();
        // LinkedList itu lebih fokus ke dalam aspek memanipulasi data
        // seperti insert , dan delete 

        buah.add("jambu");
        buah.add("rambutan");
        buah.add("kelengkeng");
        buah.add("semangka");
        buah.add("apel");

        System.out.println(buah);
        for(int i=0;i<buah.size();i++){
            System.out.printf("%s\n",buah.get(i));
        }
        System.out.println("------------------------------");
        buah.addFirst("durian"); // menambah elemen paling atas
        buah.addLast("strawberi"); // menambah elemen paling bawah

        System.out.println(buah);
        for(int i=0;i<buah.size();i++){
            System.out.printf("%s\n",buah.get(i));
        }
        System.out.println("------------------------------");
        buah.set(1, "pir"); // mengubah elemen berdasarkan index
        buah.set(2, "anggur");
        buah.set(3, "melon");

        System.out.println(buah);
        for(int i=0;i<buah.size();i++){
            System.out.printf("%s\n",buah.get(i));
        }
        System.out.println("------------------------------");
        System.out.println(buah.getFirst()); // mengambil data paling atas
        System.out.println(buah.getLast()); // mengambil data paling bawah
        System.out.println(buah.get(1)); // mengambil buah berdasarkan index
        System.out.println(buah.get(4));
        System.out.println("------------------------------");
        buah.removeFirst(); // menghapus buah urutan paling atas
        buah.removeLast(); // menghapus buah urutan paling bawah
        buah.remove(1); // menghapus buah berdasarkan index
        System.out.println(buah);
        // mengecek apakah data pada buah kosong
        if(buah.isEmpty()){
            System.out.println("data tidak ada");
        }else{
            System.out.println("data ada");
        }

        // mengecek apakah sebuah elemen ada didalam LinkedList
        if(buah.contains("semangka")){
            System.out.println("data di temukan");
        }else{
            System.out.println("data tidak di temukan");
        }

        System.out.println("\n---------------------------\n");
        LinkedList dataDiri = new LinkedList<>();

        dataDiri.add("rahmat pratama");
        dataDiri.add(17);
        dataDiri.add(3.9);
        dataDiri.add('A');

        System.out.println(dataDiri);
        for(int i=0;i<dataDiri.size();i++){
            System.out.printf("%s\n",dataDiri.get(i));
        }
    }
}