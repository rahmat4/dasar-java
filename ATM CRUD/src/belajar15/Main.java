package belajar15;

import java.util.Scanner;
import java.lang.NullPointerException;

public class Main {
    static Boolean ketemu;
    public static void main(String[] args)throws NullPointerException{
        Scanner user = new Scanner(System.in);
        int noRek,n = 0,i;
        int noRekening[] = new int[200];
        String nama[] = new String[200];
        int saldo[] = new int[200];

            System.out.println("========= ATM CRUD ========");
            System.out.println(" [1] Daftar Nasabah");
            System.out.println(" [2] Nabung");
            System.out.println(" [3] Tarik tunai");
            System.out.println(" [4] Tampil Daftar Nasabah");
            System.out.println(" [5] Cari Nasabah");
            System.out.println(" [6] Delete Nasabah");
            System.out.println(" [7] Edit Nasabah");
            System.out.println(" [8] Exit");
            System.out.println("===========================");
            System.out.print(" pilih [1-8] : ");
            int option = user.nextInt();

            if(option == 1){
                System.out.print("masukan no rekening : ");
                noRek = user.nextInt();
                for(i=0;i<n;i++){
                    if(noRek == noRekening[i])
                        ketemu = true;
                    else
                        ketemu = false;
                    
                }
                if(ketemu){
                    System.out.println("no rekening tersebut telah di gunakan");
                }else{
                    System.out.println("masukan nama : ");
                    nama[n] = user.next();
                    System.out.print("masukan saldo awal Rp.");
                    saldo[n] = user.nextInt();
                }
                n=+1;
                noRekening[i] = noRek;
            }
    }
}