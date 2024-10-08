
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

    public Main(Semaphore semaforo,int id) {
        this.semaphore=semaforo;
        this.id=id;
        
    }
    @Override
    public void run(){
        try {
            
            System.out.println("PM esta llegando");
            System.out.println("Director esta llegando");
            semaphore.acquire();
            while (horas<24){
                while (horas<17){
                System.out.println("PM esta trabajando");

                Thread.sleep(3000);
                System.out.println("PM esta viendo anime");
                Thread.sleep(1000);
                horas++;
                }
                horas++;

                if (horas >23){
                    dias++;
                    horas=0;
                   //los que tardan 1 dia se suman y ya 
                   if (dias%2 ==0){
                       //se suman cada dos dias 
                   }
                   if (dias%3 ==0){
                       //se suman cada tres dias 
                   }
                   // si las piezas necesarias para la computadora estan listas computadora = true y hilo emsabladores se activa


                }
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public static void main(String[] args) {
        Semaphore semaforo= new Semaphore(3);
       
        Thread t =new Thread(new Main(semaforo,2));
        Thread t1 =new Thread(new Main(semaforo,1));
        //multithread
        
        t.start();
   
        System.out.println("Fuera del HIloooo");
        
    }
   
   /* public void run(){
        System.out.println("En el Hilooo");
       try {
           sleep(100000000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    */
    
}
