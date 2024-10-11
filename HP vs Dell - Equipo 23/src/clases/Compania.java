package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rgabr
 */
public class Compania {
    int deadline;
    float ganancias;
    float costos;
    float utilidad;
    String nombre;
    
    

    public Compania(int deadline) {
        this.deadline = deadline;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public float getCostos() {
        return costos;
    }

    public void setCostos(float costos) {
        this.costos = costos;
    }

    public float getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(float utilidad) {
        this.utilidad = utilidad;
    }
            
    
}
