package belajar18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> days = new HashMap<Integer,String>();

        days.put(1, "senin");
        days.put(2, "selasa");
        days.put(3, "rabu");
        days.put(3, "rabu"); // jika ada data yang sama maka akan di abaikan
        days.put(4, "kamis");
        days.put(5, "jumat");
        days.put(6, "sabtu");
        days.put(7, "minggu");

        // menampilkan isi dari HashMap
        System.out.println(days);
        for(Map.Entry show : days.entrySet()){
            System.out.println(show.getKey() + " : " + show.getValue());
        }
        // mengambil salah satu nilai dari HashMap
        System.out.println("hari ke 2 = " + days.get(2));
        // menghapus nilai dari HashMap
        System.out.println(days.remove(2)); // menghapus salah satu nilai dari HashMap
        // mengubah nilai dan kata kunci dari HashMap
        System.out.println(days.put(1, "minggu")); // apa bila belum ada akan di tambah
        System.out.println(days.replace(4, "senin"));
        days.clear();
        System.out.println(days); // menghapus semua nilai dari Hashmap
    }
}