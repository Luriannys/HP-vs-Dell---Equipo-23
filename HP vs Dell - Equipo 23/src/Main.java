/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Luriannys Junco
 */
public class Main {
   public int horas=0;
   public int dias=0;
   int deadline=30;
    
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Multithread hilo =new Multithread();
        Proyect_Manager hilo1 =new Proyect_Manager();
        Director hilo2=new Director();

        hilo.start();
        //constructors y cambiar por .start
        hilo1.TrabajoPM(0, 0);
        hilo2.TrabajoDir(0, 0,30);
    }
    
}