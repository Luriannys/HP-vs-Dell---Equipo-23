package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class ProjectManager extends Thread{
    String trabajo= "Project Manager" ;
    int salario=40;
    int pago;
    int faltas=0;
    int horas=0;
    Semaphore semaphore;
    public int dias=0;
    int deadline;
    int tiempo;
    String accion;

    public ProjectManager() {
        SettingsView settings = new SettingsView();
        this.deadline= Integer.parseInt(settings.getDead());
        this.tiempo=Integer.parseInt(settings.getDay());
        this.horas = 0;
        this.semaphore = new Semaphore(5);
        this.dias = 0;
        //this.tiempo=tiempo;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    
    
    @Override
    public void run(){
       this.TrabajoPM();
    }
    
    public void TrabajoPM(){
        try {
        System.out.println("El "+ this.trabajo +" comienza a trabajar ");
        while (dias!=deadline){
            while (horas <17){
            System.out.println("El "+this.trabajo+" esta trabajando");  
            accion="Trabajando";
            Thread.sleep(Duration.ofSeconds(tiempo/48));
            System.out.println("El "+this.trabajo+" esta viendo anime");
            accion="Viendo anime";
            Thread.sleep(Duration.ofSeconds(tiempo/48));
            this.pago=this.pago+this.salario;
            horas++;
            System.out.println("Pasaron "+this.horas+" hora(s)");
            
            }
            if (horas>16){
            System.out.println("El "+this.trabajo+" esta trabajando");
            accion="Trabajando";
            Thread.sleep(Duration.ofSeconds(tiempo/24));
            horas++;
            }
            System.out.println("Pasaron "+this.horas+" hora(s)");
            if (horas==24){
                horas=0;
                dias++;
                pago=pago+salario*24-100*faltas;
            }
            
        
        }
        
        } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
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

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
}
}