/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul_2;

/**
 *
 * @author DWI FEBRIYANTI
 */
public class Modul_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String mk= "Pemrograman Dasar";
    double nilai_uts = 95.5;
    String nilai_uas = "85.5";
    double nilai_akhir = (nilai_uts + 
            Double.parseDouble(nilai_uas)) /2;
    System.out.println("Nama Matakuliah\t : " + mk);
    System.out.println("Nilai Akhir\t :" + nilai_akhir);
}
}