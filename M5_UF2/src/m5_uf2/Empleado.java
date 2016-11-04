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
public class Empleado {

    private String nom;

    private float nomina;

    public float getNomina() {
        return nomina;
    }

    public void setNomina(float nomina) {
        this.nomina = nomina;
    }

    public Empleado(String nom, float nomina) {
        this.nom = nom;
        this.nomina = nomina;

    }

}
