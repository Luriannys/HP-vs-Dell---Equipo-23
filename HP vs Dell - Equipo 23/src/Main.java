
import interfaces.PrincipalView;
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
    public int deadline=30;

    public Main(Semaphore semaforo,int id) {
        this.semaphore=semaforo;
        this.id=id;
        
    } 
   public static void main(String[] args) {
       
       //Iniciar interfaz
       
       PrincipalView principalView = new PrincipalView();
       principalView.setVisible(true);
       
       
       
        //Compania hp= new Compania();
        Semaphore semaforo= new Semaphore(3);
        Project_Manager pm =new Project_Manager(0,semaforo,0);
        Thread t =new Thread(pm);
        Thread t1 =new Thread(new Director(0,semaforo,0,30,pm));
        //multithread
        
        t.start();
        t1.start();
   
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
