package packWork;

import java.util.ArrayList;

public class Biblioteca {
    int numarCarti;
    ArrayList<Carte> Carti;

	public Biblioteca() {
		setNumarCarti();
		Carti = new ArrayList<Carte>();
	}

    private void setNumarCarti() {
        this.numarCarti = 0;
    }

    public int getNumarCarti() {
        return this.numarCarti;
    }

    public void adaugaCarte(Carte c ) {
        Carti.add(c);
        numarCarti++;
    }

    public boolean existaCarte(Carte c) {
        if(Carti.contains(c)) {
            return true;
        }
        return false;
    }

    public void afisareCarti() {

        System.out.println("Cartile disponibile sunt:");

        for(Carte var : Carti) {
            System.out.println(var.titlu);
        }
        System.out.println();
    }
}
