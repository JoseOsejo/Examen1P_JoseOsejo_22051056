/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metaverso;

import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class Escuadron
{
    private String nombre;
    private String lugarBase;
    private Persona lider;
    private String heroeVillanos;
    private ArrayList<Persona>miembros;

    public Escuadron(String nombre, String lugarBase,String heroeVillanos) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.lider = null;
        this.heroeVillanos = heroeVillanos;
        this.miembros = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public String isHeroeVillanos() {
        return heroeVillanos;
    }

    public void setHeroeVillanos(String heroeVillanos) {
        this.heroeVillanos = heroeVillanos;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", lugarBase=" + lugarBase + ", lider=" + lider + ", heroeVillanos=" + heroeVillanos + ", miembros=" + miembros + '}';
    }
    
    
    
}
