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
public class Deidad extends Extraterrestre {

    
    private boolean tieneCreyentes;
    private String religion;

    public Deidad(boolean tieneCreyentes, String religion, String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica);
        this.tieneCreyentes = tieneCreyentes;
        this.religion = religion;
    }

   

    public boolean isTieneCreyentes() {
        return tieneCreyentes;
    }

    public void setTieneCreyentes(boolean tieneCreyentes) {
        this.tieneCreyentes = tieneCreyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    
        
    
    @Override
    public void finalChance(Persona p1, Persona p2) {

    }

    @Override
    public String toString() {
        return "Deidad{" + "tieneCreyentes=" + tieneCreyentes + ", religion=" + religion + '}';
    }
 
    
}
