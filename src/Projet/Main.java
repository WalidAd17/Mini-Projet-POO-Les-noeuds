package Projet;

public class Main {
    public static void main(String[] args) {
        //Création d'un objet Graphe
        Graphe Gr = new Graphe("g1");

        //Création des noeuds nommés de A à K
        Noeud A = new Noeud("A");
        Noeud B = new Noeud("B");
        Noeud C = new Noeud("C");
        Noeud D = new Noeud("D");
        Noeud E = new Noeud("E");
        Noeud F = new Noeud("F");
        Noeud G = new Noeud("G");
        Noeud H = new Noeud("H");
        Noeud I = new Noeud("I");
        Noeud J = new Noeud("J");
        Noeud K = new Noeud("K");

        //L'ajout des noeuds précedemment crés au Graphe
        Gr.ajouter_noeud(A);
        Gr.ajouter_noeud(B);
        Gr.ajouter_noeud(C);
        Gr.ajouter_noeud(D);
        Gr.ajouter_noeud(E);
        Gr.ajouter_noeud(F);
        Gr.ajouter_noeud(G);
        Gr.ajouter_noeud(H);
        Gr.ajouter_noeud(I);
        Gr.ajouter_noeud(J);
        Gr.ajouter_noeud(K);

        //L'ajout des liaisons au meme Graphe
        Gr.ajouter_liaison(A,B);
        Gr.ajouter_liaison(A,E);
        Gr.ajouter_liaison(B,F);
        Gr.ajouter_liaison(C,G);
        Gr.ajouter_liaison(D,E);
        Gr.ajouter_liaison(D,H);
        Gr.ajouter_liaison(E,H);
        Gr.ajouter_liaison(F,G);
        Gr.ajouter_liaison(F,I);
        Gr.ajouter_liaison(F,J);
        Gr.ajouter_liaison(G,J);
        Gr.ajouter_liaison(H,I);

        //L'affichages du graphe
        Gr.afficher_graphe();

    }
}
