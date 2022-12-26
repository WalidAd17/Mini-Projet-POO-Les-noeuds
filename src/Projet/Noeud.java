
package Projet;
import java.util.*;

public class Noeud {

    private String nom; //nom du noeud
    private ArrayList<Noeud> liste_voisins = new ArrayList<Noeud>(); //Arraylist : liste des voisins

    //Constructeur------------
    public Noeud(String nom){
        this.nom = nom;
    }
    //-------------------------

    //Getters et Setters---------------
    public String getNom() {
        return nom;
    }
    public ArrayList getListe_voisins() {
        return liste_voisins;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setListe_voisins(ArrayList liste_voisins) {
        this.liste_voisins = liste_voisins;
    }
    //----------------------------------

    //Les méthodes ------------------------------------------------------------
    public void ajouter_voisin(Noeud V){ //Méthode qui ajouter le noeud V comme un voisin
        liste_voisins.add(V);
    }

    public void afficher_voisin(Noeud V){//Méthode qui affiche les voisins d'un noeud V
        System.out.print("[");
        for (int i=0; i<liste_voisins.size(); i++){
            if (i != liste_voisins.size()-1){
                System.out.print("'"+liste_voisins.get(i).getNom()+"'"+" , ");
            }
            else {
                System.out.print("'"+liste_voisins.get(i).getNom()+"'");
            }
        }
        System.out.print("]");
    }
    //---------------------------------------------------------------------------

}
