package clases;


import interfaces.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Luriannys Junco
 */
public class Main extends Thread{
    
    private Semaphore semaphore;
    private int id;
    public int horas;
    public int dias;
    public boolean computadora;
    public int deadline;
    
    
    

    public Main(Semaphore semaforo,int id) {
        this.semaphore=semaforo;
        this.id=id;
        
    } 
   public static void main(String[] args) {
       
       //Iniciar interfaz
       
       
       
       
       int tiempo=48;
       int deadline=30;
        //Compania hp= new Compania();
        Semaphore semaforo= new Semaphore(3);
        ProjectManager pm =new ProjectManager();
        Thread t =new Thread(pm);
        Thread t1 =new Thread(new Director(pm));
        Thread t2=new Thread(new Trabajadores());
        
        //multithread
        
        t.start();
        t1.start();
        t2.start();
        System.out.println("Fuera del HIloooo");
        
        PrincipalView principalView = new PrincipalView();
       principalView.setVisible(true);
        
    }
   

    
}
