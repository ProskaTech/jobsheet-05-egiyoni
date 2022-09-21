package tugas.js.pkg05;

import java.util.Scanner;

/* @author 21343005_EGI YONI SANDRA */
public class LATIHAN1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan NIM: ");
        int NIM = in.nextInt();
        
        System.out.print("Masukkan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.print("\nNama : " + nama + 
                        "\nNIM : " + NIM + 
                        "\nNilai " + nilai);
        
    }
}
