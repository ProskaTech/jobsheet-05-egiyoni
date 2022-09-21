package tugas.js.pkg05;

import javax.swing.JOptionPane;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */
public class LATIHAN5 {
    public static void main(String[] args){
        String name ="", hoby="";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hoby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "jadi Hobi Anda "  + hoby +". " + "Hobi Yang Bagus " + name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda " + hoby + ". Hobi Yang Bagus " + name);
    }
}
