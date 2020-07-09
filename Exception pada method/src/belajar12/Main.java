package belajar12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int array[] = {1,2,3,4};
        System.out.print("index ke - : ");
        int index = user.nextInt();
        // exception biasa
        System.out.println("exception biasa");
        try{
            System.out.printf("data dari array ke - %d adalah %d\n\n",index,array[index]);
        }catch(Exception e){
            System.err.println(e);
        }

        // exception dalam fungsi
        System.out.println("exception dalam fungsi");
        int data = ambilData(array, index);
        System.out.printf("data dari array ke - %d adalah %d\n",index,data);

        // exception throws by method
        System.out.println("exception throws by method");
        int data1 = 0;
        try{
            data1 = ambil(array, index);
        }catch(Exception e){
            System.err.println(e);
        }
        System.out.printf("data dari array ke - %d adalah %d\n",index,data1);

        System.out.println("\nakhir dari program");
    }
    private static int ambil(int array[],int index) throws Exception{
        return array[index];
    }

    private static int ambilData(int array[],int index){
        int hasil = 0;
        try{
           hasil = array[index];
        }catch(Exception e){
            System.err.println(e);
        }
        return hasil;
    }
}