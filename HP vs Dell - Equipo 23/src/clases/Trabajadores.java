package clases;


import java.time.Duration;
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
    private int almacenPC;
    private int almacenPCG;
    int i=0;

    

@Override
public void run(){
    this.produccion();
    
}

public Trabajadores(int tiempo,int deadline) {
    this.tiempo=tiempo;
    this.deadline=deadline;

}

public void produccion(){
    
        try {
        
            
            while (dias!=deadline){
                
            System.out.println("Dia "+dias);
            System.out.println("Los productores estan trabajando");
            Thread.sleep(Duration.ofSeconds(tiempo));
                dias++;
                almacenRAM=almacenRAM+2;
                almacen_Fpoder=almacen_Fpoder+3;
                System.out.println("Los productores construyeron 2 RAM y 3 Fuentes de poder");
                pago=pago+40+34+20+26+16+50;
                System.out.println("PCs "+almacenPC);
                System.out.println("PCs graficas "+almacenPCG);
                if (almacenPlaca>0 &&almacenCPU>0&&almacenRAM>1&&almacen_Fpoder>3){
                    
                    this.almacenPlaca=this.almacenPlaca-1;
                    this.almacenCPU=this.almacenCPU-1;
                    this.almacenRAM=this.almacenRAM-2;
                    this.almacen_Fpoder=this.almacen_Fpoder-4;
                    
                    if ((i+1)%4==0){
                        System.out.println("Los emsambladores construyeron una Computadora con Grafica");
                        almacenPCG=almacenPCG+1;
                        i++;
                        this.almacenGrafica=this.almacenGrafica-1;
                        
                    }else{
                   
                    almacenPC=almacenPC+1;
                    i++;
                    
                    System.out.println("I "+i);
                    System.out.println("Los emsambladores construyeron una Computadora");
                    }
                }
                if (i==4){
                        i=0;
                    }
                    
                
                
                   //los que tardan 1 dia se suman y ya 
                   if (dias%2 ==0){
                       //se suman cada dos dias 
                       almacenPlaca=almacenPlaca+1;
                       System.out.println("Los productores construyeron 1 placa base ");
                   }
                   if (dias%3 ==0){
                       //se suman cada tres dias 
                       almacenGrafica=almacenGrafica+1;
                       almacenCPU=almacenCPU+1;
                       System.out.println("Los productores construyeron 1 Grafica y 1 CPU ");
                   }
                   
                   // si las piezas necesarias para la computadora estan listas computadora = true y hilo emsabladores se activa


}
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
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
