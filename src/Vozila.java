public abstract class Vozila implements Ubrzanje {

    private String marka;
    private String boja;
    int snaga;
    int brzina;

public Vozila(String marka, int snaga, String boja){
    this.marka=marka;
    this.snaga=snaga;
    this.boja=boja;
    this.brzina=brzina;
}

    public String getMarka() {
    return marka;
}
public String getBoja() {
    return boja;
}
    public int Getbrzina() {
        return brzina;
    }
    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }
public void  setBoja(String boja) {
    this.boja = boja;
}
public void setMarka(String marka) {
    this.marka = marka;
}
public int getSnaga() {
    return snaga;
}
public void setSnaga(int snaga) {
    this.snaga = snaga;
}

public String ispisiPodatke () {
    return ("Vozilo marke: " + marka + ", Ima snagu: " + snaga + ", Boja vozila je: " + boja + " Ima: ");
}
@Override
public void ubrzanje(int ubrzanje) {
    this.brzina = this.brzina + ubrzanje;
}
    }




