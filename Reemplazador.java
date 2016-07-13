package replacer;

import java.util.*;
import java.io.*;

/**
 *
 * @author Cheke
 */
public class Reemplazador {

    Scanner entradaDeFichero = null;
    PrintWriter salidaDeFichero = null;

    public void reemplazar(String nombreFichero,
            String unoIzquierda, String unoDerecha,
            String dosIzquierda, String dosDerecha,
            String tresIzquierda, String tresDerecha,
            String cuatroIzquierda, String cuatroDerecha,
            String cincoIzquierda, String cincoDerecha,
            String seisIzquierda, String seisDerecha,
            String sieteIzquierda, String sieteDerecha,
            String ochoIzquierda, String ochoDerecha,
            String nueveIzquierda, String nueveDerecha,
            String diezIzquierda, String diezDerecha) {
        try {
            entradaDeFichero = new Scanner(
                    new BufferedReader(
                            new FileReader(nombreFichero)
                    )
            );

            salidaDeFichero = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(
                                    String.format("%s.kc", nombreFichero)
                            )
                    )
            );
            String entrada;
            while (entradaDeFichero.hasNextLine()) {
                String salida = "";
                entrada = entradaDeFichero.nextLine();
                //System.out.println(entrada);
                if (entrada.contains(unoIzquierda)
                        || entrada.contains(dosIzquierda)
                        || entrada.contains(tresIzquierda)
                        || entrada.contains(cuatroIzquierda)
                        || entrada.contains(cincoIzquierda)
                        || entrada.contains(seisIzquierda)
                        || entrada.contains(sieteIzquierda)
                        || entrada.contains(ochoIzquierda)
                        || entrada.contains(nueveIzquierda)
                        || entrada.contains(diezIzquierda)) {
                    salida = entrada
                            .replace(unoIzquierda, unoDerecha)
                            .replace(dosIzquierda, dosDerecha)
                            .replace(tresIzquierda, tresDerecha)
                            .replace(cuatroIzquierda, cuatroDerecha)
                            .replace(cincoIzquierda, cincoDerecha)
                            .replace(seisIzquierda, seisDerecha)
                            .replace(sieteIzquierda, sieteDerecha)
                            .replace(ochoIzquierda, ochoDerecha)
                            .replace(nueveIzquierda, nueveDerecha)
                            .replace(diezIzquierda, diezDerecha);
                    salidaDeFichero.println(salida);
                } else {
                    salidaDeFichero.println(entrada);
                }
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
        } finally {
            if (entradaDeFichero != null) {
                entradaDeFichero.close();
            }
            if (salidaDeFichero != null) {
                salidaDeFichero.close();
            }
        }
    }
}
