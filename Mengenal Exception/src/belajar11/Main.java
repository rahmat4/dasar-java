package belajar11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int array[] = {1,2,3,4,5};

        Scanner user = new Scanner(System.in);
        FileInputStream fileinput = null;
        System.out.print("nilai array ke - : ");
        int index = user.nextInt();

        // exception handling (try , catch , finally)
        System.out.println("\nHandling out of bound");
        try{
            System.out.printf("index ke - %d adalah %d",index,array[index]);
        }catch(Exception e){
            System.out.println(e);
        }

        // runtime eror jika file tidak ada
        System.out.println("\nHandling IO not found");
        try{
            fileinput = new FileInputStream("input.txt");
        }catch(IOException e){
            System.out.println(e);
        }

        // menggabungkan dua exception
        System.out.println("\nMenggabungkan dua buah exception");
        try{
            System.out.printf("index ke - %d adalah %d",index,array[index]);
            fileinput = new FileInputStream("input.txt");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("jumlah index yang anda masukan tidak ada dalam array");
        }catch(IOException e){
            System.err.println("\nfile tidak di temukan");
        }

        // finally
        System.out.println("\nMenambahkan finally");
        try{
            System.out.printf("index ke - %d adalah %d",index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("jumlah index yang anda masukan tidak ada dalam array");
        }finally{
            System.out.println("\nFinally");
        }

        System.out.println("\nakhir dari program");
    }
}