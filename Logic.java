package replacer;

import java.util.*;
import java.io.*;

/**
 * REPLACER
 *
 * @author Cheke
 * @version 0.05a
 */
public class Logic {

    Scanner fileInput = null;
    Writer fileOutput = null;
    Writer backupOutput = null;
    Scanner in = new Scanner(System.in);
    String outputString = "";

    /**
     * Writes in the chosen file through a parameter string.
     *
     * @param pieces Contains a line to write in file.
     * @throws IOException Throws this exception because is I/O.
     */
    public void fileOutput(String pieces) throws IOException {
        fileOutput.write(pieces);
        fileOutput.write("\r\n");
    }

    /**
     * Writes in a backup file selected through a parameter string.
     *
     * @param pieces Contains a line to write in file.
     * @throws IOException Throws this exception because is I/O.
     */
    public void backupOutput(String pieces) throws IOException {
        backupOutput.write(pieces);
        backupOutput.write("\r\n");
    }

    /**
     * Splits a string taken as a parameter, not more than ten commas, then
     * returns it as an array.
     *
     * @param inputString Contains a line of file.
     * @return Returns an array with a segmented line.
     */
    public String[] splitString(String inputString) {
        String[] pieces;
        pieces = inputString.split(",", 10);
        return pieces;
    }

    /**
     * Merge various parameter strings and return strings from an array in a
     * single string.
     *
     * @param pieces Contains a string array with a segmented line.
     * @return Returns the merged line.
     */
    public String mergeString(String[] pieces) {
        StringBuffer sb = new StringBuffer();
        if (!pieces[9].equals("")) {
            sb.append(pieces[0]);
            for (int i = 1; i <= 9; i++) {
                sb.append(",");
                sb.append(pieces[i]);
            }
        }
        outputString = sb.toString();
        return outputString;
    }

    /**
     * Replaces characters contained in left field with characters in right
     * field. Visually talking from the GUI.
     *
     * @param field Contains a line split in an array of fields.
     * @param inputString Contains a file's line.
     * @param outputString Contains an empty string utilized for replace the original.
     * @throws IOException Throws this exception because is I/O.
     */
    public void replace(String[] field, String inputString, String outputString)
            throws IOException {
        if (inputString.contains(field[0])
                || inputString.contains(field[2])
                || inputString.contains(field[4])
                || inputString.contains(field[6])
                || inputString.contains(field[8])
                || inputString.contains(field[10])
                || inputString.contains(field[12])
                || inputString.contains(field[14])
                || inputString.contains(field[16])
                || inputString.contains(field[18])) {
            outputString = inputString
                    .replace(field[0], field[1])
                    .replace(field[2], field[3])
                    .replace(field[4], field[5])
                    .replace(field[6], field[7])
                    .replace(field[8], field[9])
                    .replace(field[10], field[11])
                    .replace(field[12], field[13])
                    .replace(field[14], field[15])
                    .replace(field[16], field[17])
                    .replace(field[18], field[19]);
            fileOutput(outputString);
        } else {
            fileOutput(inputString);
        }
    }

    /**
     * Writes in the established file in other method. Receives as parameter a
     * string for write.
     *
     * @param outputString Receives line to be written.
     * @throws IOException Throws this exception because is I/O.
     */
    public void write(String outputString) throws IOException {
        fileOutput(outputString);
    }

    /**
     * Writes in a backup file.
     *
     * @param outputString Receives line for to be written.
     * @throws IOException Throws this exception because is I/O.
     */
    public void writeBackup(String outputString) throws IOException {
        backupOutput(outputString);
    }

    /**
     * Writes "actors" into field "style".
     *
     * @param pieces Array with several segments of a line.
     */
    public void actorToStyle(String[] pieces) {
        if (!pieces[4].equals("")) {
            pieces[3] = pieces[4];
        }
        outputString = mergeString(pieces);
    }

    /**
     * Writes "style" into field "actors".
     *
     * @param pieces Array with several segments of a line.
     */
    public void styleToActor(String[] pieces) {
        if (pieces[3].toLowerCase().contains("top")
                || pieces[3].toLowerCase().contains("alternate")) {
            pieces[8] = "Arriba";
            pieces[3] = "Default";
        }
        if (!pieces[3].toLowerCase().contains("default")
                && !pieces[3].toLowerCase().contains("cartel")
                && !pieces[3].toLowerCase().contains("título")
                && !pieces[3].toLowerCase().contains("logo")
                && !pieces[3].toLowerCase().contains("neutro")
                && !pieces[3].toLowerCase().contains("op")
                && !pieces[3].toLowerCase().contains("ed")) {
            pieces[4] = pieces[3];
        }
        outputString = mergeString(pieces);
    }

    /**
     * Deletes tags "{\ }" from the lines. Except certain cases (In that cases,
     * adds "Cartel" in the "effect" field). Furthermore, erases defined tags in
     * "ponerEtiquetas" method utilized to translate.
     *
     * @param pieces Array with several segments of a line.
     */
    public void eraseTags(String[] pieces) {
        if (pieces[9].contains("\\fscx")
                || pieces[9].contains("\\fsxy")
                || pieces[9].contains("\\k")
                || pieces[9].contains("\\frz")
                || pieces[9].contains("\\frx")
                || pieces[9].contains("\\fry")
                || pieces[9].contains("\\blur")
                || pieces[9].contains("\\clip")
                || pieces[9].contains("\\iclip")
                || pieces[9].contains("\\move")
                || pieces[3].toLowerCase().contains("cartel")
                || pieces[3].toLowerCase().contains("título")
                || pieces[3].toLowerCase().contains("logo")
                || pieces[3].toLowerCase().contains("op")
                || pieces[3].toLowerCase().contains("ed")) {
            pieces[8] = "Cartel";
        } else if (pieces[9].contains("\u001F")) {
            pieces[9] = pieces[9].replace("{", "").replace("\u001F}", "");
            pieces[9] = pieces[9].replace("[", "{").replace("]", "}");
        }
        if (!pieces[3].toLowerCase().contains("título")
                && !pieces[3].toLowerCase().contains("title")
                && !pieces[3].toLowerCase().contains("logo")
                && !pieces[3].toLowerCase().contains("op")
                && !pieces[3].toLowerCase().contains("ed")
                && !pieces[8].toLowerCase().contains("cartel")
                && !pieces[8].toLowerCase().contains("efecto")) {
            pieces[9] = pieces[9].replaceAll("\\{[^\\}]+\\}", "");
        }
        if (pieces[9].contains("}{")) {
            pieces[9] = pieces[9].replaceAll("\\}\\{", "");
        }
        outputString = mergeString(pieces);
    }

    /**
     * Adds tag "{\be2\an8\fna song for jennifer}" in lines that contain the
     * word "Radio" or "Megafonía" in the "effect" field.
     *
     * @param pieces Array with several segments of a line.
     */
    public void putRadioTags(String[] pieces) {
        if (pieces[8].toLowerCase().contains("radio")
                || pieces[8].toLowerCase().contains("megafonia")
                || pieces[8].toLowerCase().contains("megafonía")) {
            if (!pieces[9].contains("{\\be2\\an8\\fna song for jennifer}")) {
                eraseTags(pieces);
                pieces[9] = "{\\be2\\an8\\fna song for jennifer}"
                        + pieces[9];
            }
        }
        outputString = mergeString(pieces);
    }

    /**
     * Adds tag "{\be2\1a&amp;H48&amp;}" in lines that contain the word
     * "Pensamiento" in the "effect" field.
     *
     * @param pieces Array with several segments of a line.
     */
    public void putThoughtTags(String[] pieces) {
        if (pieces[8].toLowerCase().contains("pensamiento")
                && !pieces[9].contains("{\\be2\\1a&H48&}")) {
            pieces[9] = "{\\be2\\1a&H48&}" + pieces[9];
        }
        if (pieces[9].contains("}{")) {
            pieces[9] = pieces[9].replaceAll("\\}\\{", "");
        }
        outputString = mergeString(pieces);

    }

    /**
     * Adds tag "{\be2\fad(300,300)\1a&amp;H01}" in lines that contain the word
     * "Flashback" or "Recuerdo" in the "effect" field.
     *
     * @param pieces Array with several segments of a line.
     */
    public void putFlashbackTags(String[] pieces) {
        if (pieces[8].toLowerCase().contains("flashback")
                || pieces[8].toLowerCase().contains("recuerdo")) {
            if (!pieces[9].contains("{\\be2\\fad(300,300)\\1a&H01}")) {
                eraseTags(pieces);
                pieces[9] = "{\\be2\\fad(300,300)\\1a&H01}" + pieces[9];
            }
        }
        outputString = mergeString(pieces);
    }

    /**
     * Adds tag "{\be2\i1}" in lines that contain the word "Cursiva" in the
     * "effect" field.
     *
     * @param pieces Array with several segments of a line.
     */
    public void putItalicTags(String[] pieces) {
        if (pieces[8].toLowerCase().equals("cursivar")
                && !pieces[9].contains("{\\be2\\i1}")) {
            if (!pieces[9].contains("\\be")) {
                eraseTags(pieces);
                pieces[9] = "{\\be2\\i1}" + pieces[9];
            }
        }
        outputString = mergeString(pieces);
    }

    /**
     * Adds tag "{\be2}" in lines that have the field "effect" empty.
     *
     * @param pieces Array with several segments of a line.
     */
    public void putBlurTags(String[] pieces) {
        if (pieces[8].isEmpty() && !pieces[9].contains("\\be")
                && !pieces[9].contains("\\blur")) {
            pieces[9] = "{\\be2}" + pieces[9];
        } else if (pieces[8].toLowerCase().contains("-")
                || pieces[8].toLowerCase().contains("cursivar")
                || pieces[8].toLowerCase().contains("arriba")) {
            if (!pieces[9].toLowerCase().contains("\\be2")) {
                pieces[9] = "{\\be2}" + pieces[9];
            }
        }

        outputString = mergeString(pieces);
    }

    /**
     * Adds "{" in the start of line and "}" at the end for his translation and
     * posterior revision.
     *
     * @param pieces Array with several segments of a line.
     */
    public void putAllTags(String[] pieces) {
        if (pieces[9].contains("\\fscx")
                || pieces[9].contains("\\fsxy")
                || pieces[9].contains("\\k")
                || pieces[9].contains("\\frz")
                || pieces[9].contains("\\frx")
                || pieces[9].contains("\\fry")
                || pieces[9].contains("\\blur")) {
            pieces[8] = "Cartel";
        } else if (!pieces[3].toLowerCase().contains("título")
                && !pieces[3].toLowerCase().contains("title")
                && !pieces[3].toLowerCase().contains("logo")
                && !pieces[3].toLowerCase().contains("op")
                && !pieces[3].toLowerCase().contains("ed")
                && !pieces[8].toLowerCase().contains("cartel")
                && !pieces[8].toLowerCase().contains("efecto")) {
            pieces[9] = "{" + pieces[9].replace("{", "[")
                    .replace("}", "]") + "\u001F}";
        }
        outputString = mergeString(pieces);
    }

    /**
     *
     * Adds tag "{\an8}" in lines that contain the word "Arriba" in the "effect"
     * field.
     *
     * @param pieces Array with several segments of a line.
     */
    public void putOnTopTags(String[] pieces) {
        if (pieces[8].toLowerCase().contains("arriba")
                && !pieces[9].contains("{\\an8}")) {
            eraseTags(pieces);
            pieces[9] = "{\\be2\\an8}" + pieces[9];
        }
        if (pieces[8].toLowerCase().contains("cursivar-arriba")
                || pieces[8].toLowerCase().contains("arriba-cursivar")) {
            eraseTags(pieces);
            pieces[9] = "{\\be2\\an8\\i1}" + pieces[9];
        }
        if (pieces[8].toLowerCase().contains("pensamiento-arriba")
                || pieces[8].toLowerCase().contains("arriba-pensamiento")) {
            pieces[9] = "{\\be2\\an8\\1a&H48&}" + pieces[9];
        }
        if (pieces[8].toLowerCase().contains("flashback-arriba")
                || pieces[8].toLowerCase().contains("arriba-flashback")) {
            pieces[9] = "{\\be\\an8\\fad(300,300)\\1a&H01}" + pieces[9];
        }
        if (pieces[9].contains("}{")) {
            pieces[9] = pieces[9].replaceAll("\\}\\{", "");
        }
        outputString = mergeString(pieces);

    }

    /**
     * Writes the contents of parameter file like "nombreOrigen" as
     * "nombreSalida" in other file calls.
     *
     * @param outputName Name of output file.
     * @param inputName Name of origin file.
     * @param field Contains an array with all the text contained in the fields
     * of the GUI.
     */
    public void saveAs(String outputName,
            String inputName, String[] field) {
        try {
            fileOutput = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputName), "UTF8")
            );

            fileInput = new Scanner(
                    new InputStreamReader(
                            new FileInputStream(inputName), "UTF8")
            );

            String entrada;
            while (fileInput.hasNextLine()) {
                entrada = fileInput.nextLine();
                replace(field, entrada, outputString);
            }

        } catch (Exception e) {

        } finally {
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileOutput != null) {
                try {
                    fileOutput.close();
                } catch (IOException e) {

                }
            }
        }
    }

    /**
     * Method utilized to replace the characters in the left fields into right
     * right fields. Visually talking from the GUI. Furthermore, makes a backup
     * file and calls the differents methods with a integer sent for other
     * method.
     *
     * @param filename Name of charged file.
     * @param flag Integer utilized like a mark for the differents methods.
     * @return Returns a File type object, for to be replaced in the method of
     * return.
     */
    public File save(String filename, int flag) {
        // Para posible archivo de log en futuras versiones.
        int counter = 0;
        File tmp = new File(filename + ".tmp");
        try {
            fileOutput = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(tmp), "UTF8")
            );

            backupOutput = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(filename + ".bak"),
                            "UTF8")
            );
            fileInput = new Scanner(
                    new InputStreamReader(
                            new FileInputStream(filename), "UTF8")
            );

            String inputString;
            while (fileInput.hasNextLine()) {
                inputString = fileInput.nextLine();
                // Para posible archivo de log en futuras versiones.
                counter++;
                writeBackup(inputString);
                String[] trozos = splitString(inputString);
                if (trozos[0].contains("Dialogue:")) {
                    if (flag == 0) { // Con 0 cambia el Estilo al Actor.
                        styleToActor(trozos);
                        write(outputString);
                    } else if (flag == 1) { // Con 1 cambia el Actor al Estilo.
                        actorToStyle(trozos);
                        write(outputString);
                    } else if (flag == 2) { // Con 2 borra todas las etiquetas.
                        eraseTags(trozos);
                        write(outputString);
                    } else if (flag == 3) { // Con 3 pone las etiquetas de Pensamiento.
                        putThoughtTags(trozos);
                        write(outputString);
                    } else if (flag == 4) { // Con 4 pone las etiquetas de Flashback.
                        putFlashbackTags(trozos);
                        write(outputString);
                    } else if (flag == 5) { // Con 5 pone las etiquetas de Radio.
                        putRadioTags(trozos);
                        write(outputString);
                    } else if (flag == 6) { // Con 6 pone cursivas.
                        putItalicTags(trozos);
                        write(outputString);
                    } else if (flag == 7) { // Con 7 pone difuminados.
                        putBlurTags(trozos);
                        write(outputString);
                    } else if (flag == 8) { // Con 8 pone {} para traducir.
                        putAllTags(trozos);
                        write(outputString);
                    } else if (flag == 9) {
                        putOnTopTags(trozos);
                        write(outputString);
                    } else if (flag == -1) {
                        putThoughtTags(trozos);
                        putFlashbackTags(trozos);
                        putRadioTags(trozos);
                        putItalicTags(trozos);
                        putBlurTags(trozos);
                        putOnTopTags(trozos);
                        write(outputString);
                    }
                } else {
                    write(inputString);
                }
            }
        } catch (Exception e) {

        } finally {
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileOutput != null) {
                try {
                    fileOutput.close();
                } catch (IOException ex) {

                }
            }
            if (backupOutput != null) {
                try {
                    backupOutput.close();
                } catch (IOException ex) {

                }
            }
        }
        return tmp;
    }

    /**
     * Method utilized to replace the characters in the left fields into right
     * right fields. Visually talking from the GUI. Also, makes a backup file.
     *
     * @param filename Name of charged file.
     * @param field Contains an array with all the text contained in the fields
     * of the GUI.
     * @return Returns a File type object, for to be replaced in the method of
     * return.
     */
    public File save(String filename,
            String[] field) {
        // Para posible archivo de log en futuras versiones.
        int contador = 0;
        File tmp = new File(filename + ".tmp");
        try {
            fileOutput = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(tmp), "UTF8")
            );

            backupOutput = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(filename + ".bak"),
                            "UTF8")
            );
            fileInput = new Scanner(
                    new InputStreamReader(
                            new FileInputStream(filename), "UTF8")
            );

            String inputString;
            while (fileInput.hasNextLine()) {
                inputString = fileInput.nextLine();
                // Para posible archivo de log en futuras versiones.
                contador++;
                writeBackup(inputString);
                replace(field, inputString, outputString);
            }
            // Posible archivo de log para futuras versiones.
            System.out.println(String.format("Se han copiado %s líneas",
                    contador));

        } catch (Exception e) {

        } finally {
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileOutput != null) {
                try {
                    fileOutput.close();
                } catch (IOException ex) {

                }
            }
            if (backupOutput != null) {
                try {
                    backupOutput.close();
                } catch (IOException ex) {

                }
            }
        }
        return tmp;
    }
}
