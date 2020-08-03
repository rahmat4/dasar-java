package latihanarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    static ArrayList list = new ArrayList();
    static InputStreamReader reader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(reader);

    static void showAllMenu()throws IOException{
        System.out.println("\n===== CRUD BUAH ====");
        System.out.println(" [1]. show buah");
        System.out.println(" [2]. insert buah");
        System.out.println(" [3]. update nama buah");
        System.out.println(" [4]. delete buah");
        System.out.println(" [5]. exit");
        System.out.println("====================");
        System.out.print(" Pilih : ");
        int option = Integer.valueOf(input.readLine());

        switch (option) {
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                updateBuah();
                break;
            case 4:
                daleteBuah();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }
    }

    static void showAllBuah()throws IOException{
        if(list.isEmpty()){
            System.out.println("Buah tidak ada.....");
        }else{
            for(int i=0;i<list.size();i++){
                System.out.printf("[%d]. %s",i,list.get(i) + "\n");
            }
        }
    }

    static void insertBuah()throws IOException{
        System.out.print("insert buah : ");
        String nama = input.readLine();
        list.add(nama);
    }

    static void updateBuah()throws IOException{
        showAllBuah();
        System.out.print("Pilih buah : ");
        int index = Integer.valueOf(input.readLine());
        System.out.print("Masukan nama baru : ");
        String nama = input.readLine();
        list.set(index, nama);
    }

    static void daleteBuah()throws IOException{
        showAllBuah();
        System.out.print("Pilih buah : ");
        int index = Integer.valueOf(input.readLine());
        list.remove(index);
    }

    public static void main(String[] args)throws IOException{
        while (true) {
            showAllMenu();
        }        
    }
}
