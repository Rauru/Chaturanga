/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga;

/**
 *
 * @author Rauru
 */
public class puntuaciones {
    static String[] records = new String[10];
    
    public static void agregarp(String n1,String n2,int c){
        for(int cont=0;cont<records.length;cont++){
            if(cont>1){
                records[cont]=records[cont-1];
            }
        }
        records[0]="el jugador"+n1+"ah ganado al jugador"+n2+"con"+c+"piezas";
    }
    
    static void puntuacion(){
        for(String p:records){
            System.out.println(p);
        }
    }
    
    
}
