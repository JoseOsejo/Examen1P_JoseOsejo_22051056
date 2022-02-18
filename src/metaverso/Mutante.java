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
public class Mutante extends Persona
{

    private ArrayList<String> factoresMutantes;

    public Mutante(ArrayList<String> factoresMutantes, String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.factoresMutantes = factoresMutantes;
    }

    public ArrayList<String> getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }

    @Override
    public void finalChance(Persona p1, Persona p2) {
        
    }
    
    
    
}
