package packWork;

public class Carte {
    String titlu;
    String numeAutor;
    String editura;


    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getNumeAutor() {
        return numeAutor;
    }

    public void setNumeAutor(String numeAutor) {
        this.numeAutor = numeAutor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public Carte(String titlu, String numeAutor, String editura) {
        setEditura(editura);
        setNumeAutor(numeAutor);
        setTitlu(titlu);
    }

}
