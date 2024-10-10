
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    
/**
 *
 * @author rgabr
 */
public class Trabajadores extends Thread{
    float sueldo;
    int tiempo_produccion;
    int almacen;
    int pago;
    String tipo; //Lo decide en config
    int tiempo;
    int dias =0;
    int deadline;
    private int almacenRAM;
    private int almacen_Fpoder;
    private int almacenPlaca;
    private int almacenGrafica;
    private int almacenCPU;

    

@Override
public void run(){
    this.produccion();
    
}

public Trabajadores(int tiempo,int deadline) {
    this.tiempo=tiempo;
    this.deadline=deadline;

}

public void produccion(){
    while (dias!=deadline){
        System.out.println("Los productores estan trabajando");
        try {
            Thread.sleep(24000);
                dias++;
                almacenRAM=almacenRAM+2;
                almacen_Fpoder=almacen_Fpoder+3;
                
                   //los que tardan 1 dia se suman y ya 
                   if (dias%2 ==0){
                       //se suman cada dos dias 
                       almacenPlaca=almacenPlaca+1;
                   }
                   if (dias%3 ==0){
                       //se suman cada tres dias 
                       almacenGrafica=almacenGrafica+1;
                       almacenCPU=almacenCPU+1;
                   }
                   // si las piezas necesarias para la computadora estan listas computadora = true y hilo emsabladores se activa


                
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }
    }
    

    public Trabajadores(float sueldo, int tiempo_produccion, int almacen) {
        this.sueldo = sueldo;
        this.tiempo_produccion = tiempo_produccion;
        this.almacen = almacen;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getTiempo_produccion() {
        return tiempo_produccion;
    }

    public void setTiempo_produccion(int tiempo_produccion) {
        this.tiempo_produccion = tiempo_produccion;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }
    

  
    
    
}
