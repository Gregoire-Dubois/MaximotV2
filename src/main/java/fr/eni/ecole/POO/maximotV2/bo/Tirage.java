package fr.eni.ecole.POO.maximotV2.bo;

import java.util.ArrayList;
import java.util.Random;

public class Tirage {
    public Tirage() {

    }
    // fonction pour selectionner aléatoirement un mot dans le fichier texte.
    public String wordSelector(ArrayList fullDictionnaire){

        // générer un numéro entre 0 et le max de ligne du ficher TXT
        int minDico = 0;
        int maxDico = fullDictionnaire.size();

        Random randomNumberLine = new Random();
        int alea = randomNumberLine.nextInt(minDico, maxDico);

        // générer un numéro entre 0 et le max de ligne du ficher TXT
        String leMot = fullDictionnaire.get(alea).toString();

        return leMot;

    }


}
