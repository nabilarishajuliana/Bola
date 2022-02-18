
package bola;

public class bola {
   private double jariJari,phi=3.14,diameter,luas,volume;
    
    public double  setJarijari (double jari){
        return jariJari=jari;
    }
    
     public double  showdiameter(){
        return jariJari*2;
    }
     
     public double  showLuasPermukaan(){
        return 4*Math.PI*Math.pow(jariJari, 2);
    }
     
     public double  showVolume(){
        return 4/3*Math.PI*Math.pow(jariJari, 3);
    } 
     
     public void cetak(){
         System.out.println("==============================================");
        System.out.println("dimater bola \t\t="+showdiameter()+"cm");
        System.out.println("Luas permukaan bola \t="+showLuasPermukaan()+"cm");
        System.out.println("Volume bola \t\t="+showVolume()+"cm");
       
        
    }  
}
