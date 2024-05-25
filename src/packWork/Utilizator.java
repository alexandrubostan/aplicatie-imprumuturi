package packWork;

public class Utilizator {
    String nume;
    String dataNastere;
    String CNP;
    String email;
    String nrTelefon;
    String nrMatricol;

    int nrCartiImprumutate;
    static final int nrMaximCartiImprumutate = 3;
    
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getDataNastere() {
        return dataNastere;
    }
    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }
    public String getCNP() {
        return CNP;
    }
    public void setCNP(String CNP) {
        if(CNP.length() != 13 || !CNP.matches("[0-9]+")) {
            this.CNP = CNP;
        } else {
            System.out.println("CNP invalid!");
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNrTelefon() {
        return nrTelefon;
    }
    public void setNrTelefon(String nrTelefon) {
        if(nrTelefon.length() != 10 || !nrTelefon.matches("[0-9]+")) {
            this.nrTelefon = nrTelefon;
        } else {
            System.out.println("Numar telefon invalid!");
        }
    }
    public String getNrMatricol() {
        return nrMatricol;
    }
    public void setNrMatricol(String nrMatricol) {
        if(nrMatricol.length() != 6 || !nrMatricol.matches("[0-9]+")) {
            this.nrMatricol = nrMatricol;
        } else {
            System.out.println("Numar matricol invalid!");
        }
    }

    public Utilizator(
        String nume, 
        String dataNastere, 
        String CNP,
        String email, 
        String nrTelefon, 
        String nrMatricol) {

        setCNP(CNP);
        setDataNastere(dataNastere);
        setEmail(email);
        setNrMatricol(nrMatricol);
        setNrTelefon(nrTelefon);
        setNume(nume);
        this.nrCartiImprumutate = 0;
    }


    public boolean dateValide(
        String nume, 
        String dataNastere, 
        String CNP,
        String email, 
        String nrTelefon, 
        String nrMatricol) {
        
        if(CNP.length() != 13 || !CNP.matches("[0-9]+")) {
            return false;
        }

        if(nrMatricol.length() != 6 || !nrMatricol.matches("[0-9]+")) {
            return false;
        }

        if(nrTelefon.length() != 10 || !nrTelefon.matches("[0-9]+")) {
            return false;
        }

        return true;
    }

}
