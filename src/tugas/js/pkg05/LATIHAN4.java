package tugas.js.pkg05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */
public class LATIHAN4 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan ");
        
        try {
            System.out.print("Masukkan angka pertama :");
            a = dataIn.readLine();
            /* Data yang aka diproses aritmatika harus dikonversikan dulu dari tipe data
            String ke tipe data angka yang diperlukan. Data yang diperoleh dari inputan kelas BufferedReader 
            tipe datanya selalu String*/
            
            angka1 = Float.parseFloat(a); //konversi dari String ke float
            
            System.out.print("Masukkan angka kedua :");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);
            
            jumlah = angka1 + angka2;
            System.out.println("jumlah :"  + jumlah);
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
    }
}
