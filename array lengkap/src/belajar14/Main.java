package belajar14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        String buah[] = new String[5];
        String meja[][] = new String[2][3]; // array multidimensi
        
        for(int i = 0; i < buah.length; i++){
            System.out.print("buah index ke - " + i + " = ");
            buah[i] = input.readLine();
        }
        System.out.println("----------------------------");

        for(String data : buah){
            System.out.println("nama buah = " + data);
        }

        System.out.println("\nArray multidimensi");
        for(int i = 0; i < meja.length; i++){
            for(int j = 0; j < meja[i].length; j++){
                System.out.printf("siapa yang akan duduk di meja %d , %d : ",i,j);
                meja[i][j] = input.readLine();
            }
        }
        System.out.println("----------------------------");
        System.out.println("looping menggunakan for each");
        for(String nama[] : meja){
            for(String data : nama){
                System.out.print("  | " +  data + " |  ");
            }
            System.out.println();
        }
        System.out.println("\nlooping biasa");
        for(int i = 0; i < meja.length; i++){
            for(int j = 0; j < meja[i].length; j++){
                System.out.printf("| %s | \t",meja[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nArray list");

        // add()      --> untuk menambah sesuatu ke dalam array
        // remove()   --> untuk menghapus sesuatu ke dalam array
        // size()     --> untuk mengambil ukuran array list
        // get(id)    --> untuk mengambil item dalam array list berdasarkan id atau indeks tertentu
        // isEmpty()  --> untuk memeriksa apakah array kosong atau tidak
        // indexOf()  --> untuk mengetahui index dari suatu nilai
        // contains() --> untuk memeriksa apakah suatu nilai ada dalam ArrayList
        // set()      --> untuk menimpa nilai pada index tertentu

        // ArrayList<tipedata> namaArrayList = new ArrayList<tipedata>();

        ArrayList kantongAjaib = new ArrayList(); // memasukan data random
        String senter = "senter pembesar";
        kantongAjaib.add(senter);
        kantongAjaib.add(3424);
        kantongAjaib.add("tikus");
        kantongAjaib.add(231.45);
        kantongAjaib.add(true);

        // menghapus array
        kantongAjaib.remove("tikus");

        // menampilkan isi array
        System.out.println(kantongAjaib);

        // menampilkan banyak isi array
        System.out.println("kantong ajaib : " + kantongAjaib.size() + " item");
        for(int i=0;i<kantongAjaib.size();i++){
            //System.out.printf("%s\n",kantongAjaib.get(i));
            System.out.println(kantongAjaib.get(i));
        }
    }
}