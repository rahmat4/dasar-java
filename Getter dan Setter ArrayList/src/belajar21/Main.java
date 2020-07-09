package belajar21;

import java.util.ArrayList;
import java.util.List;

class SMK{
    private List<String> mahasiswa;

    List<String> getMahasiswa(){
        return mahasiswa;
    }

    void setMahasiswa(List<String> mahasiswa){
        this.mahasiswa = mahasiswa;
    }
}

public class Main {
    public static void main(String[] args) {
        SMK data = new SMK();
        ArrayList nama = new ArrayList<>();
        nama.add("rahmat");
        nama.add("akmal");
        nama.add("wirangga");
        nama.add(2343);

        data.setMahasiswa(nama);

        //System.out.println(nama);
        System.out.println(data.getMahasiswa());
        System.out.println("----------------------------");
        // nampilin semua data menggunakan looping
        for(int i=0;i<nama.size();i++){
            System.out.printf("%s\n",data.getMahasiswa().get(i));
        }
        System.out.println("----------------------------");
        // ubah data
        nama.set(0, "ilas");
        nama.set(1, "daus");
        nama.set(2, "mipta");
        nama.set(3, 2345);
        for(int i=0;i<nama.size();i++){
            System.out.printf("%s\n",data.getMahasiswa().get(i));
        }
        System.out.println("\n---------------------------------------\n");
        ArrayList kantongDoraemon = new ArrayList<>();
        kantongDoraemon.add("rambutan");
        kantongDoraemon.add(234);
        kantongDoraemon.add(23.67);
        kantongDoraemon.add('t');
        kantongDoraemon.add("tikus");

        kantongDoraemon.remove("tikus");
        System.out.println(kantongDoraemon);
        for(int i=0;i<kantongDoraemon.size();i++){
            System.out.printf("%s\n",kantongDoraemon.get(i));
        }

    }
}