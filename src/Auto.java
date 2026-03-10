public class Auto extends Vozila {

    int vrata;
    int brzina;

    public Auto(String marka, String boja, int vrata, String snaga, int brzina) {
        super(marka,snaga,boja);
        this.vrata = vrata;
    }
    public int getVrata() {
        return vrata;
    }
    public void setVrata(int vrata) {
        this.vrata = vrata;
    }
    public int Getbrzina() {
        return brzina;
    }
    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }
}
