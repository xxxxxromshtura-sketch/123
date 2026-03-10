public abstract class Vozila implements Snaga {

    private String marka;
    private String boja;
    private String snaga;
    private int brzina;

public Vozila(String marka, String snaga, String boja){
    this.marka=marka;
    this.snaga=snaga;
    this.boja=boja;
}

    public String getMarka() {
    return marka;
}
public String getBoja() {
    return boja;
}
public void  setBoja(String boja) {
    this.boja = boja;
}
public void setMarka(String marka) {
    this.marka = marka;
}
public String getSnaga() {
    return snaga;
}
public void setSnaga(String snaga) {
    this.snaga = snaga;
}

public String ispisiPodatke () {
    return ("Vozilo marke: " + marka + ", Ima snagu: " + snaga + ", Boja vozila je: " + boja + " Ima: ");
}
@Override
public void snaga(String snaga) {
    this.snaga = this.snaga + snaga;
}
    }




