/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DWI FEBRIYANTI
 */
public class MOD_2D {
  public static void main (String[]args) throws I0Exception{
      String nama, mk, prodi = null;
      String nilai;
      try (BufferedReader bufferedReader = new
BufferedReader (new InputStreamReader(System.in))){
          System.out.print("Siapa Nama Anda : ");
          nama= bufferedReader.readLine();
           System.out.print("Nama Matakuliah : ");
          mk = bufferedReader.readLine();
           System.out.print("Program studi : ");
          prodi= bufferedReader.readLine();
           System.out.print("Nilai Anda : ");
          nilai= bufferedReader.readLine();
          
          System.out.println("--HASIL INPUTAN--");
          System.out.println("Nama\t :" + nama);
          System.out.println("Matakuliah\t :" + mk);
          System.out.println("Program studi\t :" +prodi);
          System.out.println("Nilai MK\t :" + nilai);
          
          
          
          
      } catch (IOException ex) {
          Logger.getLogger(MOD_2D.class.getName()).log(Level.SEVERE, null, ex);
      }
  }  
}
