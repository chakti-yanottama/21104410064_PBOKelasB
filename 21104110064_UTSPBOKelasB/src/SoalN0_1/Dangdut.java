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
public class Dangdut {
        String penyanyi = "Ayu Tingting";
        String lagu      = "Alamat Palsu";
 

    public Dangdut() {
    }
        
        void singer (String penyanyi){
            
            this.penyanyi = penyanyi;
        }
        
        public void song(String lagu, String song ){
            this.lagu = lagu;
        
        }
        

        void cetakLabel (){
            System.out.println(this.penyanyi+"<=>"+this.lagu);
        }
}
