package belajar20;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> days = new HashMap<Integer,String>();

        days.put(1, "senin");
        days.put(2, "selasa");
        days.put(3, "rabu");
        days.put(4, "kamis");
        days.put(5, "jumat");
        days.put(6, "sabtu");
        days.put(7, "minggu");

        for(Map.Entry hasil : days.entrySet()){
            System.out.println(hasil.getKey() + " : " + hasil.getValue());
        }
    }
}