import java.util.Calendar;

public class Prestiti {
    private Calendar inizioPrestito;
    private Calendar finePrestito;
    private Utenti utente;
    private Pubblicazioni pubblicazione;

    public Prestiti(Calendar inizioPrestito,Calendar finePrestito,Utenti utente,Pubblicazioni pubblicazione){
        this.inizioPrestito = inizioPrestito;
        this.finePrestito = finePrestito;
        this.utente = utente;
        this.pubblicazione = pubblicazione;
    }

    public Calendar getInizioPrestito() {
        return inizioPrestito;
    }

    public void setInizioPrestito(Calendar inizioPrestito) {
        this.inizioPrestito = inizioPrestito;
    }

    public Calendar getFinePrestito() {
        return finePrestito;
    }

    public void setFinePrestito(Calendar finePrestito) {
        this.finePrestito = finePrestito;
    }

    public Utenti getUtente() {
        return utente;
    }

    public void setUtente(Utenti utente) {
        this.utente = utente;
    }

    public Pubblicazioni getPubblicazione() {
        return pubblicazione;
    }

    public void setPubblicazione(Pubblicazioni pubblicazione) {
        this.pubblicazione = pubblicazione;
    }

    @Override
    public String toString(){
        String output = "{";
        output += "\"inizioPrestito\":" + Main.stampaDateOre(inizioPrestito) + ",";
        output += "\"finePrestito\":" + Main.stampaDateOre(finePrestito) + ",";
        output += "\"utente\":" + utente + ",";
        output += "\"pubblicazione\":" + pubblicazione;
        output += "}";
        return output;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(!getClass().getName().equals(obj.getClass().getName())){
            return false;
        }
        Prestiti prestito = (Prestiti)(obj);
        return inizioPrestito.equals(prestito.inizioPrestito) && finePrestito.equals(prestito.finePrestito) && utente.equals(prestito.utente) && pubblicazione.equals(prestito.pubblicazione);
    }
}