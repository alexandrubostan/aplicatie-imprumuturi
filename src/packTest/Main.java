package packTest;

import packWork.*;

public class Main {
    public static void main(String[] args) {
        Carte c1 = new Carte("Cercul Luminos", "Ana Maria Blandiana", "Polirom");
        Carte c2 = new Carte("Sub Sol", "Mircea Cartarescu", "Humanitas");
        Carte c3 = new Carte("Fluturi", "Irina Binder", "Rao");
        Carte c4 = new Carte("Ultima Noapte de Dragoste, Intaia Noapte de Razboi", "Camil Petrescu", "Litera");

        Utilizator u1 = new Utilizator("ion", "2382", "453252", "dsadsaads@yahoo.com", "401295329", "23232");
        Utilizator u2 = new Utilizator("aida", "2382", "34342", "aidaanozo@yahoo.com", "401295329", "5454");


        Biblioteca b1 = new Biblioteca();

        b1.adaugaCarte(c1);
        b1.adaugaCarte(c2);
        b1.adaugaCarte(c3);
        b1.adaugaCarte(c4);

        GestionareImprumuturi g1 = new GestionareImprumuturi(b1);

        g1.imprumutaCarte(u1,c1);
        g1.imprumutaCarte(u1,c2);
        g1.imprumutaCarte(u1,c3);
        g1.imprumutaCarte(u1,c4);
        g1.imprumutaCarte(u2,c1);
        g1.imprumutaCarte(u2,c2);

        g1.afisareLista();
    }
}
