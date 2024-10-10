/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rgabr
 */



import java.util.concurrent.Semaphore;
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
    int horas;
    Semaphore semaphore;
    int dias;
    int deadline;
    int revision = (int)(Math.random()*24+1);
    Project_Manager pm;

    public Director(int horas, Semaphore semaphore, int dias, int deadline, Project_Manager pm) {
        this.horas = horas;
        this.semaphore = semaphore;
        this.dias = dias;
        this.deadline=deadline;
        this.pm=pm;
        
    }
    
    
    
    @Override
    public void run(){
       this.TrabajoDir();
    }
    public void TrabajoDir( ){
        try {
        while (dias!=deadline){
        
        System.out.println("El "+ this.trabajo +" comienza a trabajar ");
            System.out.println("El Director revisara al Project Manager a la hora "+revision);
              
           
           if (this.revision <16){
               //pm falta +1 y pago-100 
               Thread.sleep(revision*2000);
               System.out.println("EL Director atrapo al Project Manager viendo anime");
               int faltas = this.pm.getFaltas()+1;
               System.out.println("Faltas "+this.pm.getFaltas());//no sirve :(
        
             }else{
               Thread.sleep(48000);
               System.out.println("El Director no atrapo al Project Manager");
               System.out.println("Faltas "+this.pm.getFaltas());
            dias++;
           }
        }
           if (deadline==dias){
            //enviar computadoras 24 horas
            //almacen de compus =0
            System.out.println("El "+trabajo+" esta enviando las computadoras");
            Thread.sleep(24000);
            System.out.println("El "+trabajo+" termino de enviar las computadoras");
            //compania.ganancias=compania.ganancias+
           }
        
        } catch (InterruptedException ex) {
                    Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
    
}
