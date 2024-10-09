

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    
/**
 *
 * @author rgabr
 */
public class Trabajadores {
    float sueldo;
    int tiempo_produccion;
    int almacen;

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
