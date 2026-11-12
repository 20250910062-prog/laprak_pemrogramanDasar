/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2;
import javax.swing.JOptionPane;
/**
 *
 * @author DWI FEBRIYANTI
 */
public class PostTest_java {
    public static void main (String [] args){
        String nama = JOptionPane.showInputDialog(null, "Nama Lengkap: ");
        String nim = JOptionPane.showInputDialog(null, "NIM: ");
        String Prodi = JOptionPane.showInputDialog(null, "Prodi: "); 
        String Fakultas = JOptionPane.showInputDialog(null, "Fakultas:  ");
        
    JOptionPane.showMessageDialog( null, 
            "--HASIL INPUTAN--\n"
        + "Nama         : " + nama + "\n"
        + "NIM          : " + nim + "\n"
        + "Program Studi: " + Prodi + "\n"
        + "Fakultas     : " + Fakultas,
            "Kartu Tanda Mahasiswa",
            JOptionPane.INFORMATION_MESSAGE);  
    }
}  
