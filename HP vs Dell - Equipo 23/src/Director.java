/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rgabr
 */



import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rgabr
 */
public class Director extends Thread {
    String trabajo= "Director" ;
    int salario=60;
    int pago;
    
    
    public void TrabajoDir(int horas,int dias,int deadline ){
        System.out.println("El "+ this.trabajo +" comienza a trabajar ");
        try {
             while (horas <24){
        System.out.println("El "+ this.trabajo +" comienza a trabajar ");
        //if (deadline==dias){
            //enviar computadoras 24 horas
            //almacen de compus =0
            System.out.println("El "+trabajo+" esta enviando las computadoras");
            Thread.sleep(24000);
            System.out.println("El "+trabajo+" termino de enviar las computadoras");
            //compania.ganancias=compania.ganancias+
                   
        //}else{
           Math.random();
        //s}
             }
        } catch (InterruptedException ex) {
                    Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
}
