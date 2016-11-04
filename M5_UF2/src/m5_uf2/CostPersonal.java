    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package m5_uf2;

    import java.util.ArrayList;
    import java.util.Collection;

    public class CostPersonal {

        public static boolean esDirectiu(Treballador treballador) {
            return (treballador.getTipusTreballador() == Treballador.DIRECTOR
                    || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR);
        }

        public static float costDelPersonal(Treballador treballadors[]) {
            float costFinal = 0;
            for (Treballador treballador : treballadors) {
                costFinal += esDirectiu(treballador) ? treballador.getNomina()
                        : treballador.getNomina()
                        + (treballador.getHoresExtres() * 20);

            }
            return costFinal;
        }
    }
