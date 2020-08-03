package belajar15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    static ArrayList listBuah = new ArrayList();
    static InputStreamReader reader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(reader);

    static void showAll(){
        if(listBuah.isEmpty()){
            System.out.println("belum ada data");
        }else{
            for(int i = 0; i < listBuah.size(); i++){
                System.out.printf("[%d] %s\n",i+1,listBuah.get(i));
            }
        }
    }

    static void insertBuah() throws IOException{
        System.out.print("nama buah : ");
        String nama = input.readLine();
        listBuah.add(nama);
    }

    static void editBuah() throws IOException{
        showAll();
        System.out.print("pilih nomer buah : ");
        int indexBuah = Integer.valueOf(input.readLine());
        System.out.print("masukan nama baru : ");
        String newName = input.readLine();

        listBuah.set(indexBuah-1, newName);
    }

    static void deleteBuah() throws IOException{
        showAll();
        System.out.print("pilih nomer buah : ");
        int indexNamaBuah = Integer.valueOf(input.readLine());
        listBuah.remove(indexNamaBuah-1);
    }

    static void showMenu()throws IOException{
        System.out.println("\n======= Menu =======");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.println("=====================");
        System.out.print(" pilih no : ");
        int option = Integer.valueOf(input.readLine());

        switch(option){
            case 1 :
            showAll();
            break;
            case 2 :
            insertBuah();
            break;
            case 3 :
            editBuah();
            break;
            case 4 :
            deleteBuah();
            break;
            case 5 :
            System.exit(0);
            break;
            default :
            System.out.println("pilihan salah");
            break;
        }
    }
    public static void main(String[] args)throws IOException {
        while(true){
            showMenu();
        }
    }    
}
