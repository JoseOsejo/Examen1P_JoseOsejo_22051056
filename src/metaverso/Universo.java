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
public class Universo 
{
    private String nombre;
    private ArrayList<Escuadron>escaudrones;

    public Universo(String nombre) {
        this.nombre = nombre;
        this.escaudrones = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getEscaudrones() {
        return escaudrones;
    }

    public void setEscaudrones(ArrayList<Escuadron> escaudrones) {
        this.escaudrones = escaudrones;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", escaudrones=" + escaudrones + '}';
    }
    
    
}
