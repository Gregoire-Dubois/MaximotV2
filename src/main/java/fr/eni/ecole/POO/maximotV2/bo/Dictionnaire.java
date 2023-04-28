package fr.eni.ecole.POO.maximotV2.bo;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionnaire {

    public Dictionnaire() {

    }

    public ArrayList readAndStoreTextFile(String adresseFichier){

        //  ouverture du fichier texte

            ArrayList<String> dico = new ArrayList<>();

            try (FileInputStream file = new FileInputStream(adresseFichier);
                 Scanner out = new Scanner(file)) {

                while (out.hasNextLine()) {
                dico.add(String.valueOf(out.nextLine()));
                }

            } catch (IOException e) {
                System.out.println("Le fichier n'existe pas à l'emplacement indiqué");
            }
            return dico;
        }
}
