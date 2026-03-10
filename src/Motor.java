public class Motor extends Vozila{

    private String tip;

    public Motor(String marka, String boja, String tip, String snaga) {
        super(marka, snaga, boja);
        this.tip = tip;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }



}
