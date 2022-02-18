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
public class SuperHumano extends Persona
{
    private String superPoder;

    public SuperHumano(String superPoder, String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.superPoder = superPoder;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

   
    
    @Override
    public void finalChance(Persona p1,Persona p2){
        
    }

    @Override
    public String toString() {
        return "SuperHumano{" + "superPoder=" + superPoder + '}';
    }
    
    
    
    
    
    
    
}
