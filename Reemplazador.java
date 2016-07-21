package replacer;

import java.util.*;
import java.io.*;

/**
 *
 * @author Cheke
 */
public class Reemplazador {

    Scanner entradaDeFichero = null;
    Writer salidaDeFichero = null;
    Scanner in = new Scanner(System.in);

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
            salidaDeFichero = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(String.format("%s.kc", nombreFichero)
                            ), "UTF8")
            );

            entradaDeFichero = new Scanner(
                    new InputStreamReader(
                            new FileInputStream(nombreFichero), "UTF8")
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
                    salidaDeFichero.write(salida);
                    salidaDeFichero.write("\n");
                } else {
                    salidaDeFichero.write(entrada);
                    salidaDeFichero.write("\n");

                }
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
        } finally {
            if (entradaDeFichero != null) {
                entradaDeFichero.close();
            }
            if (salidaDeFichero != null) {
                try {
                    salidaDeFichero.close();
                } catch (IOException ex) {

                }
            }
        }
    }
    public void reemplazar(String nombreFichero,
            String unoIzquierda, String unoDerecha) {
        try {
            salidaDeFichero = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(String.format("%s.kc", nombreFichero)
                            ), "UTF8")
            );

            entradaDeFichero = new Scanner(
                    new InputStreamReader(
                            new FileInputStream(nombreFichero), "UTF8")
            );

            String entrada;
            while (entradaDeFichero.hasNextLine()) {
                String salida = "";
                entrada = entradaDeFichero.nextLine();
                //System.out.println(entrada);
                if (entrada.contains(unoIzquierda)) {
                    salida = entrada
                            .replace(unoIzquierda, unoDerecha);
                    salidaDeFichero.write(salida);
                    salidaDeFichero.write("\n");
                } else {
                    salidaDeFichero.write(entrada);
                    salidaDeFichero.write("\n");

                }
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
        } finally {
            if (entradaDeFichero != null) {
                entradaDeFichero.close();
            }
            if (salidaDeFichero != null) {
                try {
                    salidaDeFichero.close();
                } catch (IOException ex) {

                }
            }
        }
    }
}
