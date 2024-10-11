package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rgabr
 */



import interfaces.SettingsView;
import java.time.Duration;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rgabr
 */
public class Director extends Thread {
    String trabajo = "Director" ;
    int salario = 60;
    int pago;
    int horas;
    Semaphore semaphore;
    int dias;
    int deadline;
    int revision = (int)(Math.random()*24+1);
    ProjectManager pm;
    Trabajadores tb;
    int faltas;
    int tiempo;
    String accion;
    int ganancias;

    public Director(ProjectManager pm, Trabajadores tb) {
        this.semaphore = new Semaphore(5);
        SettingsView settings = new SettingsView();
        this.deadline= Integer.parseInt(settings.getDead());
        this.tiempo=Integer.parseInt(settings.getDay());        
        this.dias = 0;
        //this.deadline = ;
        this.pm = pm;
        this.tb=tb;
        //this.tiempo=tiempo;
        
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
    @Override
    public void run(){
       this.TrabajoDir();
    }
    public void TrabajoDir( ){
        try {
        while (dias!=deadline){
            revision = (int)(Math.random()*24+1);
            System.out.println("El "+ this.trabajo +" comienza a trabajar ");
            this.accion="Trabajando";
            System.out.println("El Director revisara al Project Manager a la hora "+revision);
            
              
           
           if (this.revision <16){
               //pm falta +1 y pago-100 
               Thread.sleep(Duration.ofSeconds(tiempo));
               System.out.println("EL Director atrapo al Project Manager viendo anime");
               accion="El Director atrapo al Project Manager viendo anime ";
               faltas = faltas+1;
               System.out.println("Faltas "+faltas);//no sirve :(
               dias++;
        
             }else{
            Thread.sleep(Duration.ofSeconds(tiempo));
            System.out.println("El Director no atrapo al Project Manager");
               System.out.println("Faltas "+faltas);
               dias++;
               pago=pago+salario*24;
           }
        }
           if (deadline==dias){
            //enviar computadoras 24 horas
            //almacen de compus =0
            System.out.println("El "+trabajo+" esta enviando las computadoras");
            Thread.sleep(Duration.ofSeconds(tiempo));
            System.out.println("El "+trabajo+" termino de enviar las computadoras");
            
            
            //compania.ganancias=compania.ganancias+
           }
        
        } catch (InterruptedException ex) {
                    Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public ProjectManager getPm() {
        return pm;
    }

    public void setPm(ProjectManager pm) {
        this.pm = pm;
    }

    public Trabajadores getTb() {
        return tb;
    }

    public void setTb(Trabajadores tb) {
        this.tb = tb;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
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
