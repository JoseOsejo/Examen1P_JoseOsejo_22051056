/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metaverso;

/**
 *
 * @author jcoq2
 */
public abstract class Persona 
{
    protected String nombre;
    protected String poder;
    protected String debilidad;
    protected String heroeVillano;
    protected int fuerza;
    protected int habilidadMental;
    protected int habilidadFisica;
    protected boolean tieneEscuadron;

    public Persona(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroeVillano = heroeVillano;
        this.fuerza = fuerza;
        this.habilidadMental = habilidadMental;
        this.habilidadFisica = habilidadFisica;
        this.tieneEscuadron = tieneEscuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroeVillano() {
        return heroeVillano;
    }

    public void setHeroeVillano(String heroeVillano) {
        this.heroeVillano = heroeVillano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadMental() {
        return habilidadMental;
    }

    public void setHabilidadMental(int habilidadMental) {
        this.habilidadMental = habilidadMental;
    }

    public int getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidadFisica(int habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTieneEscuadron() {
        return tieneEscuadron;
    }

    public void setTieneEscuadron(boolean tieneEscuadron) {
        this.tieneEscuadron = tieneEscuadron;
    }

    public abstract void finalChance(Persona p1, Persona p2);
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", heroeVillano=" + heroeVillano + ", fuerza=" + fuerza + ", habilidadMental=" + habilidadMental + ", habilidadFisica=" + habilidadFisica + ", tieneEscuadron=" + tieneEscuadron + '}';
    }
    
    
    
    
}
