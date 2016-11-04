/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5_uf2;

/**
 *
 * @author MarcosPortatil
 */
public class Operari extends Empleado {
    
    private float horesExtres;
    private final int PREU_HORES_EXTRES = 20;
    
    public Operari(String nom, float nomina, float horesExtres) {
        
        super(nom, nomina);
        this.horesExtres = horesExtres;
        super.setNomina(nomina + (horesExtres * PREU_HORES_EXTRES));
    }
    
    public float getHoresExtres() {
        return horesExtres;
    }
    
    public void setHoresExtres(float horesExtres) {
        this.horesExtres = horesExtres;
    }
    
}
