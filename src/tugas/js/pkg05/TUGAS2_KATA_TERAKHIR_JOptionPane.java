package tugas.js.pkg05;

import javax.swing.JOptionPane;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class TUGAS2_KATA_TERAKHIR_JOptionPane {
    public static void main(String[] args) {
        String kata1 = "", kata2 = "", kata3 = "";
        
        kata1 = JOptionPane.showInputDialog("Masukkan Kata Pertama : ");
        kata2 = JOptionPane.showInputDialog("Masukkan Kata Kedua : ");
        kata3 = JOptionPane.showInputDialog("Masukkan Kata Ketiga : ");
        
        String msg = kata1 + " " + kata2 + " " + kata3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(kata1 + " " + kata2 + " " + kata3);
    }
}
