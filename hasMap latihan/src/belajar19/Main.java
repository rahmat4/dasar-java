package belajar19;

import java.util.HashMap;
import java.util.Map;

class Buku{
    private String title;
    private String author;

    Buku(String title, String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<String,Buku> books = new HashMap<>(); // --> ini bisa
        //HashMap books = new HashMap(); // --> ini juga bisa

        Buku belajarJava = new Buku("java dasar", "petani kode");
        Buku belajarKotlin = new Buku("kotlin dasar", "dicoding");
        Buku belajarPython = new Buku("python dasar", "codepolitan");

        books.put("java", belajarJava);
        books.put("kotlin", belajarKotlin);
        books.put("python", belajarPython);

        for(Map.Entry b : books.entrySet()){
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey() + " : " + buku.getTitle() + " | " + buku.getAuthor());
        }
    }
}