package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rgabr
 */
public class Compania extends Thread {
    float ganancias;
    float costos;
    float utilidad;
    String nombre;
    int cantidadTrabajadores;
    int produPlacas;
    int diasPlacas;
    int storagePlacas;
    int produCPU;
    int diasCPU;
    int storageCPU;
    int produRAM;
    int diasRAM;
    int storageRAM;
    int produFuentes;
    int diasFuentes;
    int storageFuentes;
    int produTarjetas;
    int diasTarjetas;
    int storageTarjetas;
    int produEnsambladores;
    int diasEnsambladores;
    int cantidadplacas;
    int costoPc;
    int cantidadCPU;
    int cantidadRAM;
    int cantidadFuentes;
    int costoPcgrafica;
    int frecuenciaGrafica;
    ProjectManager pm;
    Director director;
    Trabajadores tb;
    

    public Compania(String nombre, int cantidadTrabajadores, int diasPlacas, int diasCPU, int produRAM,int cantidadCPU,int cantidadRAM, int cantidadFuentes, int frecuenciaGrafica, int costoPc, int costoPcgrafica) {
        this.nombre = nombre;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.produPlacas = 1;
        this.diasPlacas = diasPlacas;
        this.storagePlacas = 25;
        this.produCPU = 1;
        this.diasCPU = diasCPU;
        this.storageCPU = 20;
        this.produRAM = produRAM;
        this.diasRAM = 1;
        this.storageRAM = 55;
        this.produFuentes = 3;
        this.diasFuentes = 1;
        this.storageFuentes = 35;
        this.produTarjetas = 1;
        this.diasTarjetas = 3;
        this.storageTarjetas = 10;
        this.produEnsambladores = 1;
        this.diasEnsambladores = 2;
        this.pm = new ProjectManager();
        this.director = new Director(pm);
        this.tb= new Trabajadores();
        this.cantidadplacas=1;
        this.cantidadCPU=cantidadCPU;
        this.cantidadRAM=cantidadRAM;
        this.cantidadFuentes=cantidadFuentes;
        this.frecuenciaGrafica=frecuenciaGrafica;
        this.costoPc = costoPc;
        this.costoPcgrafica = costoPcgrafica;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public int getProduPlacas() {
        return produPlacas;
    }

    public void setProduPlacas(int produPlacas) {
        this.produPlacas = produPlacas;
    }

    public int getDiasPlacas() {
        return diasPlacas;
    }

    public void setDiasPlacas(int diasPlacas) {
        this.diasPlacas = diasPlacas;
    }

    public int getStoragePlacas() {
        return storagePlacas;
    }

    public void setStoragePlacas(int storagePlacas) {
        this.storagePlacas = storagePlacas;
    }

    public int getProduCPU() {
        return produCPU;
    }

    public void setProduCPU(int produCPU) {
        this.produCPU = produCPU;
    }

    public int getDiasCPU() {
        return diasCPU;
    }

    public void setDiasCPU(int diasCPU) {
        this.diasCPU = diasCPU;
    }

    public int getStorageCPU() {
        return storageCPU;
    }

    public void setStorageCPU(int storageCPU) {
        this.storageCPU = storageCPU;
    }

    public int getProduRAM() {
        return produRAM;
    }

    public void setProduRAM(int produRAM) {
        this.produRAM = produRAM;
    }

    public int getDiasRAM() {
        return diasRAM;
    }

    public void setDiasRAM(int diasRAM) {
        this.diasRAM = diasRAM;
    }

    public int getStorageRAM() {
        return storageRAM;
    }

    public void setStorageRAM(int storageRAM) {
        this.storageRAM = storageRAM;
    }

    public int getProduFuentes() {
        return produFuentes;
    }

    public void setProduFuentes(int produFuentes) {
        this.produFuentes = produFuentes;
    }

    public int getDiasFuentes() {
        return diasFuentes;
    }

    public void setDiasFuentes(int diasFuentes) {
        this.diasFuentes = diasFuentes;
    }

    public int getStorageFuentes() {
        return storageFuentes;
    }

    public void setStorageFuentes(int storageFuentes) {
        this.storageFuentes = storageFuentes;
    }

    public int getProduTarjetas() {
        return produTarjetas;
    }

    public void setProduTarjetas(int produTarjetas) {
        this.produTarjetas = produTarjetas;
    }

    public int getDiasTarjetas() {
        return diasTarjetas;
    }

    public void setDiasTarjetas(int diasTarjetas) {
        this.diasTarjetas = diasTarjetas;
    }

    public int getStorageTarjetas() {
        return storageTarjetas;
    }

    public void setStorageTarjetas(int storageTarjetas) {
        this.storageTarjetas = storageTarjetas;
    }

    public int getProduEnsambladores() {
        return produEnsambladores;
    }

    public void setProduEnsambladores(int produEnsambladores) {
        this.produEnsambladores = produEnsambladores;
    }

    public int getDiasEnsambladores() {
        return diasEnsambladores;
    }

    public void setDiasEnsambladores(int diasEnsambladores) {
        this.diasEnsambladores = diasEnsambladores;
    }

    public ProjectManager getPm() {
        return pm;
    }

    public void setPm(ProjectManager pm) {
        this.pm = pm;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getCantidadplacas() {
        return cantidadplacas;
    }

    public void setCantidadplacas(int cantidadplacas) {
        this.cantidadplacas = cantidadplacas;
    }

    public int getCostoPc() {
        return costoPc;
    }

    public void setCostoPc(int costoPc) {
        this.costoPc = costoPc;
    }

    public int getCantidadCPU() {
        return cantidadCPU;
    }

    public void setCantidadCPU(int cantidadCPU) {
        this.cantidadCPU = cantidadCPU;
    }

    public int getCantidadRAM() {
        return cantidadRAM;
    }

    public void setCantidadRAM(int cantidadRAM) {
        this.cantidadRAM = cantidadRAM;
    }

    public int getCantidadFuentes() {
        return cantidadFuentes;
    }

    public void setCantidadFuentes(int cantidadFuentes) {
        this.cantidadFuentes = cantidadFuentes;
    }

    public int getCostoPcgrafica() {
        return costoPcgrafica;
    }

    public void setCostoPcgrafica(int costoPcgrafica) {
        this.costoPcgrafica = costoPcgrafica;
    }

    public Trabajadores getTb() {
        return tb;
    }

    public void setTb(Trabajadores tb) {
        this.tb = tb;
    }
    
    
   
    
}
