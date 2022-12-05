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
public class Pop {
    String penyanyi = "Raisa";
    String lagu = "Kali kedua";

    Pop() {
    }
    Pop (String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu  = lagu;
        
        System.out.println(this.penyanyi+"<=>"+this.lagu);
        
    }
    public void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    protected void song (){
        this.lagu = lagu;
    }
    private void cetakTabel(){
        System.out.println(this.penyanyi+"<=>"+this.lagu);
    }

    void song(String bentuk_cinta) {
        
    }

    void cetakLabel() {
        
    }
}
