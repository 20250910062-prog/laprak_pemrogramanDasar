/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_mod3;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author DWI FEBRIYANTI
 */
public class TUGAS_mod3 {
    public static void main(String[] args) {
        Object[][] karyawan = {
            {"RADIT", "DIREKTUR", 10000000, 5000000},
            {"JANI", "MANAGER", 8000000, 3500000},
            {"DODI", "STAFF", 5000000, 2000000},
        };
        NumberFormat rupiah = NumberFormat.getInstance(
            new Locale("id", "ID")
        );
        System.out.println("=======================================================================");

        System.out.printf("%-5s %-12s %-15s %15s %15s%n",
                "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");

        System.out.println("========================================================================");
        for (int i = 0; i < karyawan.length; i++) {

            System.out.printf("%-5d %-12s %-15s %15s %15s%n",
                    i + 1,
                    karyawan[i][0],
                    karyawan[i][1],
                    rupiah.format(karyawan[i][2]),
                    rupiah.format(karyawan[i][3]));
        }

        System.out.println("=========================================================================");
    }
}
    
}
