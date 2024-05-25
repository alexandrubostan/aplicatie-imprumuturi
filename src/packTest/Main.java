package packTest;

import packWork.*;

public class Main {
    public static void main(String[] args) {
        Carte c1 = new Carte("Cercul Luminos", "Ana Maria Blandiana", "Polirom");
        Carte c2 = new Carte("Sub Sol", "Mircea Cartarescu", "Humanitas");
        Carte c3 = new Carte("Fluturi", "Irina Binder", "Rao");
        Carte c4 = new Carte("Ultima Noapte de Dragoste, Intaia Noapte de Razboi", "Camil Petrescu", "Litera");

        Utilizator u1 = new Utilizator("Ion Nastase", "10.12.2003", "1850715410011", "dsadsaads@yahoo.com", "401295329", "23232");
        Utilizator u2 = new Utilizator("Aida", "18.10.2002", "2900323240029", "aidaanozo@yahoo.com", "401295329", "5454");


        Biblioteca b1 = new Biblioteca();

        b1.adaugaCarte(c1);
        b1.adaugaCarte(c2);
        b1.adaugaCarte(c3);
        b1.adaugaCarte(c4);

        GestionareImprumuturi g1 = new GestionareImprumuturi(b1);

        g1.afisareCartiDisponibile();

        g1.imprumutaCarte(u1,c1);
        g1.imprumutaCarte(u1,c2);
        g1.imprumutaCarte(u1,c4);
        g1.imprumutaCarte(u2,c1);
        g1.imprumutaCarte(u2,c2);

        g1.afisareCartiDisponibile();

        g1.afisareLista();
    }
}
