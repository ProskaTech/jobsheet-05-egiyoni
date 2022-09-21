package tugas.js.pkg05;

import java.util.Scanner;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class TUGAS1_KATA_TERAKHIR_SCANNER {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan Kata Pertama : ");
    String word1 = in.nextLine();
    
    System.out.print("Masukkan Kata Kedua : ");
    String word2 = in.nextLine();
    
    System.out.print("Masukkan Kata Ketiga : ");
    String word3 = in.nextLine();
    
    System.out.println(word1 + " " + word2 + " " + word3);
    }
}
