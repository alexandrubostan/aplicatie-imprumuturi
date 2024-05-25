package packWork;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class GestionareImprumuturi {
    Biblioteca biblioteca;
    Map<Utilizator, ArrayList<Carte>> ListaImprumuturi = new HashMap<>();

    public GestionareImprumuturi(Biblioteca biblioteca) {
        setBiblioteca(biblioteca);
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void imprumutaCarte(Utilizator u, Carte c) {
        if(!biblioteca.existaCarte(c)) {
            System.out.println("Cartea '" + c.titlu + "' nu este disponibila!\n");
            return;
        }

        if(u.nrCartiImprumutate >= Utilizator.nrMaximCartiImprumutate) {
            System.out.println("Avertizare! " + u.nume + ", ai depasit numarul de carti imprumutate!\n");
            return;
        }

        if (!ListaImprumuturi.containsKey(u)) {
            ListaImprumuturi.put(u, new ArrayList<>());
        }

        ListaImprumuturi.get(u).add(c);
        biblioteca.Carti.remove(c);
        u.nrCartiImprumutate++;
    }

    public void afisareLista() {
        for (Map.Entry<Utilizator, ArrayList<Carte>> entry : ListaImprumuturi.entrySet()) {
            Utilizator u = entry.getKey();
            ArrayList<Carte> cartiImprumutate = entry.getValue();
            System.out.print("Utlizator: " + u.nume + "\n");
            System.out.print("Carti: ");
            
            if (cartiImprumutate != null && !cartiImprumutate.isEmpty()) { 
                for (int i = 0; i < cartiImprumutate.size(); i++) {
                    Carte carte = cartiImprumutate.get(i);
                    System.out.print(carte.titlu); 
                    if (i < cartiImprumutate.size() - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println("\n--------");
        }
    }

    public void afisareImprumuturiUtilizator(String nrMat) {
        for (Map.Entry<Utilizator, ArrayList<Carte>> entry : ListaImprumuturi.entrySet()) {
            Utilizator u = entry.getKey();
            if(u.nrMatricol == nrMat) {
                for (Carte valoare : ListaImprumuturi.get(u)) {
                    System.out.println(valoare.titlu);
                }
                return;
            }
        }

        System.out.println("Numarul matricol nu a fost gasit!");
    }

    public void afisareCartiDisponibile() {
        this.biblioteca.afisareCarti();
    }
}