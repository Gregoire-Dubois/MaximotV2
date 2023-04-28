package fr.eni.ecole.POO.maximotV2.bo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maximot {
    public Maximot() {

    }

    // procédure pour mélanger les caractères du mot tiré au sort

    public ArrayList melangeur(String motAleatoire){
        ArrayList <Character> motAleatoireArrayList = new ArrayList<>();
        for (int i = 0; i<motAleatoire.length();i++){
            motAleatoireArrayList.add(motAleatoire.charAt(i));
        }
        Collections.shuffle(motAleatoireArrayList);
        return motAleatoireArrayList;

    }

    //procédure pour afficher le mot mélangé
    public void afficheurMotMelange(ArrayList arrayVersString){
        String masque="";
        for (int i = 0; i< arrayVersString.size(); i++){
            masque = masque+arrayVersString.get(i);
        }
        System.out.println(masque);
    }

    // Fonction pour vérifier si la saisie le mot saisi est le bon et s'il est bien dans le dictionnaire
    public void dansLedico(String motMystere, ArrayList dictionnaireComplet){


        int chances = 4;
        int matchWord = 0;
        int matchInDico = 0;

        while (chances > 0 && matchWord==0 ){

            System.out.println("Entrez votre proposition pour trouver le mot");
            Scanner question = new Scanner(System.in);
            String essai = question.nextLine();
            System.out.println(essai);

            // parcours du dictionnaire pour vérifier si le mot est dedans
            for(int i =0; i<dictionnaireComplet.size(); i++){
                if (essai.equals(dictionnaireComplet.get(i))){
                    // si le mot est dans le dicotionaire alors matchInDico vaut 1
                    matchInDico = 1;
                }
            }

            // Si matchInDico vaut 1 et que le mot saisi correspond au mot aléatoire alors c'est gagné
            if (matchInDico == 1 && essai.equals(motMystere)){
                System.out.println("bravo le mot mystère était : " + motMystere);
                matchWord = 1;
            }else {
                System.out.println("Ce n'est pas ce mot la :(");
            }
            chances--;
        }
    }
}
