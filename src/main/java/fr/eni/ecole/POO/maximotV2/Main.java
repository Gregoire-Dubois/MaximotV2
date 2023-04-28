package fr.eni.ecole.POO.maximotV2;
import fr.eni.ecole.POO.maximotV2.bo.Dictionnaire;
import fr.eni.ecole.POO.maximotV2.bo.Maximot;
import fr.eni.ecole.POO.maximotV2.bo.Tirage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //récupération des mots dans le dictionnaire
        Dictionnaire dictionnaire = new Dictionnaire();
        ArrayList recuperationDictionnaireFull = dictionnaire.readAndStoreTextFile("src/main/java/fr/eni/ecole/POO/maximotV2/bo/dictionnaire.txt");

        //Selection aléatoire du mot parmis le dictionnaire
        Tirage tirage = new Tirage();
        String motAleatoire = tirage.wordSelector(recuperationDictionnaireFull);
        System.out.println(motAleatoire);

        // méalangement des lettres du mot sélectionné
        Maximot maximot = new Maximot();
        maximot.melangeur(motAleatoire);
        ArrayList motMelange = maximot.melangeur(motAleatoire);

        //affichage du mot avec les lettres mélangées
        maximot.afficheurMotMelange(motMelange);
/*
        mise en place de la partie.
        La procédure recoit 2 paramètres.
        le premier est le mot aléatoire dont les lettres ne sont pas mélangées.
        le second est le dictionnaire complet.
 */
        maximot.dansLedico(motAleatoire, recuperationDictionnaireFull);
    }
}