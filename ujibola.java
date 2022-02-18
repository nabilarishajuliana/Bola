
package bola;

import java.util.Scanner;

public class ujibola {

    public static void main(String[] args) {
        Scanner masukkan=new Scanner(System.in);
        double jariJari;
        System.out.print("masukkan jari jari=");
        jariJari=masukkan.nextDouble();
        
        bola bola = new bola ();
        bola.setJarijari(jariJari);
        bola.showdiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        bola.cetak();
    }
    
}
