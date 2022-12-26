package Projet;
import java.util.*;

public class Graphe {

    private String nom; //nom du graphe
    private ArrayList<Noeud> liste_noeuds = new ArrayList<Noeud>();//arraylist pour lister les noeuds du graphe

    //Constructeur-------------------------------------
    public Graphe(String nom){
        this.nom = nom;
    }
    //-------------------------------------------------

    //Getters et Setters------------------------------------------------------------------------
    public String getNom() {
        return nom;
    }

    public ArrayList getListe_noeuds() {
        return liste_noeuds;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListe_noeuds(ArrayList liste_noeuds) {
        this.liste_noeuds = liste_noeuds;
    }
    //------------------------------------------------------------------------------------------

    //Les méthodes -----------------------------------------------------------------------------------------------
    public void ajouter_noeud(Noeud N){//méthode qui ajoute un noeud N à un graphe
        liste_noeuds.add(N);
    }
    public void ajouter_liaison(Noeud A, Noeud B){//méthode qui ajoute une liaison entre deux noeuds A et B
        A.ajouter_voisin(B);
        B.ajouter_voisin(A);
    }

    public void afficher_graphe(){//méthode qui affiche le graphe comme il est demandé
        int nb_ele = liste_noeuds.size();
        System.out.println("Graphe :"+getNom());
        System.out.println("----------");

        for (int i=0; i<nb_ele; i++){
            System.out.print(liste_noeuds.get(i).getNom()+", Voisins :  " );
            liste_noeuds.get(i).afficher_voisin(liste_noeuds.get(i));
            System.out.println("");
        }
    }
    //-----------------------------------------------------------------------------------------------------------

}



