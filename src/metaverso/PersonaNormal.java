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
public class PersonaNormal extends Persona
{

    public PersonaNormal(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica);
    }

   
    @Override
    public void finalChance(Persona p1, Persona p2) {
        
    }

    @Override
    public String toString() {
        return "PersonaNormal{" + '}';
    }
 
    
}
