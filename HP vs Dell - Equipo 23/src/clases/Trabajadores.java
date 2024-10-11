package clases;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
   
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
    private Compania compania;
    int cantidad;
    

    

@Override
public void run(){
    this.produccion();
    
}

public Trabajadores() {
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
               
                if ("HP".equals(compania.getNombre())){
                    almacenRAM=almacenRAM+compania.getProduPlacas();
                    almacen_Fpoder=almacen_Fpoder+compania.getProduFuentes();
                    System.out.println("Los productores construyeron 2 RAM y 3 Fuentes de poder");
                    pago=pago+40+34+20+26+16+50;
                    System.out.println("PCs "+almacenPC);
                    System.out.println("PCs graficas "+almacenPCG);
                    if (almacenPlaca>0 &&almacenCPU>0 &&almacenRAM>1 && almacen_Fpoder>3){
                    
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
                    
                    
                    System.out.println("Los emsambladores construyeron una Computadora");
                    }
                }
                if (i==4){
                        i=0;
                    }
                                    
                   //los que tardan 1 dia se suman y ya 
                 
                   if (dias%3 ==0){
                       //se suman cada tres dias 
                       almacenGrafica=almacenGrafica+compania.getProduTarjetas();
                       almacenCPU=almacenCPU+1;
                       System.out.println("Los productores construyeron 1 Grafica, 1 CPU y Placa base ");
                   }
                }else{
                    almacenRAM=almacenRAM+compania.getProduRAM();
                    almacen_Fpoder=almacen_Fpoder+compania.getProduFuentes();
                    System.out.println("Los productores construyeron 3 RAM y 3 Fuentes de poder");
                    pago=pago+40+34+20+26+16+50;
                    System.out.println("PCs "+almacenPC);
                    System.out.println("PCs graficas "+almacenPCG);
                    if (almacenPlaca>0 &&almacenCPU>4&&almacenRAM>5&&almacen_Fpoder>4){
                    
                    this.almacenPlaca=this.almacenPlaca-1;
                    this.almacenCPU=this.almacenCPU-5;
                    this.almacenRAM=this.almacenRAM-6;
                    this.almacen_Fpoder=this.almacen_Fpoder-5;
                    
                    if ((i+1)%5==0){
                        System.out.println("Los emsambladores construyeron una Computadora con Grafica");
                        almacenPCG=almacenPCG+1;
                        i++;
                        this.almacenGrafica=this.almacenGrafica-1;
                        
                    }else{
                   
                    almacenPC=almacenPC+1;
                    i++;
                    
                    
                    System.out.println("Los emsambladores construyeron una Computadora");
                    }
                }
                if (i==4){
                        i=0;
                    }
                    
                
                
                   //los que tardan 1 dia se suman y ya 
                   if (dias%2 ==0){
                       //se suman cada dos dias 
                       almacenPlaca=almacenPlaca+compania.getProduPlacas();
                       almacenCPU=almacenCPU+compania.getProduCPU();
                       System.out.println("Los productores construyeron 1 placa base y 1 CPU ");
                   }
                   if (dias%3 ==0){
                       //se suman cada tres dias 
                       almacenGrafica=almacenGrafica+compania.getProduTarjetas();
                       
                       System.out.println("Los productores construyeron 1 Grafica ");
                   }
                }
                   
                   


}
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }
    
    public void proceso(){
        while (dias!=deadline){
          try{      
            System.out.println("Dia "+dias);
            System.out.println("Los productores estan trabajando");
            
                Thread.sleep(Duration.ofSeconds(tiempo));
            
                dias++;
                if ("HP".equals(compania.getNombre())){
                    almacenRAM=almacenRAM+compania.getProduPlacas();
                    almacen_Fpoder=almacen_Fpoder+compania.getProduFuentes();
                    System.out.println("Los productores construyeron "+compania.getProduRAM()+" RAM y "+compania.getProduFuentes()+"  Fuentes de poder");
                    pago=pago+40+34+20+26+16+50;
                    System.out.println("PCs "+almacenPC);
                    System.out.println("PCs graficas "+almacenPCG);
                    if (almacenPlaca>compania.getCantidadplacas() &&almacenCPU>compania.getCantidadCPU() &&almacenRAM>compania.getCantidadRAM() && almacen_Fpoder>compania.getCantidadFuentes()){
                    
                    this.almacenPlaca=this.almacenPlaca-1;
                    this.almacenCPU=this.almacenCPU-1;
                    this.almacenRAM=this.almacenRAM-2;
                    this.almacen_Fpoder=this.almacen_Fpoder-4;
                    }
                     if ((i+1)%4==0){
                        System.out.println("Los emsambladores construyeron una Computadora con Grafica");
                        almacenPCG=almacenPCG+1;
                        i++;
                        this.almacenGrafica=this.almacenGrafica-1;
                        
                    }else{
                   
                    almacenPC=almacenPC+1;
                    i++;
                    
                    
                    System.out.println("Los emsambladores construyeron una Computadora");
                    }
                }
                if (i==4){
                        i=0;
                    }
                                    
                   //los que tardan 1 dia se suman y ya 
                 
                   if (dias%3 ==0){
                       //se suman cada tres dias 
                       almacenGrafica=almacenGrafica+compania.getProduTarjetas();
                       almacenCPU=almacenCPU+1;
                       System.out.println("Los productores construyeron 1 Grafica, 1 CPU y Placa base ");
                   }
                
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
