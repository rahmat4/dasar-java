package belajar18;

import java.util.HashMap;
import java.util.Map;

class books{
    private String title;
    private String author;

    books(String title, String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return this.title;
    }

    void setTitle(String value){
        this.title = value;
    }

    String getAuthor(){
        return this.author;
    }

    void setAuthor(String value){
        this.author = value;
    }
}

public class Hasmap{
    public static void main(String[] args){
        books java = new books("Dasar Java","Petani Kode");
        books cpp = new books("Dasar cpp","Kelas Terbuka");
        books python = new books("Dasar python","Dicoding");
        HashMap<String,books> buku = new HashMap<String,books>();

        buku.put("Java", java);
        buku.put("cpp", cpp);
        buku.put("python", python);
        

        for(Map.Entry show : buku.entrySet()){
            books book = (books) show.getValue();
            System.out.println(show.getKey() + " : " + book.getTitle() + " --> " + book.getAuthor());
        }
    }
}
