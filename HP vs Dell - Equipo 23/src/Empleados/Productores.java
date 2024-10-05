package Empleados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rgabr
 */
public class Productores extends Trabajadores {
    String tipo_productor; 

    public Productores(String tipo_productor, float sueldo, int tiempo_produccion, int almacen) {
        super(sueldo, tiempo_produccion, almacen);
        this.tipo_productor = tipo_productor;
        if (this.tipo_productor == "Placa base"){
            this.sueldo= 20;
            this.tiempo_produccion=3;
            this.almacen=25;
        } else if(this.tipo_productor == "CPU") {
            this.sueldo= 26;
            this.tiempo_produccion=3;
            this.almacen=20;
        }else if(this.tipo_productor == "RAM") {
            this.sueldo= 40;
            this.tiempo_produccion=1/2;
            this.almacen=55;
        }else if(this.tipo_productor == "Fuente de poder") {
            this.sueldo= 16;
            this.tiempo_produccion=1/3;
            this.almacen=35;
        }else if(this.tipo_productor == "Graficas") {
            this.sueldo= 34;
            this.tiempo_produccion=1/3;
            this.almacen=10;
        }else if(this.tipo_productor == "Ensamblador") {
            this.sueldo= 50;
            this.tiempo_produccion=2;
            this.almacen=999999;
        }
    }

    public String getTipo_productor() {
        return tipo_productor;
    }

    public void setTipo_productor(String tipo_productor) {
        this.tipo_productor = tipo_productor;
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
