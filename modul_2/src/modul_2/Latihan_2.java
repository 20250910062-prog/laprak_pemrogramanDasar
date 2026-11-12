/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2;
import java.io.*;
/**
 *
 * @author DWI FEBRIYANTI
 */
public class Latihan_2 {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nilai MP  : ");
        double mp = Double.parseDouble(br.readLine());
        System.out.print("Nilai UTS : ");
        double uts = Double.parseDouble(br.readLine());
        System.out.print("Nilai UAS : ");
        double uas = Double.parseDouble(br.readLine());

        double nilaiAkhir = 6 * (mp + 2 * uts + 2 * uas) / 10;
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}   
