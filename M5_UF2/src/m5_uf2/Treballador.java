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
public class Treballador {

    public static final int DIRECTOR = 0;
    public static final int SUBDIRECTOR = 1;
    public static final int OPERARI = 2;
   private final int DATOS_INCORRECTOS = 0;

    private String nom;
    private int tipusTreballador;

    private float nomina;
    private float horesExtres;

    public int getTipusTreballador() {
        return tipusTreballador;
    }

    public float getNomina() {
        return nomina;
    }

    public float getHoresExtres() {
        return horesExtres;
    }
    
    public Treballador(String nom, int tipusTreballador, float nomina, float horesExtres) throws datosIncorrectos {
        this.nom = nom;
        if (!DatosCorrectos(nomina, horesExtres)) {
            throw new datosIncorrectos();
                  
        }
        this.tipusTreballador = tipusTreballador;
        this.nomina = nomina;
        this.horesExtres = horesExtres;
    }
    public boolean DatosCorrectos(float nomina, float horesExtres) {
        return !(nomina <= DATOS_INCORRECTOS || horesExtres <= DATOS_INCORRECTOS);
    }

}
