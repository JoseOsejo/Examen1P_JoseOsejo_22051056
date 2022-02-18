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
public class PorAccidenteRadioactivo extends Persona
{
    private int edadAlMomentoAccidente;
    private String tipoAccidente;

    public PorAccidenteRadioactivo(int edadAlMomentoAccidente, String tipoAccidente, String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.edadAlMomentoAccidente = edadAlMomentoAccidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAlMomentoAccidente() {
        return edadAlMomentoAccidente;
    }

    public void setEdadAlMomentoAccidente(int edadAlMomentoAccidente) {
        this.edadAlMomentoAccidente = edadAlMomentoAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }
    
    @Override
    public void finalChance(Persona p1, Persona p2){
        
    }

    @Override
    public String toString() {
        return "PorAccidenteRadioactivo{" + "edadAlMomentoAccidente=" + edadAlMomentoAccidente + ", tipoAccidente=" + tipoAccidente + '}';
    }
    
}
