package tugas.js.pkg05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class TUGAS1_KATA_TERAKHIR_BufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        String kata1 = "", kata2 = "", kata3 = "";
        
        try {
            System.out.print("Masukkan Kata Pertama : ");
            kata1 = dataIn.readLine();
            System.out.print("Masukkan Kata Kedua : ");
            kata2 = dataIn.readLine();
            System.out.print("Masukkan Kata Ketiga : ");
            kata3 = dataIn.readLine();
        }
    
    
    catch (IOException e ){
        System.out.println("Gagal membaca keyboard");
        }
    
        System.out.println(kata1 + " " + kata2 + " " + kata3);
    }
}
