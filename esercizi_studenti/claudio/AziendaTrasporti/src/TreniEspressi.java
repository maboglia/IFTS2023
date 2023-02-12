import java.util.Calendar;

public class TreniEspressi extends Treni{
    private int postiTotaliServizioRistorante;
    private int postiDisponibiliServizioRistorante;

    public TreniEspressi(String partenza, String[] fermate, String arrivo, Calendar oraPartenza, Calendar[] oraFermate, Calendar oraArrivo, int postiTotali,int postiDisponibili, double chilometriPercorsi,int postiTotaliServizioRistorante, int postiDisponibiliServizioRistorante) {
        super(partenza, fermate, arrivo, oraPartenza, oraFermate, oraArrivo,postiTotali, postiDisponibili, chilometriPercorsi);
        this.postiTotaliServizioRistorante = postiTotaliServizioRistorante;
        this.postiDisponibiliServizioRistorante = postiDisponibiliServizioRistorante;
    }

    public int getPostiTotaliServizioRistorante() {
        return postiTotaliServizioRistorante;
    }

    public void setPostiTotaliServizioRistorante(int postiTotaliServizioRistorante) {
        this.postiTotaliServizioRistorante = postiTotaliServizioRistorante;
    }

    public int getPostiDisponibiliServizioRistorante() {
        return postiDisponibiliServizioRistorante;
    }

    public void setPostiDisponibiliServizioRistorante(int postiDisponibiliServizioRistorante) {
        this.postiDisponibiliServizioRistorante = postiDisponibiliServizioRistorante;
    }

    public double ricavoTotale(double prezzoAlChilometroPerPasseggero,double prezzoPerPasseggeroRistorante){
        return super.ricavoTotale(prezzoAlChilometroPerPasseggero) + ( prezzoPerPasseggeroRistorante * (postiTotaliServizioRistorante - postiDisponibiliServizioRistorante) );
    }
}