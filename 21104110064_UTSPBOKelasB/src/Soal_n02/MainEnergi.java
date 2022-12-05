/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Soal_n02;

import java.util.Scanner;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class MainEnergi {
   
    public static void main(String[] args) {
        double massa;
        double kecepatan;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Massanya = ");
        massa  = scanner.nextDouble();
        System.out.println("Masukkan Kecepatannya = ");
        kecepatan  = scanner.nextDouble();
        
        
        Kinetic kinetic = new Kinetic();
        kinetic.setEnergiKinetik(massa,kecepatan);
        System.out.println("Energi Kinetiknya = "+ kinetic.getEnergiKinetik() );
        
    }
}
