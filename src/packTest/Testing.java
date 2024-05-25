package packTest;

import packWork.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Testing {
    @Test
    public void validareUtilizator() {
        Utilizator u1 = new Utilizator("Ion", "asddas", "1234567891234", "efadfda", "1234567891", "123456");
        Utilizator u2 = new Utilizator("Ion", "asddas", "123SDADAS9124", "efadfda", "1234567891", "123456");

        assertFalse(u2.dateValide());
        assertTrue(u1.dateValide());
    }

    @Test
    public void validareImprumut() {
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

        assertTrue(g1.imprumutaCarte(u1,c1));
        assertTrue(g1.imprumutaCarte(u1,c2));
        assertFalse(g1.imprumutaCarte(u2,c1));
    }

    @Test
    public void validareNrCartiImprumutate() {
        Carte c1 = new Carte("Cercul Luminos", "Ana Maria Blandiana", "Polirom");
        Carte c2 = new Carte("Sub Sol", "Mircea Cartarescu", "Humanitas");
        Carte c3 = new Carte("Fluturi", "Irina Binder", "Rao");
        Carte c4 = new Carte("Ultima Noapte de Dragoste, Intaia Noapte de Razboi", "Camil Petrescu", "Litera");

        Utilizator u1 = new Utilizator("Ion Nastase", "10.12.2003", "1850715410011", "dsadsaads@yahoo.com", "401295329", "23232");
        
        Biblioteca b1 = new Biblioteca();

        b1.adaugaCarte(c1);
        b1.adaugaCarte(c2);
        b1.adaugaCarte(c3);
        b1.adaugaCarte(c4);

        GestionareImprumuturi g1 = new GestionareImprumuturi(b1);

        assertTrue(g1.imprumutaCarte(u1,c1));
        assertTrue(g1.imprumutaCarte(u1,c2));
        assertTrue(g1.imprumutaCarte(u1,c3));
        assertFalse(g1.imprumutaCarte(u1,c4));
    }

    @Test
    public void validareExistaCarte() {
        Carte c1 = new Carte("Cercul Luminos", "Ana Maria Blandiana", "Polirom");
        Carte c2 = new Carte("Sub Sol", "Mircea Cartarescu", "Humanitas");

        Utilizator u1 = new Utilizator("Ion Nastase", "10.12.2003", "1850715410011", "dsadsaads@yahoo.com", "401295329", "23232");
        
        Biblioteca b1 = new Biblioteca();

        b1.adaugaCarte(c1);

        GestionareImprumuturi g1 = new GestionareImprumuturi(b1);

        assertTrue(g1.imprumutaCarte(u1,c1));
        assertFalse(g1.imprumutaCarte(u1,c2));
    }
}
