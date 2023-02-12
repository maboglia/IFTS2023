import java.util.Calendar;

public class Treni {
    private String partenza;
    private String[] fermate;
    private String arrivo;
    private Calendar oraPartenza;
    private Calendar[] oraFermate;
    private Calendar oraArrivo;
    private int postiTotali;
    private int postiDisponibili;
    private double chilometriPercorsi;

    public Treni(String partenza, String[] fermate, String arrivo, Calendar oraPartenza, Calendar[] oraFermate, Calendar oraArrivo, int postiTotali,int postiDisponibili, double chilometriPercorsi) {
        this.partenza = partenza;
        this.fermate = fermate;
        this.arrivo = arrivo;
        this.oraPartenza = oraPartenza;
        this.oraFermate = oraFermate;
        this.oraArrivo = oraArrivo;
        this.postiTotali = postiTotali;
        this.postiDisponibili = postiDisponibili;
        this.chilometriPercorsi = chilometriPercorsi;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String[] getFermate() {
        return fermate;
    }

    public void setFermate(String[] fermate) {
        this.fermate = fermate;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }

    public Calendar getOraPartenza() {
        return oraPartenza;
    }

    public void setOraPartenza(Calendar oraPartenza) {
        this.oraPartenza = oraPartenza;
    }

    public Calendar[] getOraFermate() {
        return oraFermate;
    }

    public void setOraFermate(Calendar[] oraFermate) {
        this.oraFermate = oraFermate;
    }

    public Calendar getOraArrivo() {
        return oraArrivo;
    }

    public void setOraArrivo(Calendar oraArrivo) {
        this.oraArrivo = oraArrivo;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    public void setPostiTotali(int postiTotali) {
        this.postiTotali = postiTotali;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public double getChilometriPercorsi() {
        return chilometriPercorsi;
    }

    public void setChilometriPercorsi(double chilometriPercorsi) {
        this.chilometriPercorsi = chilometriPercorsi;
    }

    public int numeroFermate(){
        return fermate.length + 2;
    }

    public double ricavoTotale(double prezzoAlChilometroPerPasseggero){
        return chilometriPercorsi * prezzoAlChilometroPerPasseggero * (postiTotali - postiDisponibili);
    }
}


