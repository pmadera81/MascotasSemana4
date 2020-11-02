package com.pmadera.mascotas.pojo;

import java.util.Date;

public class Mascota {
    private String nombre;
    private String raza;
    private int añoNacimiento;
    private String colorPelo;
    private int foto;
    private int cantRaiting;

    public Mascota(String nombre, String raza, int añoNacimiento, String colorPelo, int foto) {
        this.nombre = nombre;
        this.raza = raza;
        this.añoNacimiento = añoNacimiento;
        this.colorPelo = colorPelo;
        this.foto = foto;
        //cantRaiting=0;
    }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getCantRaiting() {
        return cantRaiting;
    }

    public void setCantRaiting(int cantRaiting) {
        this.cantRaiting = cantRaiting;
    }

    public void incrementarRaiting(){
        cantRaiting++;
    }

}
