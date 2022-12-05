/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SoalN0_1;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class Penyanyi extends Pop{
    
    public static void main(String[] args) {
       Pop pop = new Pop ("Black Pink","How you like that");
       
       
       Dangdut dangdut = new Dangdut(); 
       pop.singer ("Eclat Story");
       pop.song("bentuk cinta");
       pop.cetakLabel();
       
       String penyanyi = "Joko Chandra";
       penyanyi = dangdut.penyanyi;
       dangdut.song("Via Vallen","Kopi dangdut");
       dangdut.cetakLabel();
    }
}
