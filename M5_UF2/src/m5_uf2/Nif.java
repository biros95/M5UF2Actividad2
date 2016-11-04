package m5_uf2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos Fuentes
 */
public class Nif {

    private String nif;
    private String letra;
    private String numero;
    private int num = 0;
    private final char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    /**
     * Constructor de la classe Nif.
     *
     * @param nif (String)
     */
    public Nif(String nif) {
        this.nif = nif;
    }

    /**
     * Comprueba si la longitud del DNI es valido y además si la letra es correcta
     * si ambas condiciones se cumplent devuelve un TRUE.
     * Hemos presncido del if ya que return te devuelve un boolean según sea TRUE 
     * o FALSE,*/
    public boolean esValid() {
       

        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);

        //Primer mirem que la cadena tingui 8 o 9 caràcters:
        
            try {
                return comprobarLongitud() & comprovarLletra();
                
                
            } catch (NumberFormatException e) {
                return false;
            }
        }

       
    

    /**
     *Este metodo comprueba la longitud del NIF y devuelve un false en caso de que sea
     * errónea
     */
    private boolean comprobarLongitud() {
       

        return !(nif.length() < 8 || nif.length() > 9);
    }

    /**
     * Este metodo comprueba la letra del DNI con el RESTO entre 23
     */
    private boolean comprovarLletra() {
        
        int posicioLlista = num % 23;

        return String.valueOf(llista[posicioLlista]).equals(letra);
           
        
    }
}
