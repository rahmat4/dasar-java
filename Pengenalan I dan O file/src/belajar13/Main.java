package belajar13;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        FileOutputStream fileoutput = null;
        try{
            fileoutput = new FileOutputStream("output.txt");
        }finally{
            if(fileoutput != null){
                fileoutput.close();
            }
        }
    }
}